/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/TestParserExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use TestParserRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class TestParserRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.loganalytics.model.TestParserPayloadDetails> {

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
     * Details for test payload
     */
    private com.oracle.bmc.loganalytics.model.TestParserPayloadDetails testParserPayloadDetails;

    /**
     * Details for test payload
     */
    public com.oracle.bmc.loganalytics.model.TestParserPayloadDetails
            getTestParserPayloadDetails() {
        return testParserPayloadDetails;
    }
    /**
     * The scope used when testing a parser.
     */
    private Scope scope;

    /**
     * The scope used when testing a parser.
     **/
    public enum Scope {
        LogLines("LOG_LINES"),
        LogEntries("LOG_ENTRIES"),
        LogLinesLogEntries("LOG_LINES_LOG_ENTRIES"),
        ;

        private final String value;
        private static java.util.Map<String, Scope> map;

        static {
            map = new java.util.HashMap<>();
            for (Scope v : Scope.values()) {
                map.put(v.getValue(), v);
            }
        }

        Scope(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Scope create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Scope: " + key);
        }
    };

    /**
     * The scope used when testing a parser.
     */
    public Scope getScope() {
        return scope;
    }
    /**
     * The module to test.  A value of 'ParserFunctionTest' will result in testing of
     * the parser functions.
     *
     */
    private String reqOriginModule;

    /**
     * The module to test.  A value of 'ParserFunctionTest' will result in testing of
     * the parser functions.
     *
     */
    public String getReqOriginModule() {
        return reqOriginModule;
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
    public com.oracle.bmc.loganalytics.model.TestParserPayloadDetails getBody$() {
        return testParserPayloadDetails;
    }

    @Override
    public boolean supportsExpect100Continue() {
        return true;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    TestParserRequest, com.oracle.bmc.loganalytics.model.TestParserPayloadDetails> {
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
         * Details for test payload
         */
        private com.oracle.bmc.loganalytics.model.TestParserPayloadDetails
                testParserPayloadDetails = null;

        /**
         * Details for test payload
         * @param testParserPayloadDetails the value to set
         * @return this builder instance
         */
        public Builder testParserPayloadDetails(
                com.oracle.bmc.loganalytics.model.TestParserPayloadDetails
                        testParserPayloadDetails) {
            this.testParserPayloadDetails = testParserPayloadDetails;
            return this;
        }

        /**
         * The scope used when testing a parser.
         */
        private Scope scope = null;

        /**
         * The scope used when testing a parser.
         * @param scope the value to set
         * @return this builder instance
         */
        public Builder scope(Scope scope) {
            this.scope = scope;
            return this;
        }

        /**
         * The module to test.  A value of 'ParserFunctionTest' will result in testing of
         * the parser functions.
         *
         */
        private String reqOriginModule = null;

        /**
         * The module to test.  A value of 'ParserFunctionTest' will result in testing of
         * the parser functions.
         *
         * @param reqOriginModule the value to set
         * @return this builder instance
         */
        public Builder reqOriginModule(String reqOriginModule) {
            this.reqOriginModule = reqOriginModule;
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
        public Builder copy(TestParserRequest o) {
            namespaceName(o.getNamespaceName());
            testParserPayloadDetails(o.getTestParserPayloadDetails());
            scope(o.getScope());
            reqOriginModule(o.getReqOriginModule());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of TestParserRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of TestParserRequest
         */
        public TestParserRequest build() {
            TestParserRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.loganalytics.model.TestParserPayloadDetails body) {
            testParserPayloadDetails(body);
            return this;
        }

        /**
         * Build the instance of TestParserRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of TestParserRequest
         */
        public TestParserRequest buildWithoutInvocationCallback() {
            TestParserRequest request = new TestParserRequest();
            request.namespaceName = namespaceName;
            request.testParserPayloadDetails = testParserPayloadDetails;
            request.scope = scope;
            request.reqOriginModule = reqOriginModule;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new TestParserRequest(namespaceName, testParserPayloadDetails, scope, reqOriginModule, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .testParserPayloadDetails(testParserPayloadDetails)
                .scope(scope)
                .reqOriginModule(reqOriginModule)
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
        sb.append(",testParserPayloadDetails=")
                .append(String.valueOf(this.testParserPayloadDetails));
        sb.append(",scope=").append(String.valueOf(this.scope));
        sb.append(",reqOriginModule=").append(String.valueOf(this.reqOriginModule));
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
        if (!(o instanceof TestParserRequest)) {
            return false;
        }

        TestParserRequest other = (TestParserRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(
                        this.testParserPayloadDetails, other.testParserPayloadDetails)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.reqOriginModule, other.reqOriginModule)
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
                        + (this.testParserPayloadDetails == null
                                ? 43
                                : this.testParserPayloadDetails.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result =
                (result * PRIME)
                        + (this.reqOriginModule == null ? 43 : this.reqOriginModule.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
