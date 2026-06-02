/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourceanalytics.model;

/**
 * Additional details needed when attaching the OAC instance.
 * <p>
 * Example: {@code {"idcsDomainId":"ocid...","networkDetails":{...}, ...}}
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ResourceAnalyticsInstanceOacAttachmentDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResourceAnalyticsInstanceOacAttachmentDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "idcsDomainId",
        "networkDetails",
        "subnetId",
        "nsgIds",
        "licenseModel",
        "capacityType",
        "capacityValue"
    })
    public ResourceAnalyticsInstanceOacAttachmentDetails(
            String idcsDomainId,
            ResourceAnalyticsInstanceOacNetworkDetails networkDetails,
            String subnetId,
            java.util.List<String> nsgIds,
            LicenseModel licenseModel,
            CapacityType capacityType,
            Integer capacityValue) {
        super();
        this.idcsDomainId = idcsDomainId;
        this.networkDetails = networkDetails;
        this.subnetId = subnetId;
        this.nsgIds = nsgIds;
        this.licenseModel = licenseModel;
        this.capacityType = capacityType;
        this.capacityValue = capacityValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * IDCS domain [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) identifying a stripe and service administrator user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsDomainId")
        private String idcsDomainId;

        /**
         * IDCS domain [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) identifying a stripe and service administrator user.
         * @param idcsDomainId the value to set
         * @return this builder
         **/
        public Builder idcsDomainId(String idcsDomainId) {
            this.idcsDomainId = idcsDomainId;
            this.__explicitlySet__.add("idcsDomainId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkDetails")
        private ResourceAnalyticsInstanceOacNetworkDetails networkDetails;

        public Builder networkDetails(ResourceAnalyticsInstanceOacNetworkDetails networkDetails) {
            this.networkDetails = networkDetails;
            this.__explicitlySet__.add("networkDetails");
            return this;
        }
        /**
         * Deprecated. Use {@code networkDetails.subnetId} instead.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * Deprecated. Use {@code networkDetails.subnetId} instead.
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * Deprecated. Use {@code networkDetails.nsgIds} instead.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * Deprecated. Use {@code networkDetails.nsgIds} instead.
         * @param nsgIds the value to set
         * @return this builder
         **/
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /**
         * The Oracle license model that applies to the OAC instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to the OAC instance.
         * @param licenseModel the value to set
         * @return this builder
         **/
        public Builder licenseModel(LicenseModel licenseModel) {
            this.licenseModel = licenseModel;
            this.__explicitlySet__.add("licenseModel");
            return this;
        }
        /**
         * The capacity model to use for the Analytics Instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("capacityType")
        private CapacityType capacityType;

        /**
         * The capacity model to use for the Analytics Instance.
         * @param capacityType the value to set
         * @return this builder
         **/
        public Builder capacityType(CapacityType capacityType) {
            this.capacityType = capacityType;
            this.__explicitlySet__.add("capacityType");
            return this;
        }
        /**
         * The capacity value selected, either the number of OCPUs (OLPU_COUNT) or the number of users (USER_COUNT). This parameter affects the number of OCPUs, amount of memory, and other resources allocated to the Analytics Instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("capacityValue")
        private Integer capacityValue;

        /**
         * The capacity value selected, either the number of OCPUs (OLPU_COUNT) or the number of users (USER_COUNT). This parameter affects the number of OCPUs, amount of memory, and other resources allocated to the Analytics Instance.
         * @param capacityValue the value to set
         * @return this builder
         **/
        public Builder capacityValue(Integer capacityValue) {
            this.capacityValue = capacityValue;
            this.__explicitlySet__.add("capacityValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceAnalyticsInstanceOacAttachmentDetails build() {
            ResourceAnalyticsInstanceOacAttachmentDetails model =
                    new ResourceAnalyticsInstanceOacAttachmentDetails(
                            this.idcsDomainId,
                            this.networkDetails,
                            this.subnetId,
                            this.nsgIds,
                            this.licenseModel,
                            this.capacityType,
                            this.capacityValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceAnalyticsInstanceOacAttachmentDetails model) {
            if (model.wasPropertyExplicitlySet("idcsDomainId")) {
                this.idcsDomainId(model.getIdcsDomainId());
            }
            if (model.wasPropertyExplicitlySet("networkDetails")) {
                this.networkDetails(model.getNetworkDetails());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("capacityType")) {
                this.capacityType(model.getCapacityType());
            }
            if (model.wasPropertyExplicitlySet("capacityValue")) {
                this.capacityValue(model.getCapacityValue());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * IDCS domain [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) identifying a stripe and service administrator user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsDomainId")
    private final String idcsDomainId;

    /**
     * IDCS domain [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) identifying a stripe and service administrator user.
     * @return the value
     **/
    public String getIdcsDomainId() {
        return idcsDomainId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkDetails")
    private final ResourceAnalyticsInstanceOacNetworkDetails networkDetails;

    public ResourceAnalyticsInstanceOacNetworkDetails getNetworkDetails() {
        return networkDetails;
    }

    /**
     * Deprecated. Use {@code networkDetails.subnetId} instead.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * Deprecated. Use {@code networkDetails.subnetId} instead.
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * Deprecated. Use {@code networkDetails.nsgIds} instead.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * Deprecated. Use {@code networkDetails.nsgIds} instead.
     * @return the value
     **/
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * The Oracle license model that applies to the OAC instance.
     **/
    public enum LicenseModel {
        LicenseIncluded("LICENSE_INCLUDED"),
        BringYourOwnLicense("BRING_YOUR_OWN_LICENSE"),
        ;

        private final String value;
        private static java.util.Map<String, LicenseModel> map;

        static {
            map = new java.util.HashMap<>();
            for (LicenseModel v : LicenseModel.values()) {
                map.put(v.getValue(), v);
            }
        }

        LicenseModel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LicenseModel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid LicenseModel: " + key);
        }
    };
    /**
     * The Oracle license model that applies to the OAC instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to the OAC instance.
     * @return the value
     **/
    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    /**
     * The capacity model to use for the Analytics Instance.
     **/
    public enum CapacityType {
        OlpuCount("OLPU_COUNT"),
        UserCount("USER_COUNT"),
        ;

        private final String value;
        private static java.util.Map<String, CapacityType> map;

        static {
            map = new java.util.HashMap<>();
            for (CapacityType v : CapacityType.values()) {
                map.put(v.getValue(), v);
            }
        }

        CapacityType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CapacityType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid CapacityType: " + key);
        }
    };
    /**
     * The capacity model to use for the Analytics Instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("capacityType")
    private final CapacityType capacityType;

    /**
     * The capacity model to use for the Analytics Instance.
     * @return the value
     **/
    public CapacityType getCapacityType() {
        return capacityType;
    }

    /**
     * The capacity value selected, either the number of OCPUs (OLPU_COUNT) or the number of users (USER_COUNT). This parameter affects the number of OCPUs, amount of memory, and other resources allocated to the Analytics Instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("capacityValue")
    private final Integer capacityValue;

    /**
     * The capacity value selected, either the number of OCPUs (OLPU_COUNT) or the number of users (USER_COUNT). This parameter affects the number of OCPUs, amount of memory, and other resources allocated to the Analytics Instance.
     * @return the value
     **/
    public Integer getCapacityValue() {
        return capacityValue;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ResourceAnalyticsInstanceOacAttachmentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("idcsDomainId=").append(String.valueOf(this.idcsDomainId));
        sb.append(", networkDetails=").append(String.valueOf(this.networkDetails));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", capacityType=").append(String.valueOf(this.capacityType));
        sb.append(", capacityValue=").append(String.valueOf(this.capacityValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceAnalyticsInstanceOacAttachmentDetails)) {
            return false;
        }

        ResourceAnalyticsInstanceOacAttachmentDetails other =
                (ResourceAnalyticsInstanceOacAttachmentDetails) o;
        return java.util.Objects.equals(this.idcsDomainId, other.idcsDomainId)
                && java.util.Objects.equals(this.networkDetails, other.networkDetails)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(this.capacityType, other.capacityType)
                && java.util.Objects.equals(this.capacityValue, other.capacityValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.idcsDomainId == null ? 43 : this.idcsDomainId.hashCode());
        result =
                (result * PRIME)
                        + (this.networkDetails == null ? 43 : this.networkDetails.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result = (result * PRIME) + (this.capacityType == null ? 43 : this.capacityType.hashCode());
        result =
                (result * PRIME)
                        + (this.capacityValue == null ? 43 : this.capacityValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
