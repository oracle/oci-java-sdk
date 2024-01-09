/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeConfigurationItemsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * SummarizeConfigurationItemsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class SummarizeConfigurationItemsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** Filter to return configuration items based on configuration type of OPSI configuration. */
    private com.oracle.bmc.opsi.model.OpsiConfigurationType opsiConfigType;

    /** Filter to return configuration items based on configuration type of OPSI configuration. */
    public com.oracle.bmc.opsi.model.OpsiConfigurationType getOpsiConfigType() {
        return opsiConfigType;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine). Example:
     * {@code 50}
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine). Example:
     * {@code 50}
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
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
        ValueSourceConfig("valueSourceConfig"),
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
    /** A filter to return only configuration items that match the entire name. */
    private String name;

    /** A filter to return only configuration items that match the entire name. */
    public String getName() {
        return name;
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SummarizeConfigurationItemsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Filter to return configuration items based on configuration type of OPSI configuration.
         */
        private com.oracle.bmc.opsi.model.OpsiConfigurationType opsiConfigType = null;

        /**
         * Filter to return configuration items based on configuration type of OPSI configuration.
         *
         * @param opsiConfigType the value to set
         * @return this builder instance
         */
        public Builder opsiConfigType(
                com.oracle.bmc.opsi.model.OpsiConfigurationType opsiConfigType) {
            this.opsiConfigType = opsiConfigType;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
         * Example: {@code 50}
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
         * Example: {@code 50}
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
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

        /** A filter to return only configuration items that match the entire name. */
        private String name = null;

        /**
         * A filter to return only configuration items that match the entire name.
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
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
        public Builder copy(SummarizeConfigurationItemsRequest o) {
            compartmentId(o.getCompartmentId());
            opsiConfigType(o.getOpsiConfigType());
            limit(o.getLimit());
            page(o.getPage());
            configItemsApplicableContext(o.getConfigItemsApplicableContext());
            configItemField(o.getConfigItemField());
            name(o.getName());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SummarizeConfigurationItemsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of SummarizeConfigurationItemsRequest
         */
        public SummarizeConfigurationItemsRequest build() {
            SummarizeConfigurationItemsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of SummarizeConfigurationItemsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SummarizeConfigurationItemsRequest
         */
        public SummarizeConfigurationItemsRequest buildWithoutInvocationCallback() {
            SummarizeConfigurationItemsRequest request = new SummarizeConfigurationItemsRequest();
            request.compartmentId = compartmentId;
            request.opsiConfigType = opsiConfigType;
            request.limit = limit;
            request.page = page;
            request.configItemsApplicableContext = configItemsApplicableContext;
            request.configItemField = configItemField;
            request.name = name;
            request.opcRequestId = opcRequestId;
            return request;
            // new SummarizeConfigurationItemsRequest(compartmentId, opsiConfigType, limit, page,
            // configItemsApplicableContext, configItemField, name, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .opsiConfigType(opsiConfigType)
                .limit(limit)
                .page(page)
                .configItemsApplicableContext(configItemsApplicableContext)
                .configItemField(configItemField)
                .name(name)
                .opcRequestId(opcRequestId);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",opsiConfigType=").append(String.valueOf(this.opsiConfigType));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",configItemsApplicableContext=")
                .append(String.valueOf(this.configItemsApplicableContext));
        sb.append(",configItemField=").append(String.valueOf(this.configItemField));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeConfigurationItemsRequest)) {
            return false;
        }

        SummarizeConfigurationItemsRequest other = (SummarizeConfigurationItemsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.opsiConfigType, other.opsiConfigType)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(
                        this.configItemsApplicableContext, other.configItemsApplicableContext)
                && java.util.Objects.equals(this.configItemField, other.configItemField)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.opsiConfigType == null ? 43 : this.opsiConfigType.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.configItemsApplicableContext == null
                                ? 43
                                : this.configItemsApplicableContext.hashCode());
        result =
                (result * PRIME)
                        + (this.configItemField == null ? 43 : this.configItemField.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
