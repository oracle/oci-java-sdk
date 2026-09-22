/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.requests;

import com.oracle.bmc.generativeai.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/ListModelDiscoveryExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListModelDiscoveryRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public class ListModelDiscoveryRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment in which to list resources.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment in which to list resources.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** A filter to return only resources whose realm matches the given realm. */
    private java.util.List<String> realm;

    /** A filter to return only resources whose realm matches the given realm. */
    public java.util.List<String> getRealm() {
        return realm;
    }
    /** A filter to return only resources whose region matches the given region. */
    private java.util.List<String> region;

    /** A filter to return only resources whose region matches the given region. */
    public java.util.List<String> getRegion() {
        return region;
    }
    /** A filter to return only resources whose model identifier matches the given modelId. */
    private String modelId;

    /** A filter to return only resources whose model identifier matches the given modelId. */
    public String getModelId() {
        return modelId;
    }
    /** A filter to return only resources whose serving modes match the given servingModes. */
    private java.util.List<ServingMode> servingMode;

    /** A filter to return only resources whose serving modes match the given servingModes. */
    public enum ServingMode implements com.oracle.bmc.http.internal.BmcEnum {
        OnDemand("ON_DEMAND"),
        Dedicated("DEDICATED"),
        ;

        private final String value;
        private static java.util.Map<String, ServingMode> map;

        static {
            map = new java.util.HashMap<>();
            for (ServingMode v : ServingMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        ServingMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ServingMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ServingMode: " + key);
        }
    };

    /** A filter to return only resources whose serving modes match the given servingModes. */
    public java.util.List<ServingMode> getServingMode() {
        return servingMode;
    }
    /** Filter models that support any of the specified API capabilities. */
    private java.util.List<String> apiCapability;

    /** Filter models that support any of the specified API capabilities. */
    public java.util.List<String> getApiCapability() {
        return apiCapability;
    }
    /** A filter to return only resources their capability matches the given capability. */
    private java.util.List<com.oracle.bmc.generativeai.model.ModelCapability> capability;

    /** A filter to return only resources their capability matches the given capability. */
    public java.util.List<com.oracle.bmc.generativeai.model.ModelCapability> getCapability() {
        return capability;
    }
    /** Filter models by access type. */
    private java.util.List<ModelAccess> modelAccess;

    /** Filter models by access type. */
    public enum ModelAccess implements com.oracle.bmc.http.internal.BmcEnum {
        Hosted("HOSTED"),
        Proxy("PROXY"),
        ;

        private final String value;
        private static java.util.Map<String, ModelAccess> map;

        static {
            map = new java.util.HashMap<>();
            for (ModelAccess v : ModelAccess.values()) {
                map.put(v.getValue(), v);
            }
        }

        ModelAccess(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ModelAccess create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ModelAccess: " + key);
        }
    };

    /** Filter models by access type. */
    public java.util.List<ModelAccess> getModelAccess() {
        return modelAccess;
    }
    /** If true, return only deprecated models; if false, exclude deprecated models. */
    private Boolean isDeprecated;

    /** If true, return only deprecated models; if false, exclude deprecated models. */
    public Boolean getIsDeprecated() {
        return isDeprecated;
    }
    /** Filter models based on on-demand retirement status. */
    private Boolean isOnDemandRetired;

    /** Filter models based on on-demand retirement status. */
    public Boolean getIsOnDemandRetired() {
        return isOnDemandRetired;
    }
    /** Filter models based on dedicated retirement status. */
    private Boolean isDedicatedRetired;

    /** Filter models based on dedicated retirement status. */
    public Boolean getIsDedicatedRetired() {
        return isDedicatedRetired;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID. The only valid characters for request IDs
     * are letters, numbers, underscore, and dash.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID. The only valid characters for request IDs
     * are letters, numbers, underscore, and dash.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the opc-next-page response header from the previous "List"
     * call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value of the opc-next-page response header from the previous "List"
     * call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListModelDiscoveryRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment in which to list resources.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment in which to list resources.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** A filter to return only resources whose realm matches the given realm. */
        private java.util.List<String> realm = null;

        /**
         * A filter to return only resources whose realm matches the given realm.
         *
         * @param realm the value to set
         * @return this builder instance
         */
        public Builder realm(java.util.List<String> realm) {
            this.realm = realm;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources whose realm matches the given realm.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder realm(String singularValue) {
            return this.realm(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return only resources whose region matches the given region. */
        private java.util.List<String> region = null;

        /**
         * A filter to return only resources whose region matches the given region.
         *
         * @param region the value to set
         * @return this builder instance
         */
        public Builder region(java.util.List<String> region) {
            this.region = region;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources whose region matches the given region.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder region(String singularValue) {
            return this.region(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return only resources whose model identifier matches the given modelId. */
        private String modelId = null;

        /**
         * A filter to return only resources whose model identifier matches the given modelId.
         *
         * @param modelId the value to set
         * @return this builder instance
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            return this;
        }

        /** A filter to return only resources whose serving modes match the given servingModes. */
        private java.util.List<ServingMode> servingMode = null;

        /**
         * A filter to return only resources whose serving modes match the given servingModes.
         *
         * @param servingMode the value to set
         * @return this builder instance
         */
        public Builder servingMode(java.util.List<ServingMode> servingMode) {
            this.servingMode = servingMode;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources whose serving modes match the given
         * servingModes.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder servingMode(ServingMode singularValue) {
            return this.servingMode(java.util.Arrays.asList(singularValue));
        }

        /** Filter models that support any of the specified API capabilities. */
        private java.util.List<String> apiCapability = null;

        /**
         * Filter models that support any of the specified API capabilities.
         *
         * @param apiCapability the value to set
         * @return this builder instance
         */
        public Builder apiCapability(java.util.List<String> apiCapability) {
            this.apiCapability = apiCapability;
            return this;
        }

        /**
         * Singular setter. Filter models that support any of the specified API capabilities.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder apiCapability(String singularValue) {
            return this.apiCapability(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return only resources their capability matches the given capability. */
        private java.util.List<com.oracle.bmc.generativeai.model.ModelCapability> capability = null;

        /**
         * A filter to return only resources their capability matches the given capability.
         *
         * @param capability the value to set
         * @return this builder instance
         */
        public Builder capability(
                java.util.List<com.oracle.bmc.generativeai.model.ModelCapability> capability) {
            this.capability = capability;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources their capability matches the given
         * capability.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder capability(ModelCapability singularValue) {
            return this.capability(java.util.Arrays.asList(singularValue));
        }

        /** Filter models by access type. */
        private java.util.List<ModelAccess> modelAccess = null;

        /**
         * Filter models by access type.
         *
         * @param modelAccess the value to set
         * @return this builder instance
         */
        public Builder modelAccess(java.util.List<ModelAccess> modelAccess) {
            this.modelAccess = modelAccess;
            return this;
        }

        /**
         * Singular setter. Filter models by access type.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder modelAccess(ModelAccess singularValue) {
            return this.modelAccess(java.util.Arrays.asList(singularValue));
        }

        /** If true, return only deprecated models; if false, exclude deprecated models. */
        private Boolean isDeprecated = null;

        /**
         * If true, return only deprecated models; if false, exclude deprecated models.
         *
         * @param isDeprecated the value to set
         * @return this builder instance
         */
        public Builder isDeprecated(Boolean isDeprecated) {
            this.isDeprecated = isDeprecated;
            return this;
        }

        /** Filter models based on on-demand retirement status. */
        private Boolean isOnDemandRetired = null;

        /**
         * Filter models based on on-demand retirement status.
         *
         * @param isOnDemandRetired the value to set
         * @return this builder instance
         */
        public Builder isOnDemandRetired(Boolean isOnDemandRetired) {
            this.isOnDemandRetired = isOnDemandRetired;
            return this;
        }

        /** Filter models based on dedicated retirement status. */
        private Boolean isDedicatedRetired = null;

        /**
         * Filter models based on dedicated retirement status.
         *
         * @param isDedicatedRetired the value to set
         * @return this builder instance
         */
        public Builder isDedicatedRetired(Boolean isDedicatedRetired) {
            this.isDedicatedRetired = isDedicatedRetired;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID. The only valid characters for request
         * IDs are letters, numbers, underscore, and dash.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID. The only valid characters for request
         * IDs are letters, numbers, underscore, and dash.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The value of the opc-next-page response header from the previous
         * "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value of the opc-next-page response header from the previous
         * "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
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
        public Builder copy(ListModelDiscoveryRequest o) {
            compartmentId(o.getCompartmentId());
            realm(o.getRealm());
            region(o.getRegion());
            modelId(o.getModelId());
            servingMode(o.getServingMode());
            apiCapability(o.getApiCapability());
            capability(o.getCapability());
            modelAccess(o.getModelAccess());
            isDeprecated(o.getIsDeprecated());
            isOnDemandRetired(o.getIsOnDemandRetired());
            isDedicatedRetired(o.getIsDedicatedRetired());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListModelDiscoveryRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListModelDiscoveryRequest
         */
        public ListModelDiscoveryRequest build() {
            ListModelDiscoveryRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListModelDiscoveryRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListModelDiscoveryRequest
         */
        public ListModelDiscoveryRequest buildWithoutInvocationCallback() {
            ListModelDiscoveryRequest request = new ListModelDiscoveryRequest();
            request.compartmentId = compartmentId;
            request.realm = realm;
            request.region = region;
            request.modelId = modelId;
            request.servingMode = servingMode;
            request.apiCapability = apiCapability;
            request.capability = capability;
            request.modelAccess = modelAccess;
            request.isDeprecated = isDeprecated;
            request.isOnDemandRetired = isOnDemandRetired;
            request.isDedicatedRetired = isDedicatedRetired;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            return request;
            // new ListModelDiscoveryRequest(compartmentId, realm, region, modelId, servingMode,
            // apiCapability, capability, modelAccess, isDeprecated, isOnDemandRetired,
            // isDedicatedRetired, opcRequestId, limit, page);
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
                .realm(realm)
                .region(region)
                .modelId(modelId)
                .servingMode(servingMode)
                .apiCapability(apiCapability)
                .capability(capability)
                .modelAccess(modelAccess)
                .isDeprecated(isDeprecated)
                .isOnDemandRetired(isOnDemandRetired)
                .isDedicatedRetired(isDedicatedRetired)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page);
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
        sb.append(",realm=").append(String.valueOf(this.realm));
        sb.append(",region=").append(String.valueOf(this.region));
        sb.append(",modelId=").append(String.valueOf(this.modelId));
        sb.append(",servingMode=").append(String.valueOf(this.servingMode));
        sb.append(",apiCapability=").append(String.valueOf(this.apiCapability));
        sb.append(",capability=").append(String.valueOf(this.capability));
        sb.append(",modelAccess=").append(String.valueOf(this.modelAccess));
        sb.append(",isDeprecated=").append(String.valueOf(this.isDeprecated));
        sb.append(",isOnDemandRetired=").append(String.valueOf(this.isOnDemandRetired));
        sb.append(",isDedicatedRetired=").append(String.valueOf(this.isDedicatedRetired));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListModelDiscoveryRequest)) {
            return false;
        }

        ListModelDiscoveryRequest other = (ListModelDiscoveryRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.realm, other.realm)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.modelId, other.modelId)
                && java.util.Objects.equals(this.servingMode, other.servingMode)
                && java.util.Objects.equals(this.apiCapability, other.apiCapability)
                && java.util.Objects.equals(this.capability, other.capability)
                && java.util.Objects.equals(this.modelAccess, other.modelAccess)
                && java.util.Objects.equals(this.isDeprecated, other.isDeprecated)
                && java.util.Objects.equals(this.isOnDemandRetired, other.isOnDemandRetired)
                && java.util.Objects.equals(this.isDedicatedRetired, other.isDedicatedRetired)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.realm == null ? 43 : this.realm.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.modelId == null ? 43 : this.modelId.hashCode());
        result = (result * PRIME) + (this.servingMode == null ? 43 : this.servingMode.hashCode());
        result =
                (result * PRIME)
                        + (this.apiCapability == null ? 43 : this.apiCapability.hashCode());
        result = (result * PRIME) + (this.capability == null ? 43 : this.capability.hashCode());
        result = (result * PRIME) + (this.modelAccess == null ? 43 : this.modelAccess.hashCode());
        result = (result * PRIME) + (this.isDeprecated == null ? 43 : this.isDeprecated.hashCode());
        result =
                (result * PRIME)
                        + (this.isOnDemandRetired == null ? 43 : this.isOnDemandRetired.hashCode());
        result =
                (result * PRIME)
                        + (this.isDedicatedRetired == null
                                ? 43
                                : this.isDedicatedRetired.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        return result;
    }
}
