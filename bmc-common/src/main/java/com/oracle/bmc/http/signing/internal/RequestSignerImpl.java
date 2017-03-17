/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.signing.internal;

import java.io.InputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.interfaces.RSAPrivateKey;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TimeZone;
import java.util.TreeMap;

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
    private final SigningStrategy signingStrategy;
    private final Supplier<String> keyIdSupplier;

    /**
     * Construct the RequestSigner with the specified KeySupplier. This will be
     * used to get keys for doing the signing.
     *
     * @param keySupplier
     *            a key supplier that will be used for signing the request
     */
    public RequestSignerImpl(
            @Nonnull final KeySupplier<RSAPrivateKey> keySupplier,
            @Nonnull final SigningStrategy signingStrategy,
            @Nonnull final Supplier<String> keyIdSupplier) {
        this.keySupplier = Preconditions.checkNotNull(keySupplier);
        this.signingStrategy = Preconditions.checkNotNull(signingStrategy);
        this.keyIdSupplier = Preconditions.checkNotNull(keyIdSupplier);
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
            // copy of headers as case-insensitive, do not modify input map
            final Map<String, String> caseInsensitiveHeaders = ignoreCaseHeaders(headers);
            final String lowerHttpMethod = httpMethod.toLowerCase();
            final String path = extractPath(uri);

            injectMissingHeaders(lowerHttpMethod, uri, caseInsensitiveHeaders, body);

            final Map<String, String> signedHeaders =
                    extractHeadersToSign(lowerHttpMethod, caseInsensitiveHeaders);
            final String stringToSign = calculateStringToSign(lowerHttpMethod, path, signedHeaders);
            final String signature = sign(key, algorithm, stringToSign);

            injectAuthorizationHeader(
                    keyId,
                    lowerHttpMethod,
                    signedHeaders,
                    signature,
                    algorithm,
                    version.getVersionName());
            return signedHeaders;

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
            transformedMap.put(entry.getKey().toLowerCase(), entry.getValue().get(0));
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

    private void injectMissingHeaders(
            final String httpMethod,
            final URI uri,
            final Map<String, String> caseInsensitiveHeaders,
            final Object body) {
        if (!caseInsensitiveHeaders.containsKey(Constants.DATE)
                && !caseInsensitiveHeaders.containsKey(Constants.CUSTOM_DATE_HEADER)) {
            caseInsensitiveHeaders.put(Constants.DATE, createFormatter().format(new Date()));
        }
        if (!caseInsensitiveHeaders.containsKey(Constants.HOST)) {
            caseInsensitiveHeaders.put(Constants.HOST, uri.getHost());
        }

        // supply content-type, content-length and x-content-sha256 if missing (PUT and POST only)
        if (httpMethod.equals("put") || httpMethod.equals("post")) {
            // only exception is for streaming bodies for PUT if the signing strategy allows it to be skipped
            if (body instanceof InputStream) {
                if (httpMethod.equals("put") && signingStrategy.isSkipContentHeadersForStreamingRequests()) {
                    return;
                } else {
                    throw new IllegalArgumentException(
                            "Streaming body not supported for signing strategy");
                }
            } else {
                // While we don't always sign content-type, services always
                // expect application/json (except if we're sending an input stream)
                // NOTE: this should never happen as EntityFactory ensures all
                // requests have this header, so log a warning
                if (!caseInsensitiveHeaders.containsKey(Constants.CONTENT_TYPE)) {
                    LOG.warn("Missing 'content-type' header, defaulting to 'application/json'");
                    caseInsensitiveHeaders.put(Constants.CONTENT_TYPE, Constants.JSON_CONTENT_TYPE);
                } else if (!caseInsensitiveHeaders
                        .get(Constants.CONTENT_TYPE)
                        .toLowerCase()
                        .equals(Constants.JSON_CONTENT_TYPE)) {
                    throw new IllegalArgumentException(
                            "Only 'application/json' supported for content type");
                }

                byte[] bodyBytes;
                try {
                    bodyBytes = getJsonBody(body);
                } catch (JsonProcessingException e) {
                    throw new IllegalArgumentException("Unable to process JSON body", e);
                }

                if (!caseInsensitiveHeaders.containsKey(Constants.CONTENT_LENGTH)) {
                    caseInsensitiveHeaders.put(
                            Constants.CONTENT_LENGTH, Integer.toString(bodyBytes.length));
                }

                if (!caseInsensitiveHeaders.containsKey(Constants.X_CONTENT_SHA256)) {
                    caseInsensitiveHeaders.put(
                            Constants.X_CONTENT_SHA256, calculateBodySHA256(bodyBytes));
                }
            }
        } else {
            // Conversely, asking to sign a body on GET/DELETE/HEAD/OPTIONS is
            // not allowed
            if (body != null) {
                throw new RuntimeException("MUST NOT send body on non-POST/PUT request");
            }
        }
    }

    private Map<String, String> extractHeadersToSign(
            final String httpMethod, final Map<String, String> caseInsensitiveHeaders) {
        final List<String> requiredHeaders = getRequiredSigningHeaders(httpMethod);

        if (requiredHeaders == null)
            throw new RuntimeException("Don't know how to sign method " + httpMethod);

        // headersToSign will be sorted
        final Map<String, String> headersToSign = new TreeMap<>(new HeaderNameComparator());

        for (String header : requiredHeaders) {
            if (header.equals(Constants.REQUEST_TARGET)) {
                // (request-target) is a pseudo-header
                continue;
            } else if (header.equals(Constants.DATE)) {
                // Special-case "date" since "x-date" takes priority if provided
                if (caseInsensitiveHeaders.containsKey(Constants.CUSTOM_DATE_HEADER)) {
                    headersToSign.put(
                            Constants.CUSTOM_DATE_HEADER,
                            caseInsensitiveHeaders.get(Constants.CUSTOM_DATE_HEADER));
                } else {
                    headersToSign.put(header, caseInsensitiveHeaders.get(Constants.DATE));
                }
            } else if (!caseInsensitiveHeaders.containsKey(header)) {
                // As of 9/12/2016 this will never throw, since injectHeaders
                // above has all the information needed to supply all required
                // headers for supported http methods.
                throw new RuntimeException("Missing required header " + header);
            } else {
                // Header exists in source headers
                headersToSign.put(header, caseInsensitiveHeaders.get(header));
            }
        }

        // Check if the caller has asked for headers to be signed that are not
        // required.
        // However, we want to exclude the date/x-date logic since that has been
        // already taken care of above.
        for (Map.Entry<String, String> missingHeader : caseInsensitiveHeaders.entrySet()) {
            if (missingHeader.getKey().equalsIgnoreCase(Constants.DATE)
                    || missingHeader.getKey().equalsIgnoreCase(Constants.CUSTOM_DATE_HEADER)) {
                // If both date and x-date header were supplied, x-date takes
                // priority, so we do not add date here again
                continue;
            }

            if (!headersToSign.containsKey(missingHeader.getKey())) {
                headersToSign.put(
                        missingHeader.getKey().toString(), missingHeader.getValue().toString());
            }
        }

        return headersToSign;
    }

    private static String calculateBodySHA256(final byte[] body) {
        byte[] hash = Hashing.sha256().hashBytes(body).asBytes();
        return base64Encode(hash);
    }

    private String calculateStringToSign(
            String httpMethod, String path, Map<String, String> headers) {
        final List<String> signedHeadersList = getRequiredSigningHeaders(httpMethod);

        // Header name and value are separated with ": " and each (name, value)
        // pair is separated with "\n"
        // (request-target) is a pseudo-header, and it's computed without
        // inserting into the headers map.
        List<String> signatureBuilder = new ArrayList<>();

        // We could just dump the map, but then we'd have to pass the order they
        // were dumped to other methods.
        // Just use the ordering in REQUIRED_HEADERS everywhere to be
        // consistent.
        for (String headerName : signedHeadersList) {
            // Assuming success on lookup because extractHeadersToSign would
            // have thrown before this
            String headerValue = headers.get(headerName);

            if (headerName.equals(Constants.REQUEST_TARGET)) {
                // Manually compute pseudo-header (request-target), since it
                // won't be in headers
                headerValue = httpMethod + " " + path;
            } else if (headerName.equals(Constants.DATE)) {
                // x-date has priority if it's provided
                if (headers.containsKey(Constants.CUSTOM_DATE_HEADER)) {
                    headerName = Constants.CUSTOM_DATE_HEADER;
                    headerValue = headers.get(Constants.CUSTOM_DATE_HEADER);
                }
            }
            signatureBuilder.add(String.format("%s: %s", headerName, headerValue));
        }

        for (Map.Entry<String, String> missingHeader : headers.entrySet()) {
            if (missingHeader.getKey().equalsIgnoreCase(Constants.DATE)
                    || missingHeader.getKey().equalsIgnoreCase(Constants.CUSTOM_DATE_HEADER)) {
                // If both date and x-date header were supplied, x-date takes
                // priority, so we do not add date here again
                continue;
            }

            if (!signedHeadersList.contains(missingHeader.getKey())) {
                signatureBuilder.add(
                        String.format("%s: %s", missingHeader.getKey(), missingHeader.getValue()));
            }
        }

        return StringUtils.join(signatureBuilder, "\n");
    }

    private String sign(RSAPrivateKey key, Algorithm algorithm, String stringToSign) {
        byte[] signature =
                SIGNER.sign(
                        key, stringToSign.getBytes(StandardCharsets.UTF_8), algorithm.getJvmName());
        return base64Encode(signature);
    }

    private void injectAuthorizationHeader(
            final String keyId,
            final String httpMethod,
            final Map<String, String> signedHeaders,
            final String signature,
            final Algorithm algorithm,
            final String version) {
        // Don't need a null check since the lookup would have failed when we
        // first signed the headers
        final List<String> signedHeadersList = getRequiredSigningHeaders(httpMethod);
        final String authorizationHeader =
                "Signature headers=\"%s\",keyId=\"%s\","
                        + "algorithm=\"%s\",signature=\"%s\",version=\"%s\"";
        // Space delimited: "date (request-target)" "x-date (request-target)
        // content-length" etc
        List<String> headersToJoin = new ArrayList<>();
        for (String signedHeader : signedHeadersList) {
            // use x-date instead of date if it was provided
            if (signedHeader.equals(Constants.DATE)
                    && signedHeaders.containsKey(Constants.CUSTOM_DATE_HEADER)) {
                headersToJoin.add(Constants.CUSTOM_DATE_HEADER);
            } else {
                headersToJoin.add(signedHeader);
            }
        }
        String headers = StringUtils.join(headersToJoin, " ");

        // add optional headers; x-date has already been added if it was
        // provided
        for (String missingHeader : signedHeaders.keySet()) {
            if (!missingHeader.equalsIgnoreCase(Constants.CUSTOM_DATE_HEADER)
                    && !signedHeadersList.contains(missingHeader)) {
                headers += " " + missingHeader;
            }
        }

        final String algorithmName = algorithm.getSpecName();
        signedHeaders.put(
                Constants.AUTHORIZATION_HEADER,
                String.format(
                        authorizationHeader, headers, keyId, algorithmName, signature, version));
    }

    private List<String> getRequiredSigningHeaders(final String httpMethod) {
        return this.signingStrategy.getHeadersToSign().get(httpMethod);
    }

    // JSON is the only accepted format for message bodies that need to be
    // signed.
    private static byte[] getJsonBody(Object body) throws JsonProcessingException {
        // empty body is OK
        if (body == null) {
            return "".getBytes();
        }
        // use the same object mapper as the rest client to ensure the configurations match
        // what is sent
        String bodyAsString = RestClientFactory.getObjectMapper().writeValueAsString(body);

        // Annoying ObjectMapper edge case: If given a set of empty braces, it
        // adds a set of quotes that causes auth to fail on the server-side as
        // the message parser does not include them. Hence, the check and return
        // of the quote-less braces.
        if (bodyAsString.equals("\"{}\"")) {
            return "{}".getBytes();
        }

        return bodyAsString.getBytes();
    }

    private static String base64Encode(byte[] bytes) {
        // encodeBase64String changed from chunked in v1.4 to not chunked in
        // v1.5 so we cannot rely on which version is going to be used by clients,
        // be explicit that this is not-chunked
        return new String(Base64.encodeBase64(bytes, false));
    }

    private static SimpleDateFormat createFormatter() {
        // While "date" is used below, "x-date" is also allowed in its place.
        SimpleDateFormat dateFormat = new SimpleDateFormat(Constants.DATE_FORMAT, Locale.US);
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return dateFormat;
    }

    private static final class HeaderNameComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareToIgnoreCase(o2);
        }
    }
}
