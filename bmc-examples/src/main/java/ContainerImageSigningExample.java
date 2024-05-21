/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.artifacts.ArtifactsClient;
import com.oracle.bmc.artifacts.model.ContainerImage;
import com.oracle.bmc.artifacts.model.ContainerImageSignature;
import com.oracle.bmc.artifacts.model.ContainerImageSignatureCollection;
import com.oracle.bmc.artifacts.model.ContainerImageSignatureSummary;
import com.oracle.bmc.artifacts.model.CreateContainerImageSignatureDetails;
import com.oracle.bmc.artifacts.requests.CreateContainerImageSignatureRequest;
import com.oracle.bmc.artifacts.requests.GetContainerImageRequest;
import com.oracle.bmc.artifacts.requests.ListContainerImageSignaturesRequest;
import com.oracle.bmc.artifacts.responses.CreateContainerImageSignatureResponse;
import com.oracle.bmc.artifacts.responses.GetContainerImageResponse;
import com.oracle.bmc.artifacts.responses.ListContainerImageSignaturesResponse;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.keymanagement.KmsCryptoClient;
import com.oracle.bmc.keymanagement.model.SignDataDetails;
import com.oracle.bmc.keymanagement.model.SignedData;
import com.oracle.bmc.keymanagement.model.VerifiedData;
import com.oracle.bmc.keymanagement.model.VerifyDataDetails;
import com.oracle.bmc.keymanagement.requests.SignRequest;
import com.oracle.bmc.keymanagement.requests.VerifyRequest;
import com.oracle.bmc.keymanagement.responses.SignResponse;
import com.oracle.bmc.keymanagement.responses.VerifyResponse;

import java.util.ArrayList;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.Map;

public class ContainerImageSigningExample {
    /**
     * This sample provides a basic example of how to sign and upload container image signature metadata
     * Or how to verify container image signature metadata.
     *
     * signAndUploadContainerImageSignatureMetadata will:
     *  Build kms crypto client
     *  Generate message and encoded the message
     *  Sign the encoded message with kms crypto client, get the signature
     *  Upload the signature metadata
     *  Return signature
     *
     * getAndVerifyImageSignatureMetadata will:
     *  Fetch and list all container image signature under specific repo path
     *  Filter out the signatures which are not signed by the supplied trusted keys
     *  Among those signed by trusted keys, verify the signature whether it is valid or not.
     *  Return true if contains valid signature, otherwise return false.
     *
     *  The 1st argument is the ocid of the kms key
     *  The 2nd argument is the ocid of the kms key version
     *  The 3rd argument is the algorithm to be used for signing
     *  The 4th argument is the ocid of the compartment in which the container repository exists
     *  The 5th argument is the ocid of the container image
     *  The 6th argument is an user inputted message
     *  The 7th argument is an user defined information about the container image in JSON format
     *  The 8th argument is the compartmentIdInSubtree, when set to true, the hierarchy of compartments is traversed
     *  The 9th argument is the repository name in which the container image exists
     *  The 10th argument is the sha256 digest of the docker image.
     *  The 11th and subsequent argument are the OCIDs of the kmsKeyId used to sign the container image
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        if (args.length < 11) {
            throw new IllegalArgumentException(
                    "Invalid number of arguments provided to the script.");
        }

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();
        ConfigFileAuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        ArtifactsClient artifactsClient = new ArtifactsClient(provider);

        String kmsKeyId = args[0];
        String kmsKeyVersionId = args[1];
        String signingAlgo = args[2];
        String compartmentId = args[3];
        String imageId = args[4];
        String description = args[5];
        String metadata = args[6];

        // Upload Image and Signature Flow
        ContainerImageSignature containerImageSignature =
                signAndUploadContainerImageSignatureMetadata(
                        artifactsClient,
                        provider,
                        kmsKeyId,
                        kmsKeyVersionId,
                        signingAlgo,
                        compartmentId,
                        imageId,
                        description,
                        metadata);
        System.out.println(
                "A signature has been successfully uploaded: "
                        + containerImageSignature.getSignature());

        // Pull Image and Verify Signature Flow
        boolean compartmentIdInSubtree = Boolean.parseBoolean(args[7]);
        String repoName = args[8];
        String imageDigest = args[9];
        ArrayList<String> trustedKeys = new ArrayList<>();
        for (int i = 10; i < args.length; i++) {
            trustedKeys.add(args[i]);
        }
        boolean verified =
                getAndVerifyImageSignatureMetadata(
                        artifactsClient,
                        provider,
                        compartmentId,
                        compartmentIdInSubtree,
                        repoName,
                        imageDigest,
                        trustedKeys);
        if (verified) {
            System.out.println("At least one of the signatures is verified");
        } else {
            System.out.println("None of the signatures is verified");
        }
    }

    /**
     * SignAndUploadContainerImageSignatureMetadata calls KMS to sign the message then calls OCIR to upload the returned signature
     *
     * @param kmsKeyId: The OCID of the kmsKeyId used to sign the container image. eg) ocid1.key.oc1..exampleuniqueID. Max length: 255, Min length:1
     * @param kmsKeyVersionId: The OCID of the kmsKeyVersionId used to sign the container image. eg) ocid1.keyversion.oc1..exampleuniqueID. Max length: 255, Min length:1
     * @param signingAlgorithm: The algorithm to be used for signing. These are the only supported signing algorithms for container images.
     * eg. - SHA_224_RSA_PKCS_PSS
     *     - SHA_256_RSA_PKCS_PSS
     *     - SHA_384_RSA_PKCS_PSS
     *     - SHA_512_RSA_PKCS_PSS
     * @param compartmentId: The OCID of the compartment in which the container repository exists. eg) ocid1.compartment.oc1..exampleuniqueID. Max length: 100, Min length: 1
     * @param imageId: The OCID of the container image. eg) ocid1.containerimage.oc1..exampleuniqueID. Max length: 255, Min length:1
     * @param description: An user inputted message.
     * @param metadata:  An user defined information about the container image in JSON format eg) {"buildNumber":"123"}
     * @return The signed container image signature metadata, type is ContainerImageSignature
     * @throws Exception
     */
    public static ContainerImageSignature signAndUploadContainerImageSignatureMetadata(
            ArtifactsClient artifactsClient,
            ConfigFileAuthenticationDetailsProvider provider,
            String kmsKeyId,
            String kmsKeyVersionId,
            String signingAlgorithm,
            String compartmentId,
            String imageId,
            String description,
            String metadata)
            throws Exception {
        CreateContainerImageSignatureDetails.SigningAlgorithm signingAlgoOcir =
                CreateContainerImageSignatureDetails.SigningAlgorithm.create(signingAlgorithm);
        SignDataDetails.SigningAlgorithm signingAlgoKms =
                SignDataDetails.SigningAlgorithm.create(signingAlgorithm);
        Region region = provider.getRegion();

        // Create KMS client
        KmsCryptoClient kmsCryptoClient = buildVaultCryptoClient(provider, kmsKeyId, region);

        // Get container image metadata
        ContainerImage containerImage = getContainerImageMetadata(artifactsClient, imageId);

        // Generate message
        ObjectMapper objectMapper = com.oracle.bmc.http.Serialization.getObjectMapper();
        Map<String, Object> message = new LinkedHashMap<>();
        message.put("description", description);
        message.put("imageDigest", containerImage.getDigest());
        message.put("kmsKeyId", kmsKeyId);
        message.put("kmsKeyVersionId", kmsKeyVersionId);
        message.put("metadata", metadata);
        message.put("region", region.getRegionId());
        message.put("repositoryName", containerImage.getRepositoryName());
        message.put("signingAlgorithm", signingAlgorithm);

        String jsonString = objectMapper.writeValueAsString(message);
        String encodedJson = Base64.getEncoder().encodeToString(jsonString.getBytes());

        // Sign image digest
        SignedData signedData =
                signContainerImage(
                        kmsCryptoClient, encodedJson, kmsKeyId, kmsKeyVersionId, signingAlgoKms);

        // Upload signature metadata
        return uploadSignatureMetadata(
                artifactsClient,
                compartmentId,
                imageId,
                kmsKeyId,
                kmsKeyVersionId,
                signingAlgoOcir,
                encodedJson,
                signedData.getSignature());
    }

    /**
     * GetAndVerifyImageSignatureMetadata calls OCIR to list all the signatures satisfying the user provided criterion then
     * calls KMS to verify the returned signatures
     *
     * @param compartmentId: The OCID of the compartment in which the container repository exists. eg) ocid1.compartment.oc1..exampleuniqueID. MAX length: 100, MIN length 1
     * @param compartmentIdInSubtree: When set to true, the hierarchy of compartments is traversed
     * @param repoName: : The repository name in which the container image exists eg) busybox
     * @param imageDigest: The sha256 digest of the docker image. eg) sha256:12345
     * @param trustedKeys: List of OCIDs of the kmsKeyId used to sign the container image.
     * @return Boolean to indicate if any of the signatures of the container image is verified
     */
    public static boolean getAndVerifyImageSignatureMetadata(
            ArtifactsClient artifactsClient,
            ConfigFileAuthenticationDetailsProvider provider,
            String compartmentId,
            Boolean compartmentIdInSubtree,
            String repoName,
            String imageDigest,
            ArrayList<String> trustedKeys) {
        Region region = provider.getRegion();
        return getAndVerifyImageSignatureMetadataHelper(
                artifactsClient,
                provider,
                region,
                compartmentId,
                compartmentIdInSubtree,
                repoName,
                imageDigest,
                trustedKeys,
                null);
    }

    private static boolean getAndVerifyImageSignatureMetadataHelper(
            ArtifactsClient artifactsClient,
            AuthenticationDetailsProvider provider,
            Region region,
            String compartmentId,
            boolean compartmentIdInSubtree,
            String repoName,
            String imageDigest,
            ArrayList<String> trustedKeys,
            String page) {
        try {
            Pair pair =
                    listContainerImageSignaturesWithRepoPath(
                            artifactsClient,
                            compartmentId,
                            compartmentIdInSubtree,
                            repoName,
                            imageDigest,
                            page);
            ContainerImageSignatureCollection signatureCollection =
                    pair.getContainerImageSignatureCollection();
            String nextPage = pair.getPage();

            // Filter out the keys
            ArrayList<ContainerImageSignatureSummary> containerImageSignatureSummaryList =
                    filterItemByTrustedKeys(signatureCollection, trustedKeys);
            if (containerImageSignatureSummaryList.size() == 0) {
                throw new Exception(
                        "No signature in the image was signed by the supplied trusted keys.");
            }

            // Verify signature
            boolean verified =
                    verifySignatures(provider, region, containerImageSignatureSummaryList);
            if (!verified && nextPage != null) {
                return getAndVerifyImageSignatureMetadataHelper(
                        artifactsClient,
                        provider,
                        region,
                        compartmentId,
                        compartmentIdInSubtree,
                        repoName,
                        imageDigest,
                        trustedKeys,
                        nextPage);
            }
            return verified;
        } catch (Exception e) {
            return false;
        }
    }

    private static boolean verifySignatures(
            AuthenticationDetailsProvider provider,
            Region region,
            ArrayList<ContainerImageSignatureSummary> signatureSummaryList)
            throws Exception {
        for (ContainerImageSignatureSummary signatureSummary : signatureSummaryList) {
            if (signatureSummary != null) {
                KmsCryptoClient vaultCryptoClient =
                        buildVaultCryptoClient(provider, signatureSummary.getKmsKeyId(), region);
                VerifyDataDetails.SigningAlgorithm algorithm =
                        VerifyDataDetails.SigningAlgorithm.create(
                                signatureSummary.getSigningAlgorithm().getValue());
                if (algorithm == null) {
                    throw new Exception(
                            "The verify data details signing algorithm is not valid. Please check.");
                }
                VerifiedData verifiedData =
                        verifySignature(
                                vaultCryptoClient,
                                signatureSummary.getMessage(),
                                signatureSummary.getSignature(),
                                signatureSummary.getKmsKeyId(),
                                signatureSummary.getKmsKeyVersionId(),
                                algorithm);
                if (verifiedData.getIsSignatureValid()) return true;
            }
        }
        return false;
    }

    private static VerifiedData verifySignature(
            KmsCryptoClient kmsCryptoClient,
            String message,
            String signature,
            String keyId,
            String keyVersionId,
            VerifyDataDetails.SigningAlgorithm signingAlgorithm) {
        VerifyDataDetails verifyDataDetails =
                VerifyDataDetails.builder()
                        .keyId(keyId)
                        .keyVersionId(keyVersionId)
                        .signingAlgorithm(signingAlgorithm)
                        .message(message)
                        .signature(signature)
                        .build();
        VerifyRequest verifyRequest =
                VerifyRequest.builder().verifyDataDetails(verifyDataDetails).build();
        VerifyResponse verifyResponse = kmsCryptoClient.verify(verifyRequest);

        return verifyResponse.getVerifiedData();
    }

    private static ArrayList<ContainerImageSignatureSummary> filterItemByTrustedKeys(
            ContainerImageSignatureCollection signatureCollection, ArrayList<String> trustedKeys) {
        ArrayList<ContainerImageSignatureSummary> ret = new ArrayList<>();
        for (ContainerImageSignatureSummary containerImageSignatureSummary :
                signatureCollection.getItems()) {
            if (isTrustedKey(containerImageSignatureSummary.getKmsKeyId(), trustedKeys)) {
                ret.add(containerImageSignatureSummary);
            }
        }
        return ret;
    }

    private static boolean isTrustedKey(String key, ArrayList<String> trustedKeys) {
        for (String trustKey : trustedKeys) {
            if (key.equals(trustKey)) {
                return true;
            }
        }
        return false;
    }

    private static Pair listContainerImageSignaturesWithRepoPath(
            ArtifactsClient artifactsClient,
            String compartmentId,
            Boolean compartmentIdInSubtree,
            String repoName,
            String imageDigest,
            String page)
            throws Exception {
        ListContainerImageSignaturesRequest listContainerImageSignaturesRequest =
                ListContainerImageSignaturesRequest.builder()
                        .compartmentId(compartmentId)
                        .compartmentIdInSubtree(compartmentIdInSubtree)
                        .repositoryName(repoName)
                        .imageDigest(imageDigest)
                        .page(page)
                        .build();
        ListContainerImageSignaturesResponse listContainerImageSignaturesResponse =
                artifactsClient.listContainerImageSignatures(listContainerImageSignaturesRequest);
        if (listContainerImageSignaturesResponse.get__httpStatusCode__() != 200)
            throw new Exception(
                    "Failed to list the signatures of repository_name "
                            + repoName
                            + "image_digest"
                            + imageDigest
                            + "status_code"
                            + listContainerImageSignaturesResponse.get__httpStatusCode__());

        return new Pair(
                listContainerImageSignaturesResponse.getContainerImageSignatureCollection(),
                listContainerImageSignaturesResponse.getOpcNextPage());
    }

    private static KmsCryptoClient buildVaultCryptoClient(
            AuthenticationDetailsProvider provider, String keyId, Region region) throws Exception {
        String[] splitList = keyId.split("\\.");

        if (splitList.length < 6)
            throw new Exception(
                    "Failed to split key ocid. Please check the kms_key_id is correct.");
        String vaultExt = splitList[4];
        String secondLevelDomain = region.getRealm().getSecondLevelDomain();
        String cryptoEndpoint =
                "https://"
                        + vaultExt
                        + "-crypto.kms."
                        + region.getRegionId()
                        + "."
                        + secondLevelDomain;

        KmsCryptoClient kmsCryptoClient = new KmsCryptoClient(provider);
        kmsCryptoClient.setEndpoint(cryptoEndpoint);

        return kmsCryptoClient;
    }

    private static SignedData signContainerImage(
            KmsCryptoClient kmsCryptoClient,
            String encodedJson,
            String keyId,
            String keyVersionId,
            SignDataDetails.SigningAlgorithm signingAlgoKms) {
        SignDataDetails signDataDetails =
                SignDataDetails.builder()
                        .message(encodedJson)
                        .keyId(keyId)
                        .keyVersionId(keyVersionId)
                        .signingAlgorithm(signingAlgoKms)
                        .messageType(SignDataDetails.MessageType.Raw)
                        .build();
        SignRequest signRequest = SignRequest.builder().signDataDetails(signDataDetails).build();
        SignResponse signResponse = kmsCryptoClient.sign(signRequest);

        return signResponse.getSignedData();
    }

    private static ContainerImageSignature uploadSignatureMetadata(
            ArtifactsClient artifactsClient,
            String compartmentId,
            String imageId,
            String keyId,
            String keyVersionId,
            CreateContainerImageSignatureDetails.SigningAlgorithm signingAlgoOcir,
            String message,
            String signature)
            throws Exception {
        CreateContainerImageSignatureDetails signatureDetails =
                CreateContainerImageSignatureDetails.builder()
                        .compartmentId(compartmentId)
                        .imageId(imageId)
                        .kmsKeyId(keyId)
                        .kmsKeyVersionId(keyVersionId)
                        .signingAlgorithm(signingAlgoOcir)
                        .message(message)
                        .signature(signature)
                        .build();
        CreateContainerImageSignatureRequest createContainerImageSignatureRequest =
                CreateContainerImageSignatureRequest.builder()
                        .createContainerImageSignatureDetails(signatureDetails)
                        .build();
        CreateContainerImageSignatureResponse createContainerImageSignatureResponse =
                artifactsClient.createContainerImageSignature(createContainerImageSignatureRequest);

        if (createContainerImageSignatureResponse.get__httpStatusCode__() != 200)
            throw new Exception(
                    "Failed to upload the signature to OCI Registry. Status code: "
                            + createContainerImageSignatureResponse.get__httpStatusCode__());
        return createContainerImageSignatureResponse.getContainerImageSignature();
    }

    private static ContainerImage getContainerImageMetadata(
            ArtifactsClient artifactsClient, String imageId) {
        GetContainerImageRequest getContainerImageRequest =
                GetContainerImageRequest.builder().imageId(imageId).build();
        GetContainerImageResponse getContainerImageResponse =
                artifactsClient.getContainerImage(getContainerImageRequest);

        return getContainerImageResponse.getContainerImage();
    }

    private static class Pair {
        ContainerImageSignatureCollection containerImageSignatureCollection;
        String page;

        private Pair(
                ContainerImageSignatureCollection containerImageSignatureCollection, String page) {
            this.containerImageSignatureCollection = containerImageSignatureCollection;
            this.page = page;
        }

        private ContainerImageSignatureCollection getContainerImageSignatureCollection() {
            return containerImageSignatureCollection;
        }

        private String getPage() {
            return page;
        }
    }
}
