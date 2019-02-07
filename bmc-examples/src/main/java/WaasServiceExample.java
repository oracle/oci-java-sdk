/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Region;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.ConfigFileReader.ConfigFile;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.waas.WaasClient;
import com.oracle.bmc.waas.WaasPaginators;
import com.oracle.bmc.waas.model.Captcha;
import com.oracle.bmc.waas.model.Certificate;
import com.oracle.bmc.waas.model.CreateCertificateDetails;
import com.oracle.bmc.waas.model.CreateWaasPolicyDetails;
import com.oracle.bmc.waas.model.LifecycleStates;
import com.oracle.bmc.waas.model.Origin;
import com.oracle.bmc.waas.model.PolicyConfig;
import com.oracle.bmc.waas.model.WaasPolicy;
import com.oracle.bmc.waas.model.WaasPolicySummary;
import com.oracle.bmc.waas.requests.CreateCertificateRequest;
import com.oracle.bmc.waas.requests.CreateWaasPolicyRequest;
import com.oracle.bmc.waas.requests.DeleteCertificateRequest;
import com.oracle.bmc.waas.requests.DeleteWaasPolicyRequest;
import com.oracle.bmc.waas.requests.GetCertificateRequest;
import com.oracle.bmc.waas.requests.GetWaasPolicyRequest;
import com.oracle.bmc.waas.requests.GetWorkRequestRequest;
import com.oracle.bmc.waas.requests.ListCaptchasRequest;
import com.oracle.bmc.waas.requests.ListWaasPoliciesRequest;
import com.oracle.bmc.waas.requests.UpdateCaptchasRequest;
import com.oracle.bmc.waas.responses.CreateCertificateResponse;
import com.oracle.bmc.waas.responses.CreateWaasPolicyResponse;
import com.oracle.bmc.waas.responses.GetWaasPolicyResponse;
import com.oracle.bmc.waas.responses.GetWorkRequestResponse;
import com.oracle.bmc.waas.responses.ListCaptchasResponse;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class demonstrates how to use the WAAS service in the Java SDK. This will cover:
 *
 * <ul>
 *   <li>Creating, retrieving, listing, and deleting WAAS policies</li>
 *   <li>Uploading, retrieving, listing, and deleting SSL certificates</li>
 *   <li>Creating and updating WAF protection rules</li>
 *   <li>Updating challenges (CAPTCHAs, device fingerprints, etc.)</li>
 * </ul>
 *
 * This class makes the following assumptions:
 * <ul>
 *   <li>
 *     The configuration file used by service clients will be sourced from the default
 *     location (~/.oci/config) and the DEFAULT profile will be used.
 *   </li>
 *   <li>
 *     You have the appropriate permissions to create, update, read, and
 *     inspect WAAS policies in the compartment you've specified.
 *   </li>
 * </ul>
 */
public class WaasServiceExample {

    /**
     * Configuration for the example, replace these with your own values.
     */
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";
    private static final String COMPARTMENT_ID = "ocid1.compartment.oc1...aaaaaa";
    private static final String DOMAIN = "www.mydomain.test";
    private static final String ORIGIN = "192.168.2.1";
    private static final String KEY_PATH = "path/to/rsa_key";
    private static final String CERT_PATH = "path/to/certificate";
    private static final String CAPTCHA_TITLE = "My CAPTCHA";
    private static final String CAPTCHA_URL = "/path/to/protect/with/captcha";
    private static final String CAPTCHA_FAILURE_MESSAGE = "Sorry, you failed the CAPTCHA!";
    private static final String CAPTCHA_SUBMIT_LABEL = "Check my CAPTCHA";

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     * <ul>
     *   <li>
     *       The OCID of the compartment where the WAAS policy will be created.
     *       <p>
     *         <b>Note:</b> Your tenancy OCID will be read
     *         from your configuration file
     *       </p>
     *   </li>
     *   <li>
     *       The web application domain that will be pointed to the CNAME of the
     *       Web Application Firewall.
     *   </li>
     *   <li>
     *       The origin domain that the Web Application Firewall will forward traffic to.
     *   </li>
     *   <li>
     *       <b>Optionally:</b> The path to the PEM encoded RSA private key used by the
     *        Web Application Firewall to accept HTTPS traffic for your domain
     *   </li>
     *   <li>
     *       <b>Optionally:</b> The path to the PEM encoded SSL certificate used by the
     *        Web Application Firewall to accept HTTPS traffic for your domain
     *   </li>
     * </ul>
     *
     * The request flow should look like the following:
     *             User -> `domain` -> OCI Web Application Firewall -> `origin`
     */
    public static void main(String[] args) throws Exception {
        final ConfigFile configFile = ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);
        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        final WaasClient waasClient = new WaasClient(provider);
        final IdentityClient identityClient = new IdentityClient(provider);

        WaasPolicy policy = null;
        Certificate certificate = null;
        try {
            String certificateId = null;

            if (KEY_PATH != null && KEY_PATH != null) {
                String keyData =
                        new String(Files.readAllBytes(Paths.get(KEY_PATH)), StandardCharsets.UTF_8);
                String certData =
                        new String(
                                Files.readAllBytes(Paths.get(CERT_PATH)), StandardCharsets.UTF_8);

                certificate = uploadCertificate(waasClient, COMPARTMENT_ID, keyData, certData);

                certificateId = certificate.getId();
            }

            policy = createPolicy(waasClient, COMPARTMENT_ID, DOMAIN, ORIGIN, certificateId);

            listPolicies(waasClient, COMPARTMENT_ID, DOMAIN);

            addCaptcha(
                    waasClient,
                    policy.getId(),
                    CAPTCHA_TITLE,
                    CAPTCHA_URL,
                    60,
                    CAPTCHA_FAILURE_MESSAGE,
                    CAPTCHA_SUBMIT_LABEL);

            listCaptchas(waasClient, policy.getId());
        } finally {
            if (policy != null) {
                deletePolicy(waasClient, policy.getId());
            }
            if (certificate != null) {
                deleteCertificate(waasClient, certificate.getId());
            }

            waasClient.close();
            identityClient.close();
        }
    }

    /**
     * Uploads an SSL Certificate.
     *
     * @param waasClient the client used to communicate with the WAAS service
     * @param compartmentId the OCID of the compartment that owns the certificate
     * @param privateKey the PEM encoded RSA private key used to encrypt traffic
     * @param certificate the PEM encoded X.509 certificate(s) used to encrypt traffic; may be a concatenation of the
     *                    leaf certificate followed by an intermediate certificate if necessary
     *
     * @return the uploaded certificate
     */
    private static Certificate uploadCertificate(
            final WaasClient waasClient,
            final String compartmentId,
            final String privateKey,
            final String certificate) {

        System.out.println("Uploading SSL certificate");
        System.out.println("=======================");

        final CreateCertificateResponse createResponse =
                waasClient.createCertificate(
                        CreateCertificateRequest.builder()
                                .createCertificateDetails(
                                        CreateCertificateDetails.builder()
                                                .compartmentId(compartmentId)
                                                .privateKeyData(privateKey)
                                                .certificateData(certificate)
                                                .build())
                                .build());

        return createResponse.getCertificate();
    }

    /**
     * Creates a WAAS policy and waits for it to be come available.
     *
     * @param waasClient the client used to communicate with the WAAS service
     * @param compartmentId the OCID of the compartment where the policy will be created
     * @param domain the web application domain
     *
     * @return the created WaasPolicy
     */
    private static WaasPolicy createPolicy(
            final WaasClient waasClient,
            final String compartmentId,
            final String domain,
            final String origin,
            final String certificateId)
            throws Exception {

        System.out.println("Creating WAAS policy");
        System.out.println("=======================");

        Map<String, Origin> origins = new HashMap<>();
        origins.put(origin, Origin.builder().uri(origin).httpPort(80).httpsPort(443).build());

        CreateWaasPolicyDetails.Builder policyDetails =
                CreateWaasPolicyDetails.builder()
                        .compartmentId(compartmentId)
                        .domain(domain)
                        .origins(origins);

        if (certificateId != null) {
            policyDetails.policyConfig(PolicyConfig.builder().certificateId(certificateId).build());
        }

        final CreateWaasPolicyResponse createResponse =
                waasClient.createWaasPolicy(
                        CreateWaasPolicyRequest.builder()
                                .createWaasPolicyDetails(policyDetails.build())
                                .build());

        System.out.println("Wait for policy creation to finish.");

        final String workRequestId = createResponse.getOpcWorkRequestId();

        GetWorkRequestRequest getWorkRequestRequest =
                GetWorkRequestRequest.builder().workRequestId(workRequestId).build();

        GetWorkRequestResponse getWorkRequestResponse =
                waasClient.getWaiters().forWorkRequest(getWorkRequestRequest).execute();

        // The first resource in the CreateWaasPolicy work request should be the policy.
        String policyId =
                getWorkRequestResponse.getWorkRequest().getResources().get(0).getIdentifier();

        final GetWaasPolicyResponse getPolicyResponse =
                waasClient
                        .getWaiters()
                        .forWaasPolicy(
                                GetWaasPolicyRequest.builder().waasPolicyId(policyId).build(),
                                LifecycleStates.Active)
                        .execute();

        System.out.println(
                "Waited for policy to become available: "
                        + getPolicyResponse.getWaasPolicy().toString());
        System.out.println();

        return getPolicyResponse.getWaasPolicy();
    }

    /**
     * Lists WAAS policies. The list will be filtered by domain iff domain is not null.
     *
     * @param waasClient the client used to communicate with the WAAS service
     * @param compartmentId the OCID of the compartment to list resources in
     * @param domain the web application domain to filter by
     */
    private static void listPolicies(
            final WaasClient waasClient, final String compartmentId, final String domain) {

        System.out.println("Listing policies");
        System.out.println("=======================");

        ListWaasPoliciesRequest listPoliciesRequest =
                ListWaasPoliciesRequest.builder().compartmentId(compartmentId).build();

        Iterable<WaasPolicySummary> policyRecordIterator =
                waasClient.getPaginators().listWaasPoliciesRecordIterator(listPoliciesRequest);

        for (WaasPolicySummary summary : policyRecordIterator) {
            if (domain == null || summary.getDomain().equals(domain)) {
                System.out.println(summary);
            }
        }
    }

    /**
     * Deletes a WAAS policy and waits for it to be deleted
     *
     * @param waasClient the client used to communicate with the WAAS service
     * @param policyId the policy OCID to delete
     */
    private static void deletePolicy(final WaasClient waasClient, final String policyId)
            throws Exception {

        waasClient.deleteWaasPolicy(
                DeleteWaasPolicyRequest.builder().waasPolicyId(policyId).build());

        waasClient
                .getWaiters()
                .forWaasPolicy(
                        GetWaasPolicyRequest.builder().waasPolicyId(policyId).build(),
                        LifecycleStates.Deleted)
                .execute();

        System.out.println("Deleted policy");
        System.out.println();
    }

    /**
     * Deletes the uploaded SSL certificate
     *
     * @param waasClient the client used to communicate with the WAAS service
     * @param certificateId the certificate OCID to delete
     */
    private static void deleteCertificate(final WaasClient waasClient, final String certificateId)
            throws Exception {

        waasClient.deleteCertificate(
                DeleteCertificateRequest.builder().certificateId(certificateId).build());

        waasClient
                .getWaiters()
                .forCertificate(
                        GetCertificateRequest.builder().certificateId(certificateId).build(),
                        LifecycleStates.Deleted)
                .execute();

        System.out.println("Deleted certificate");
        System.out.println();
    }

    /**
     * Creates a new CAPTCHA for the WAAS policy
     *
     * @param waasClient the client used to communicate with the WAAS service
     * @param policyId the policy OCID
     * @param title text displayed as a header on the CAPTCHA page
     * @param url the URL to protect with the CAPTCHA
     * @param expires the duration, in seconds, that the CAPTCHA response is valid
     * @param failureMessage text displayed to user when the CAPTCHA challenge failed
     * @param submitLabel text displayed on the button the user clicks to submit the challenge
     *
     * @return the created CAPTCHA
     */
    private static Captcha addCaptcha(
            final WaasClient waasClient,
            final String policyId,
            final String title,
            final String url,
            final Integer expires,
            final String failureMessage,
            final String submitLabel) {

        Captcha captcha =
                Captcha.builder()
                        .title(title)
                        .url(url)
                        .sessionExpirationInSeconds(expires)
                        .failureMessage(failureMessage)
                        .submitLabel(submitLabel)
                        .build();

        List<Captcha> captchas = new ArrayList<>();
        captchas.add(captcha);

        waasClient.updateCaptchas(UpdateCaptchasRequest.builder().captchas(captchas).build());

        return captcha;
    }

    /**
     * List CAPTCHAs for a WAAS policy
     *
     * @param waasClient the client used to communicate with the WAAS service
     * @param policyId the policy OCID to delete
     */
    private static void listCaptchas(final WaasClient waasClient, final String policyId) {
        WaasPaginators paginators = new WaasPaginators(waasClient);

        Iterable<Captcha> captchas =
                paginators.listCaptchasRecordIterator(
                        ListCaptchasRequest.builder().waasPolicyId(policyId).build());

        for (Captcha captcha : captchas) {
            System.out.println(captcha);
        }
    }
}
