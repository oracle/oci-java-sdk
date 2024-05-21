/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/GetOpsiConfigurationExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetOpsiConfigurationRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class GetOpsiConfigurationRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of OPSI configuration resource.
     *
     */
    private String opsiConfigurationId;

    /**
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of OPSI configuration resource.
     *
     */
    public String getOpsiConfigurationId() {
        return opsiConfigurationId;
    }
    /**
     * Optional fields to return as part of OpsiConfiguration object. Unless requested, these fields will not be returned by default.
     *
     */
    private java.util.List<OpsiConfigField> opsiConfigField;

    /**
     * Optional fields to return as part of OpsiConfiguration object. Unless requested, these fields will not be returned by default.
     *
     **/
    public enum OpsiConfigField {
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
     * Optional fields to return as part of OpsiConfiguration object. Unless requested, these fields will not be returned by default.
     *
     */
    public java.util.List<OpsiConfigField> getOpsiConfigField() {
        return opsiConfigField;
    }
    /**
     * Specifies whether only customized configuration items or only non-customized configuration items or both have to be returned.
     * By default only customized configuration items are returned.
     *
     */
    private java.util.List<ConfigItemCustomStatus> configItemCustomStatus;

    /**
     * Specifies whether only customized configuration items or only non-customized configuration items or both have to be returned.
     * By default only customized configuration items are returned.
     *
     **/
    public enum ConfigItemCustomStatus {
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
     * Specifies whether only customized configuration items or only non-customized configuration items or both have to be returned.
     * By default only customized configuration items are returned.
     *
     */
    public java.util.List<ConfigItemCustomStatus> getConfigItemCustomStatus() {
        return configItemCustomStatus;
    }
    /**
     * Returns the configuration items filtered by applicable contexts sent in this param. By default configuration items of all applicable contexts are returned.
     *
     */
    private java.util.List<String> configItemsApplicableContext;

    /**
     * Returns the configuration items filtered by applicable contexts sent in this param. By default configuration items of all applicable contexts are returned.
     *
     */
    public java.util.List<String> getConfigItemsApplicableContext() {
        return configItemsApplicableContext;
    }
    /**
     * Specifies the fields to return in a config item summary.
     */
    private java.util.List<ConfigItemField> configItemField;

    /**
     * Specifies the fields to return in a config item summary.
     **/
    public enum ConfigItemField {
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

    /**
     * Specifies the fields to return in a config item summary.
     */
    public java.util.List<ConfigItemField> getConfigItemField() {
        return configItemField;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetOpsiConfigurationRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of OPSI configuration resource.
         *
         */
        private String opsiConfigurationId = null;

        /**
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of OPSI configuration resource.
         *
         * @param opsiConfigurationId the value to set
         * @return this builder instance
         */
        public Builder opsiConfigurationId(String opsiConfigurationId) {
            this.opsiConfigurationId = opsiConfigurationId;
            return this;
        }

        /**
         * Optional fields to return as part of OpsiConfiguration object. Unless requested, these fields will not be returned by default.
         *
         */
        private java.util.List<OpsiConfigField> opsiConfigField = null;

        /**
         * Optional fields to return as part of OpsiConfiguration object. Unless requested, these fields will not be returned by default.
         *
         * @param opsiConfigField the value to set
         * @return this builder instance
         */
        public Builder opsiConfigField(java.util.List<OpsiConfigField> opsiConfigField) {
            this.opsiConfigField = opsiConfigField;
            return this;
        }

        /**
         * Singular setter. Optional fields to return as part of OpsiConfiguration object. Unless requested, these fields will not be returned by default.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder opsiConfigField(OpsiConfigField singularValue) {
            return this.opsiConfigField(java.util.Arrays.asList(singularValue));
        }

        /**
         * Specifies whether only customized configuration items or only non-customized configuration items or both have to be returned.
         * By default only customized configuration items are returned.
         *
         */
        private java.util.List<ConfigItemCustomStatus> configItemCustomStatus = null;

        /**
         * Specifies whether only customized configuration items or only non-customized configuration items or both have to be returned.
         * By default only customized configuration items are returned.
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
         * Singular setter. Specifies whether only customized configuration items or only non-customized configuration items or both have to be returned.
         * By default only customized configuration items are returned.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder configItemCustomStatus(ConfigItemCustomStatus singularValue) {
            return this.configItemCustomStatus(java.util.Arrays.asList(singularValue));
        }

        /**
         * Returns the configuration items filtered by applicable contexts sent in this param. By default configuration items of all applicable contexts are returned.
         *
         */
        private java.util.List<String> configItemsApplicableContext = null;

        /**
         * Returns the configuration items filtered by applicable contexts sent in this param. By default configuration items of all applicable contexts are returned.
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
         * Singular setter. Returns the configuration items filtered by applicable contexts sent in this param. By default configuration items of all applicable contexts are returned.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder configItemsApplicableContext(String singularValue) {
            return this.configItemsApplicableContext(java.util.Arrays.asList(singularValue));
        }

        /**
         * Specifies the fields to return in a config item summary.
         */
        private java.util.List<ConfigItemField> configItemField = null;

        /**
         * Specifies the fields to return in a config item summary.
         * @param configItemField the value to set
         * @return this builder instance
         */
        public Builder configItemField(java.util.List<ConfigItemField> configItemField) {
            this.configItemField = configItemField;
            return this;
        }

        /**
         * Singular setter. Specifies the fields to return in a config item summary.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder configItemField(ConfigItemField singularValue) {
            return this.configItemField(java.util.Arrays.asList(singularValue));
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
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
        public Builder copy(GetOpsiConfigurationRequest o) {
            opsiConfigurationId(o.getOpsiConfigurationId());
            opsiConfigField(o.getOpsiConfigField());
            configItemCustomStatus(o.getConfigItemCustomStatus());
            configItemsApplicableContext(o.getConfigItemsApplicableContext());
            configItemField(o.getConfigItemField());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetOpsiConfigurationRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetOpsiConfigurationRequest
         */
        public GetOpsiConfigurationRequest build() {
            GetOpsiConfigurationRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetOpsiConfigurationRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetOpsiConfigurationRequest
         */
        public GetOpsiConfigurationRequest buildWithoutInvocationCallback() {
            GetOpsiConfigurationRequest request = new GetOpsiConfigurationRequest();
            request.opsiConfigurationId = opsiConfigurationId;
            request.opsiConfigField = opsiConfigField;
            request.configItemCustomStatus = configItemCustomStatus;
            request.configItemsApplicableContext = configItemsApplicableContext;
            request.configItemField = configItemField;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetOpsiConfigurationRequest(opsiConfigurationId, opsiConfigField, configItemCustomStatus, configItemsApplicableContext, configItemField, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .opsiConfigurationId(opsiConfigurationId)
                .opsiConfigField(opsiConfigField)
                .configItemCustomStatus(configItemCustomStatus)
                .configItemsApplicableContext(configItemsApplicableContext)
                .configItemField(configItemField)
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
        sb.append(",opsiConfigurationId=").append(String.valueOf(this.opsiConfigurationId));
        sb.append(",opsiConfigField=").append(String.valueOf(this.opsiConfigField));
        sb.append(",configItemCustomStatus=").append(String.valueOf(this.configItemCustomStatus));
        sb.append(",configItemsApplicableContext=")
                .append(String.valueOf(this.configItemsApplicableContext));
        sb.append(",configItemField=").append(String.valueOf(this.configItemField));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetOpsiConfigurationRequest)) {
            return false;
        }

        GetOpsiConfigurationRequest other = (GetOpsiConfigurationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opsiConfigurationId, other.opsiConfigurationId)
                && java.util.Objects.equals(this.opsiConfigField, other.opsiConfigField)
                && java.util.Objects.equals(
                        this.configItemCustomStatus, other.configItemCustomStatus)
                && java.util.Objects.equals(
                        this.configItemsApplicableContext, other.configItemsApplicableContext)
                && java.util.Objects.equals(this.configItemField, other.configItemField)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.opsiConfigurationId == null
                                ? 43
                                : this.opsiConfigurationId.hashCode());
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
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
