/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.signing.internal;

import java.io.InputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.interfaces.RSAPrivateKey;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TimeZone;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.hash.Hashing;
import com.oracle.bmc.http.internal.RestClientFactory;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.http.signing.SigningStrategy;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Implementation of the {@linkplain RequestSigner} interface
 * <p>
 * This contains the main code that is used for signing a request
 */
@Immutable
@Slf4j
public class RequestSignerImpl implements RequestSigner {
    private static final SignatureSigner SIGNER = new SignatureSigner();

    private final KeySupplier<RSAPrivateKey> keySupplier;
    private final SigningConfiguration signingConfiguration;
    private final Supplier<String> keyIdSupplier;

    /**
     * Construct the RequestSigner with the specified KeySupplier. This will be
     * used to get keys for doing the signing.
     *
     * @param keySupplier
     *            A key supplier that will be used for signing the request
     * @param signingStrategy
     *            The signing strategy to determine what headers to use
     * @param keyIdSupplier
     *            A keyId supplier that will be used for signing the request
     */
    public RequestSignerImpl(
            @Nonnull final KeySupplier<RSAPrivateKey> keySupplier,
            @Nonnull final SigningStrategy signingStrategy,
            @Nonnull final Supplier<String> keyIdSupplier) {
        this(keySupplier, toSigningConfiguration(signingStrategy), keyIdSupplier);
    }

    /**
     * Construct the RequestSigner with the specified KeySupplier. This will be
     * used to get keys for doing the signing.
     *
     * @param keySupplier
     *            A key supplier that will be used for signing the request
     * @param signingConfiguration
     *            The signing configuration to determine what headers to use
     * @param keyIdSupplier
     *            A keyId supplier that will be used for signing the request
     */
    public RequestSignerImpl(
            @Nonnull final KeySupplier<RSAPrivateKey> keySupplier,
            @Nonnull final SigningConfiguration signingConfiguration,
            @Nonnull final Supplier<String> keyIdSupplier) {
        this.keySupplier = Preconditions.checkNotNull(keySupplier);
        this.signingConfiguration = Preconditions.checkNotNull(signingConfiguration);
        this.keyIdSupplier = Preconditions.checkNotNull(keyIdSupplier);
    }

    private static SigningConfiguration toSigningConfiguration(SigningStrategy signingStrategy) {
        return new SigningConfiguration(
                signingStrategy.getHeadersToSign(),
                signingStrategy.isSkipContentHeadersForStreamingPutRequests());
    }

    @Override
    public Map<String, String> signRequest(
            @Nonnull final URI uri,
            @Nonnull final String httpMethod,
            @Nonnull final Map<String, List<String>> headers,
            @Nullable final Object body) {

        return signRequest(
                Algorithm.RSAPSS256,
                uri,
                httpMethod,
                headers,
                body,
                SignedRequestVersion.getLatestVersion().getVersionName());
    }

    private Map<String, String> signRequest(
            final Algorithm algorithm,
            final URI uri,
            final String httpMethod,
            final Map<String, List<String>> headers,
            final Object body,
            final String versionName) {
        Preconditions.checkArgument(null != algorithm, "algorithm must not be null");
        Preconditions.checkArgument(null != uri, "uri must not be null");
        Preconditions.checkArgument(
                !StringUtils.isBlank(httpMethod), "httpMethod must not be null or empty");
        Preconditions.checkArgument(null != headers, "headers must not be null");
        Preconditions.checkArgument(
                !StringUtils.isBlank(versionName), "versionName must not be null or empty");

        try {
            String keyId = keyIdSupplier.get();
            Version version = validateVersion(versionName, algorithm);
            final RSAPrivateKey key = getPrivateKey(keyId);
            final String lowerHttpMethod = httpMethod.toLowerCase(Locale.ENGLISH);
            final String path = extractPath(uri);

            // 1) get the required headers that must be signed
            final List<String> requiredHeaders = getRequiredSigningHeaders(lowerHttpMethod);

            // 2) copy of original headers as case-insensitive, do not modify input map
            final Map<String, String> existingHeaders = ignoreCaseHeaders(headers);

            // 3) calculate any required headers that are missing
            final Map<String, String> missingHeaders =
                    calculateMissingHeaders(
                            lowerHttpMethod, uri, existingHeaders, body, requiredHeaders);

            // 4) create a map containing both existing + missing headers
            final Map<String, String> allHeaders = new HashMap<>();
            allHeaders.putAll(existingHeaders);
            allHeaders.putAll(missingHeaders);

            // 5) calculate the signature
            final String stringToSign =
                    calculateStringToSign(lowerHttpMethod, path, allHeaders, requiredHeaders);
            final String signature = sign(key, algorithm, stringToSign);

            // 6) calculate the auth header and add to all the missing headers that should be added
            final String authorizationHeader =
                    calculateAuthorizationHeader(
                            keyId,
                            lowerHttpMethod,
                            signature,
                            algorithm,
                            version.getVersionName(),
                            requiredHeaders);
            missingHeaders.put(Constants.AUTHORIZATION_HEADER, authorizationHeader);

            return missingHeaders;
        } catch (final Exception ex) {
            LOG.debug("Could not sign request", ex);
            throw new SignedRequestException(ex);
        }
    }

    private Version validateVersion(String version, Algorithm algorithm) {
        // TODO: throw exception for now so it's re-thrown as
        // SignedRequestException
        // revisit to return signing result with error info without having
        // caller dealing with exception

        final Optional<SignedRequestVersion> oVersion = SignedRequestVersion.getVersion(version);
        if (!oVersion.isPresent()) {
            LOG.debug("Invalid version number '{}'", version);
            throw new RuntimeException("Invalid version number");
        }
        final Version srVersion = oVersion.get();

        final Optional<Version.Error> errorOpt = srVersion.validateAlgorithm(algorithm);
        if (errorOpt.isPresent()) {
            LOG.debug("Signature version rule validation failed '{}'", errorOpt.get());
            throw new RuntimeException("Version validation fails " + errorOpt.get());
        }
        return srVersion;
    }

    private RSAPrivateKey getPrivateKey(String keyId) {
        Optional<RSAPrivateKey> keyOptional = keySupplier.getKey(keyId);

        // TODO: throw exception for now so it's re-thrown as
        // SignedRequestException
        // might be better to return signing result with error info without
        // having caller dealing with exception
        if (!keyOptional.isPresent()) {
            LOG.debug("Could not find private key associated with keyId '{}'", keyId);
            throw new RuntimeException("Could not find private key");
        }
        return keyOptional.get();
    }

    private Map<String, String> ignoreCaseHeaders(final Map<String, List<String>> originalHeaders) {
        Map<String, String> transformedMap = new HashMap<>();
        for (Entry<String, List<String>> entry : originalHeaders.entrySet()) {
            if (entry.getValue().size() != 1) {
                throw new RuntimeException(
                        "Expecting exactly one value for header " + entry.getKey());
            }
            transformedMap.put(entry.getKey().toLowerCase(Locale.ROOT), entry.getValue().get(0));
        }
        return transformedMap;
    }

    private static String extractPath(URI uri) {
        String path = uri.getRawPath();
        String query = uri.getRawQuery();
        if (query != null && !query.trim().isEmpty()) {
            path = path + "?" + query;
        }
        return path;
    }

    private Map<String, String> calculateMissingHeaders(
            final String httpMethod,
            final URI uri,
            final Map<String, String> existingHeaders,
            final Object body,
            final List<String> requiredHeaders) {
        // all of the required headers that are currently missing
        Map<String, String> missingHeaders = new HashMap<>();

        if (isRequiredHeaderMissing(Constants.DATE, requiredHeaders, existingHeaders)) {
            missingHeaders.put(Constants.DATE, createFormatter().format(new Date()));
        }

        if (isRequiredHeaderMissing(Constants.HOST, requiredHeaders, existingHeaders)) {
            missingHeaders.put(Constants.HOST, uri.getHost());
        }

        boolean isPost = httpMethod.equals("post");
        boolean isPut = httpMethod.equals("put");
        // for post and put, also verify the presence of content headers
        if (!(isPut || isPost)) {
            // Asking to sign a body on GET/DELETE/HEAD is not allowed
            if (body != null) {
                throw new RuntimeException("MUST NOT send body on non-POST/PUT request");
            } else {
                // nothing left to do
                return missingHeaders;
            }
        }

        // the one exception for the below is when doing a PUT if the body is an InputStream
        // and the configuration allows it to be skipped
        if (isPut) {
            if (body instanceof InputStream) {
                if (signingConfiguration.skipContentHeadersForStreamingPutRequests) {
                    return missingHeaders;
                } else {
                    // TODO: support DuplicatableInputStream to be able to calculate length/sha-256
                    throw new IllegalArgumentException(
                            "Streaming body not supported for signing strategy");
                }
            }
        }

        // supply content-type, content-length and x-content-sha256 if missing (PUT and POST only)
        if (requiredHeaders.contains(Constants.CONTENT_TYPE)) {
            // While we don't always sign content-type, services always
            // expect application/json (except if we're sending an input stream)
            // NOTE: this should never happen as EntityFactory ensures all
            // requests have this header, so log a warning
            if (!existingHeaders.containsKey(Constants.CONTENT_TYPE)) {
                LOG.warn("Missing 'content-type' header, defaulting to 'application/json'");
                missingHeaders.put(Constants.CONTENT_TYPE, Constants.JSON_CONTENT_TYPE);
            } else if (!existingHeaders
                    .get(Constants.CONTENT_TYPE)
                    .toLowerCase(Locale.ROOT)
                    .equals(Constants.JSON_CONTENT_TYPE)) {
                throw new IllegalArgumentException(
                        "Only 'application/json' supported for content type");
            }
        }
        byte[] bodyBytes;
        try {
            bodyBytes = getJsonBody(body);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException("Unable to process JSON body", e);
        }

        if (isRequiredHeaderMissing(Constants.CONTENT_LENGTH, requiredHeaders, existingHeaders)) {
            missingHeaders.put(Constants.CONTENT_LENGTH, Integer.toString(bodyBytes.length));
        }
        if (isRequiredHeaderMissing(Constants.X_CONTENT_SHA256, requiredHeaders, existingHeaders)) {
            missingHeaders.put(Constants.X_CONTENT_SHA256, calculateBodySHA256(bodyBytes));
        }

        return missingHeaders;
    }

    private static boolean isRequiredHeaderMissing(
            String headerName, List<String> requiredHeaders, Map<String, String> existingHeaders) {
        return requiredHeaders.contains(headerName) && !existingHeaders.containsKey(headerName);
    }

    private static String calculateBodySHA256(final byte[] body) {
        byte[] hash = Hashing.sha256().hashBytes(body).asBytes();
        return base64Encode(hash);
    }

    private String calculateStringToSign(
            String httpMethod,
            String path,
            Map<String, String> allHeaders,
            List<String> requiredHeaders) {

        // Header name and value are separated with ": " and each (name, value)
        // pair is separated with "\n"
        List<String> signatureParts = new ArrayList<>();

        // Use the order from requiredHeaders, which must match the order
        // when creating the authorization header
        for (String headerName : requiredHeaders) {
            String headerValue = allHeaders.get(headerName);

            if (headerName.equals(Constants.REQUEST_TARGET)) {
                // Manually compute pseudo-header (request-target), since it
                // won't be in headers
                headerValue = httpMethod + " " + path;
            }
            signatureParts.add(String.format("%s: %s", headerName, headerValue));
        }

        return StringUtils.join(signatureParts, "\n");
    }

    private String sign(RSAPrivateKey key, Algorithm algorithm, String stringToSign) {
        byte[] signature =
                SIGNER.sign(
                        key, stringToSign.getBytes(StandardCharsets.UTF_8), algorithm.getJvmName());
        return base64Encode(signature);
    }

    private String calculateAuthorizationHeader(
            final String keyId,
            final String httpMethod,
            final String signature,
            final Algorithm algorithm,
            final String version,
            final List<String> requiredHeaders) {
        final String authorizationHeader =
                "Signature headers=\"%s\",keyId=\"%s\","
                        + "algorithm=\"%s\",signature=\"%s\",version=\"%s\"";
        // Space delimited: "date (request-target) content-length" etc
        String headers = StringUtils.join(requiredHeaders, " ");

        final String algorithmName = algorithm.getSpecName();
        return String.format(
                authorizationHeader, headers, keyId, algorithmName, signature, version);
    }

    private List<String> getRequiredSigningHeaders(final String httpMethod) {
        List<String> requiredHeadersToSign =
                this.signingConfiguration.headersToSign.get(httpMethod);
        if (requiredHeadersToSign == null) {
            return new ArrayList<String>(0);
        }
        return requiredHeadersToSign;
    }

    // JSON is the only accepted format for message bodies that need to be
    // signed.
    private static byte[] getJsonBody(Object body) throws JsonProcessingException {
        // empty body is OK
        if (body == null) {
            return "".getBytes(StandardCharsets.UTF_8);
        }
        // if already a string, just use it unchanged
        if (body instanceof String) {
            return ((String) body).getBytes(StandardCharsets.UTF_8);
        }

        throw new IllegalArgumentException("body must be a String");
    }

    private static String base64Encode(byte[] bytes) {
        // encodeBase64String changed from chunked in v1.4 to not chunked in
        // v1.5 so we cannot rely on which version is going to be used by clients,
        // be explicit that this is not-chunked
        return new String(Base64.encodeBase64(bytes, false), StandardCharsets.UTF_8);
    }

    private static SimpleDateFormat createFormatter() {
        SimpleDateFormat dateFormat = new SimpleDateFormat(Constants.DATE_FORMAT, Locale.US);
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return dateFormat;
    }

    /**
     * Basic configuration of what headers to sign.
     */
    @RequiredArgsConstructor
    public static class SigningConfiguration {
        /**
         * Map of HTTP method to list of headers to sign.
         */
        private final Map<String, List<String>> headersToSign;
        /**
         * Flag indicating whether InputStreams in PUT requests are allowed to skip content headers.
         */
        private final boolean skipContentHeadersForStreamingPutRequests;
    }
}
