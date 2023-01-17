/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ExtractStructuredLogFieldPathsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ExtractStructuredLogFieldPathsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class ExtractStructuredLogFieldPathsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.loganalytics.model.LogAnalyticsParser> {

    /**
     * The Logging Analytics namespace used for the request.
     *
     */
    private String namespaceName;

    /**
     * The Logging Analytics namespace used for the request.
     *
     */
    public String getNamespaceName() {
        return namespaceName;
    }
    /**
     * parser definition
     */
    private com.oracle.bmc.loganalytics.model.LogAnalyticsParser loganParserDetails;

    /**
     * parser definition
     */
    public com.oracle.bmc.loganalytics.model.LogAnalyticsParser getLoganParserDetails() {
        return loganParserDetails;
    }
    /**
     * The parser type - possible values are XML, JSON or DELIMITED.
     */
    private ParserType parserType;

    /**
     * The parser type - possible values are XML, JSON or DELIMITED.
     **/
    public enum ParserType {
        Xml("XML"),
        Json("JSON"),
        Delimited("DELIMITED"),
        ;

        private final String value;
        private static java.util.Map<String, ParserType> map;

        static {
            map = new java.util.HashMap<>();
            for (ParserType v : ParserType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ParserType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ParserType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ParserType: " + key);
        }
    };

    /**
     * The parser type - possible values are XML, JSON or DELIMITED.
     */
    public ParserType getParserType() {
        return parserType;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.loganalytics.model.LogAnalyticsParser getBody$() {
        return loganParserDetails;
    }

    @Override
    public boolean supportsExpect100Continue() {
        return true;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ExtractStructuredLogFieldPathsRequest,
                    com.oracle.bmc.loganalytics.model.LogAnalyticsParser> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The Logging Analytics namespace used for the request.
         *
         */
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

        /**
         * parser definition
         */
        private com.oracle.bmc.loganalytics.model.LogAnalyticsParser loganParserDetails = null;

        /**
         * parser definition
         * @param loganParserDetails the value to set
         * @return this builder instance
         */
        public Builder loganParserDetails(
                com.oracle.bmc.loganalytics.model.LogAnalyticsParser loganParserDetails) {
            this.loganParserDetails = loganParserDetails;
            return this;
        }

        /**
         * The parser type - possible values are XML, JSON or DELIMITED.
         */
        private ParserType parserType = null;

        /**
         * The parser type - possible values are XML, JSON or DELIMITED.
         * @param parserType the value to set
         * @return this builder instance
         */
        public Builder parserType(ParserType parserType) {
            this.parserType = parserType;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
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
         * @return this builder instance
         */
        public Builder copy(ExtractStructuredLogFieldPathsRequest o) {
            namespaceName(o.getNamespaceName());
            loganParserDetails(o.getLoganParserDetails());
            parserType(o.getParserType());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ExtractStructuredLogFieldPathsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ExtractStructuredLogFieldPathsRequest
         */
        public ExtractStructuredLogFieldPathsRequest build() {
            ExtractStructuredLogFieldPathsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.loganalytics.model.LogAnalyticsParser body) {
            loganParserDetails(body);
            return this;
        }

        /**
         * Build the instance of ExtractStructuredLogFieldPathsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ExtractStructuredLogFieldPathsRequest
         */
        public ExtractStructuredLogFieldPathsRequest buildWithoutInvocationCallback() {
            ExtractStructuredLogFieldPathsRequest request =
                    new ExtractStructuredLogFieldPathsRequest();
            request.namespaceName = namespaceName;
            request.loganParserDetails = loganParserDetails;
            request.parserType = parserType;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new ExtractStructuredLogFieldPathsRequest(namespaceName, loganParserDetails, parserType, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .loganParserDetails(loganParserDetails)
                .parserType(parserType)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
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
        sb.append(",loganParserDetails=").append(String.valueOf(this.loganParserDetails));
        sb.append(",parserType=").append(String.valueOf(this.parserType));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtractStructuredLogFieldPathsRequest)) {
            return false;
        }

        ExtractStructuredLogFieldPathsRequest other = (ExtractStructuredLogFieldPathsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.loganParserDetails, other.loganParserDetails)
                && java.util.Objects.equals(this.parserType, other.parserType)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result =
                (result * PRIME)
                        + (this.loganParserDetails == null
                                ? 43
                                : this.loganParserDetails.hashCode());
        result = (result * PRIME) + (this.parserType == null ? 43 : this.parserType.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
