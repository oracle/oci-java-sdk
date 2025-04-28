/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/RegisterLookupExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use RegisterLookupRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class RegisterLookupRequest extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream> {

    /** The Logging Analytics namespace used for the request. */
    private String namespaceName;

    /** The Logging Analytics namespace used for the request. */
    public String getNamespaceName() {
        return namespaceName;
    }
    /** The lookup type. Valid values are Lookup, Dictionary or Module. */
    private Type type;

    /** The lookup type. Valid values are Lookup, Dictionary or Module. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Lookup("Lookup"),
        Dictionary("Dictionary"),
        Module("Module"),
        ;

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };

    /** The lookup type. Valid values are Lookup, Dictionary or Module. */
    public Type getType() {
        return type;
    }
    /** file containing data for lookup creation */
    private java.io.InputStream registerLookupContentFileBody;

    /** file containing data for lookup creation */
    public java.io.InputStream getRegisterLookupContentFileBody() {
        return registerLookupContentFileBody;
    }
    /**
     * A filter to return only log analytics entities whose name matches the entire name given. The
     * match is case-insensitive.
     */
    private String name;

    /**
     * A filter to return only log analytics entities whose name matches the entire name given. The
     * match is case-insensitive.
     */
    public String getName() {
        return name;
    }
    /** The description for a created lookup. */
    private String description;

    /** The description for a created lookup. */
    public String getDescription() {
        return description;
    }
    /** The character encoding of the uploaded file. */
    private String charEncoding;

    /** The character encoding of the uploaded file. */
    public String getCharEncoding() {
        return charEncoding;
    }
    /** A flag indicating whether or not the new lookup should be hidden. */
    private Boolean isHidden;

    /** A flag indicating whether or not the new lookup should be hidden. */
    public Boolean getIsHidden() {
        return isHidden;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A value of {@code 100-continue} requests preliminary verification of the request method,
     * path, and headers before the request body is sent. If no error results from such
     * verification, the server will send a 100 (Continue) interim response to indicate readiness
     * for the request body. The only allowed value for this parameter is "100-Continue"
     * (case-insensitive).
     */
    private String expect;

    /**
     * A value of {@code 100-continue} requests preliminary verification of the request method,
     * path, and headers before the request body is sent. If no error results from such
     * verification, the server will send a 100 (Continue) interim response to indicate readiness
     * for the request body. The only allowed value for this parameter is "100-Continue"
     * (case-insensitive).
     */
    public String getExpect() {
        return expect;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.io.InputStream getBody$() {
        return registerLookupContentFileBody;
    }

    @Override
    public boolean supportsExpect100Continue() {
        return true;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RegisterLookupRequest, java.io.InputStream> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The Logging Analytics namespace used for the request. */
        private String namespaceName = null;

        /**
         * The Logging Analytics namespace used for the request.
         *
         * @param namespaceName the value to set
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /** The lookup type. Valid values are Lookup, Dictionary or Module. */
        private Type type = null;

        /**
         * The lookup type. Valid values are Lookup, Dictionary or Module.
         *
         * @param type the value to set
         * @return this builder instance
         */
        public Builder type(Type type) {
            this.type = type;
            return this;
        }

        /** file containing data for lookup creation */
        private java.io.InputStream registerLookupContentFileBody = null;

        /**
         * file containing data for lookup creation
         *
         * @param registerLookupContentFileBody the value to set
         * @return this builder instance
         */
        public Builder registerLookupContentFileBody(
                java.io.InputStream registerLookupContentFileBody) {
            this.registerLookupContentFileBody = registerLookupContentFileBody;
            return this;
        }

        /**
         * A filter to return only log analytics entities whose name matches the entire name given.
         * The match is case-insensitive.
         */
        private String name = null;

        /**
         * A filter to return only log analytics entities whose name matches the entire name given.
         * The match is case-insensitive.
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /** The description for a created lookup. */
        private String description = null;

        /**
         * The description for a created lookup.
         *
         * @param description the value to set
         * @return this builder instance
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /** The character encoding of the uploaded file. */
        private String charEncoding = null;

        /**
         * The character encoding of the uploaded file.
         *
         * @param charEncoding the value to set
         * @return this builder instance
         */
        public Builder charEncoding(String charEncoding) {
            this.charEncoding = charEncoding;
            return this;
        }

        /** A flag indicating whether or not the new lookup should be hidden. */
        private Boolean isHidden = null;

        /**
         * A flag indicating whether or not the new lookup should be hidden.
         *
         * @param isHidden the value to set
         * @return this builder instance
         */
        public Builder isHidden(Boolean isHidden) {
            this.isHidden = isHidden;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A value of {@code 100-continue} requests preliminary verification of the request method,
         * path, and headers before the request body is sent. If no error results from such
         * verification, the server will send a 100 (Continue) interim response to indicate
         * readiness for the request body. The only allowed value for this parameter is
         * "100-Continue" (case-insensitive).
         */
        private String expect = null;

        /**
         * A value of {@code 100-continue} requests preliminary verification of the request method,
         * path, and headers before the request body is sent. If no error results from such
         * verification, the server will send a 100 (Continue) interim response to indicate
         * readiness for the request body. The only allowed value for this parameter is
         * "100-Continue" (case-insensitive).
         *
         * @param expect the value to set
         * @return this builder instance
         */
        public Builder expect(String expect) {
            this.expect = expect;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        public Builder copy(RegisterLookupRequest o) {
            namespaceName(o.getNamespaceName());
            type(o.getType());
            registerLookupContentFileBody(o.getRegisterLookupContentFileBody());
            name(o.getName());
            description(o.getDescription());
            charEncoding(o.getCharEncoding());
            isHidden(o.getIsHidden());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            expect(o.getExpect());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RegisterLookupRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of RegisterLookupRequest
         */
        public RegisterLookupRequest build() {
            RegisterLookupRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(java.io.InputStream body) {
            registerLookupContentFileBody(body);
            return this;
        }

        /**
         * Build the instance of RegisterLookupRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RegisterLookupRequest
         */
        public RegisterLookupRequest buildWithoutInvocationCallback() {
            RegisterLookupRequest request = new RegisterLookupRequest();
            request.namespaceName = namespaceName;
            request.type = type;
            request.registerLookupContentFileBody = registerLookupContentFileBody;
            request.name = name;
            request.description = description;
            request.charEncoding = charEncoding;
            request.isHidden = isHidden;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.expect = expect;
            return request;
            // new RegisterLookupRequest(namespaceName, type, registerLookupContentFileBody, name,
            // description, charEncoding, isHidden, opcRetryToken, opcRequestId, expect);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .type(type)
                .registerLookupContentFileBody(registerLookupContentFileBody)
                .name(name)
                .description(description)
                .charEncoding(charEncoding)
                .isHidden(isHidden)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId)
                .expect(expect);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(",registerLookupContentFileBody=")
                .append(String.valueOf(this.registerLookupContentFileBody));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",description=").append(String.valueOf(this.description));
        sb.append(",charEncoding=").append(String.valueOf(this.charEncoding));
        sb.append(",isHidden=").append(String.valueOf(this.isHidden));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",expect=").append(String.valueOf(this.expect));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RegisterLookupRequest)) {
            return false;
        }

        RegisterLookupRequest other = (RegisterLookupRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(
                        this.registerLookupContentFileBody, other.registerLookupContentFileBody)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.charEncoding, other.charEncoding)
                && java.util.Objects.equals(this.isHidden, other.isHidden)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.expect, other.expect);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.registerLookupContentFileBody == null
                                ? 43
                                : this.registerLookupContentFileBody.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.charEncoding == null ? 43 : this.charEncoding.hashCode());
        result = (result * PRIME) + (this.isHidden == null ? 43 : this.isHidden.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.expect == null ? 43 : this.expect.hashCode());
        return result;
    }
}
