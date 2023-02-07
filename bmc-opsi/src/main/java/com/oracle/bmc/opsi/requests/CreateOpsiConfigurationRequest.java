/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/CreateOpsiConfigurationExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateOpsiConfigurationRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class CreateOpsiConfigurationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.opsi.model.CreateOpsiConfigurationDetails> {

    /** Information about OPSI configuration resource to be created. */
    private com.oracle.bmc.opsi.model.CreateOpsiConfigurationDetails createOpsiConfigurationDetails;

    /** Information about OPSI configuration resource to be created. */
    public com.oracle.bmc.opsi.model.CreateOpsiConfigurationDetails
            getCreateOpsiConfigurationDetails() {
        return createOpsiConfigurationDetails;
    }
    /**
     * A token that uniquely identifies a request that can be retried in case of a timeout or server
     * error without risk of executing the same action again. Retry tokens expire after 24 hours.
     *
     * <p>Note:* Retry tokens can be invalidated before the 24 hour time limit due to conflicting
     * operations, such as a resource being deleted or purged from the system.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request that can be retried in case of a timeout or server
     * error without risk of executing the same action again. Retry tokens expire after 24 hours.
     *
     * <p>Note:* Retry tokens can be invalidated before the 24 hour time limit due to conflicting
     * operations, such as a resource being deleted or purged from the system.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Optional fields to return as part of OpsiConfiguration object. Unless requested, these fields
     * will not be returned by default.
     */
    private java.util.List<OpsiConfigField> opsiConfigField;

    /**
     * Optional fields to return as part of OpsiConfiguration object. Unless requested, these fields
     * will not be returned by default.
     */
    public enum OpsiConfigField implements com.oracle.bmc.http.internal.BmcEnum {
        ConfigItems("configItems"),
        ;

        private final String value;
        private static java.util.Map<String, OpsiConfigField> map;

        static {
            map = new java.util.HashMap<>();
            for (OpsiConfigField v : OpsiConfigField.values()) {
                map.put(v.getValue(), v);
            }
        }

        OpsiConfigField(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OpsiConfigField create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid OpsiConfigField: " + key);
        }
    };

    /**
     * Optional fields to return as part of OpsiConfiguration object. Unless requested, these fields
     * will not be returned by default.
     */
    public java.util.List<OpsiConfigField> getOpsiConfigField() {
        return opsiConfigField;
    }
    /**
     * Specifies whether only customized configuration items or only non-customized configuration
     * items or both have to be returned. By default only customized configuration items are
     * returned.
     */
    private java.util.List<ConfigItemCustomStatus> configItemCustomStatus;

    /**
     * Specifies whether only customized configuration items or only non-customized configuration
     * items or both have to be returned. By default only customized configuration items are
     * returned.
     */
    public enum ConfigItemCustomStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Customized("customized"),
        NonCustomized("nonCustomized"),
        ;

        private final String value;
        private static java.util.Map<String, ConfigItemCustomStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (ConfigItemCustomStatus v : ConfigItemCustomStatus.values()) {
                map.put(v.getValue(), v);
            }
        }

        ConfigItemCustomStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConfigItemCustomStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ConfigItemCustomStatus: " + key);
        }
    };

    /**
     * Specifies whether only customized configuration items or only non-customized configuration
     * items or both have to be returned. By default only customized configuration items are
     * returned.
     */
    public java.util.List<ConfigItemCustomStatus> getConfigItemCustomStatus() {
        return configItemCustomStatus;
    }
    /**
     * Returns the configuration items filtered by applicable contexts sent in this param. By
     * default configuration items of all applicable contexts are returned.
     */
    private java.util.List<String> configItemsApplicableContext;

    /**
     * Returns the configuration items filtered by applicable contexts sent in this param. By
     * default configuration items of all applicable contexts are returned.
     */
    public java.util.List<String> getConfigItemsApplicableContext() {
        return configItemsApplicableContext;
    }
    /** Specifies the fields to return in a config item summary. */
    private java.util.List<ConfigItemField> configItemField;

    /** Specifies the fields to return in a config item summary. */
    public enum ConfigItemField implements com.oracle.bmc.http.internal.BmcEnum {
        Name("name"),
        Value("value"),
        DefaultValue("defaultValue"),
        Metadata("metadata"),
        ApplicableContexts("applicableContexts"),
        ;

        private final String value;
        private static java.util.Map<String, ConfigItemField> map;

        static {
            map = new java.util.HashMap<>();
            for (ConfigItemField v : ConfigItemField.values()) {
                map.put(v.getValue(), v);
            }
        }

        ConfigItemField(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConfigItemField create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ConfigItemField: " + key);
        }
    };

    /** Specifies the fields to return in a config item summary. */
    public java.util.List<ConfigItemField> getConfigItemField() {
        return configItemField;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.opsi.model.CreateOpsiConfigurationDetails getBody$() {
        return createOpsiConfigurationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateOpsiConfigurationRequest,
                    com.oracle.bmc.opsi.model.CreateOpsiConfigurationDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Information about OPSI configuration resource to be created. */
        private com.oracle.bmc.opsi.model.CreateOpsiConfigurationDetails
                createOpsiConfigurationDetails = null;

        /**
         * Information about OPSI configuration resource to be created.
         *
         * @param createOpsiConfigurationDetails the value to set
         * @return this builder instance
         */
        public Builder createOpsiConfigurationDetails(
                com.oracle.bmc.opsi.model.CreateOpsiConfigurationDetails
                        createOpsiConfigurationDetails) {
            this.createOpsiConfigurationDetails = createOpsiConfigurationDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request that can be retried in case of a timeout or
         * server error without risk of executing the same action again. Retry tokens expire after
         * 24 hours.
         *
         * <p>Note:* Retry tokens can be invalidated before the 24 hour time limit due to
         * conflicting operations, such as a resource being deleted or purged from the system.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request that can be retried in case of a timeout or
         * server error without risk of executing the same action again. Retry tokens expire after
         * 24 hours.
         *
         * <p>Note:* Retry tokens can be invalidated before the 24 hour time limit due to
         * conflicting operations, such as a resource being deleted or purged from the system.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Optional fields to return as part of OpsiConfiguration object. Unless requested, these
         * fields will not be returned by default.
         */
        private java.util.List<OpsiConfigField> opsiConfigField = null;

        /**
         * Optional fields to return as part of OpsiConfiguration object. Unless requested, these
         * fields will not be returned by default.
         *
         * @param opsiConfigField the value to set
         * @return this builder instance
         */
        public Builder opsiConfigField(java.util.List<OpsiConfigField> opsiConfigField) {
            this.opsiConfigField = opsiConfigField;
            return this;
        }

        /**
         * Singular setter. Optional fields to return as part of OpsiConfiguration object. Unless
         * requested, these fields will not be returned by default.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder opsiConfigField(OpsiConfigField singularValue) {
            return this.opsiConfigField(java.util.Arrays.asList(singularValue));
        }

        /**
         * Specifies whether only customized configuration items or only non-customized
         * configuration items or both have to be returned. By default only customized configuration
         * items are returned.
         */
        private java.util.List<ConfigItemCustomStatus> configItemCustomStatus = null;

        /**
         * Specifies whether only customized configuration items or only non-customized
         * configuration items or both have to be returned. By default only customized configuration
         * items are returned.
         *
         * @param configItemCustomStatus the value to set
         * @return this builder instance
         */
        public Builder configItemCustomStatus(
                java.util.List<ConfigItemCustomStatus> configItemCustomStatus) {
            this.configItemCustomStatus = configItemCustomStatus;
            return this;
        }

        /**
         * Singular setter. Specifies whether only customized configuration items or only
         * non-customized configuration items or both have to be returned. By default only
         * customized configuration items are returned.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder configItemCustomStatus(ConfigItemCustomStatus singularValue) {
            return this.configItemCustomStatus(java.util.Arrays.asList(singularValue));
        }

        /**
         * Returns the configuration items filtered by applicable contexts sent in this param. By
         * default configuration items of all applicable contexts are returned.
         */
        private java.util.List<String> configItemsApplicableContext = null;

        /**
         * Returns the configuration items filtered by applicable contexts sent in this param. By
         * default configuration items of all applicable contexts are returned.
         *
         * @param configItemsApplicableContext the value to set
         * @return this builder instance
         */
        public Builder configItemsApplicableContext(
                java.util.List<String> configItemsApplicableContext) {
            this.configItemsApplicableContext = configItemsApplicableContext;
            return this;
        }

        /**
         * Singular setter. Returns the configuration items filtered by applicable contexts sent in
         * this param. By default configuration items of all applicable contexts are returned.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder configItemsApplicableContext(String singularValue) {
            return this.configItemsApplicableContext(java.util.Arrays.asList(singularValue));
        }

        /** Specifies the fields to return in a config item summary. */
        private java.util.List<ConfigItemField> configItemField = null;

        /**
         * Specifies the fields to return in a config item summary.
         *
         * @param configItemField the value to set
         * @return this builder instance
         */
        public Builder configItemField(java.util.List<ConfigItemField> configItemField) {
            this.configItemField = configItemField;
            return this;
        }

        /**
         * Singular setter. Specifies the fields to return in a config item summary.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder configItemField(ConfigItemField singularValue) {
            return this.configItemField(java.util.Arrays.asList(singularValue));
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
        public Builder copy(CreateOpsiConfigurationRequest o) {
            createOpsiConfigurationDetails(o.getCreateOpsiConfigurationDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            opsiConfigField(o.getOpsiConfigField());
            configItemCustomStatus(o.getConfigItemCustomStatus());
            configItemsApplicableContext(o.getConfigItemsApplicableContext());
            configItemField(o.getConfigItemField());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateOpsiConfigurationRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateOpsiConfigurationRequest
         */
        public CreateOpsiConfigurationRequest build() {
            CreateOpsiConfigurationRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.opsi.model.CreateOpsiConfigurationDetails body) {
            createOpsiConfigurationDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateOpsiConfigurationRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateOpsiConfigurationRequest
         */
        public CreateOpsiConfigurationRequest buildWithoutInvocationCallback() {
            CreateOpsiConfigurationRequest request = new CreateOpsiConfigurationRequest();
            request.createOpsiConfigurationDetails = createOpsiConfigurationDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.opsiConfigField = opsiConfigField;
            request.configItemCustomStatus = configItemCustomStatus;
            request.configItemsApplicableContext = configItemsApplicableContext;
            request.configItemField = configItemField;
            return request;
            // new CreateOpsiConfigurationRequest(createOpsiConfigurationDetails, opcRetryToken,
            // opcRequestId, opsiConfigField, configItemCustomStatus, configItemsApplicableContext,
            // configItemField);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createOpsiConfigurationDetails(createOpsiConfigurationDetails)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId)
                .opsiConfigField(opsiConfigField)
                .configItemCustomStatus(configItemCustomStatus)
                .configItemsApplicableContext(configItemsApplicableContext)
                .configItemField(configItemField);
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
        sb.append(",createOpsiConfigurationDetails=")
                .append(String.valueOf(this.createOpsiConfigurationDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opsiConfigField=").append(String.valueOf(this.opsiConfigField));
        sb.append(",configItemCustomStatus=").append(String.valueOf(this.configItemCustomStatus));
        sb.append(",configItemsApplicableContext=")
                .append(String.valueOf(this.configItemsApplicableContext));
        sb.append(",configItemField=").append(String.valueOf(this.configItemField));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOpsiConfigurationRequest)) {
            return false;
        }

        CreateOpsiConfigurationRequest other = (CreateOpsiConfigurationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createOpsiConfigurationDetails, other.createOpsiConfigurationDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opsiConfigField, other.opsiConfigField)
                && java.util.Objects.equals(
                        this.configItemCustomStatus, other.configItemCustomStatus)
                && java.util.Objects.equals(
                        this.configItemsApplicableContext, other.configItemsApplicableContext)
                && java.util.Objects.equals(this.configItemField, other.configItemField);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createOpsiConfigurationDetails == null
                                ? 43
                                : this.createOpsiConfigurationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opsiConfigField == null ? 43 : this.opsiConfigField.hashCode());
        result =
                (result * PRIME)
                        + (this.configItemCustomStatus == null
                                ? 43
                                : this.configItemCustomStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.configItemsApplicableContext == null
                                ? 43
                                : this.configItemsApplicableContext.hashCode());
        result =
                (result * PRIME)
                        + (this.configItemField == null ? 43 : this.configItemField.hashCode());
        return result;
    }
}
