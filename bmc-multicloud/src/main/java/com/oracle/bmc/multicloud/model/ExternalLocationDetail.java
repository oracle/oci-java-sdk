/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.multicloud.model;

/**
 * External location for CSP Region, CSP-Physical-AZ, CSP-Logical-AZ <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExternalLocationDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExternalLocationDetail
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "cspRegion",
        "cspRegionDisplayName",
        "cspPhysicalAz",
        "cspPhysicalAzDisplayName",
        "cspZoneKeyReferenceId",
        "cspLogicalAz",
        "serviceName"
    })
    public ExternalLocationDetail(
            String cspRegion,
            String cspRegionDisplayName,
            String cspPhysicalAz,
            String cspPhysicalAzDisplayName,
            CspZoneKeyReferenceId cspZoneKeyReferenceId,
            String cspLogicalAz,
            SubscriptionType serviceName) {
        super();
        this.cspRegion = cspRegion;
        this.cspRegionDisplayName = cspRegionDisplayName;
        this.cspPhysicalAz = cspPhysicalAz;
        this.cspPhysicalAzDisplayName = cspPhysicalAzDisplayName;
        this.cspZoneKeyReferenceId = cspZoneKeyReferenceId;
        this.cspLogicalAz = cspLogicalAz;
        this.serviceName = serviceName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** CSP region corresponding to the given OCI region */
        @com.fasterxml.jackson.annotation.JsonProperty("cspRegion")
        private String cspRegion;

        /**
         * CSP region corresponding to the given OCI region
         *
         * @param cspRegion the value to set
         * @return this builder
         */
        public Builder cspRegion(String cspRegion) {
            this.cspRegion = cspRegion;
            this.__explicitlySet__.add("cspRegion");
            return this;
        }
        /** CSP region display Name corresponding to the given OCI region */
        @com.fasterxml.jackson.annotation.JsonProperty("cspRegionDisplayName")
        private String cspRegionDisplayName;

        /**
         * CSP region display Name corresponding to the given OCI region
         *
         * @param cspRegionDisplayName the value to set
         * @return this builder
         */
        public Builder cspRegionDisplayName(String cspRegionDisplayName) {
            this.cspRegionDisplayName = cspRegionDisplayName;
            this.__explicitlySet__.add("cspRegionDisplayName");
            return this;
        }
        /** A mapping of OCI site group name to CSP physical availability zone name */
        @com.fasterxml.jackson.annotation.JsonProperty("cspPhysicalAz")
        private String cspPhysicalAz;

        /**
         * A mapping of OCI site group name to CSP physical availability zone name
         *
         * @param cspPhysicalAz the value to set
         * @return this builder
         */
        public Builder cspPhysicalAz(String cspPhysicalAz) {
            this.cspPhysicalAz = cspPhysicalAz;
            this.__explicitlySet__.add("cspPhysicalAz");
            return this;
        }
        /** User friendly display name for cspPhysicalAZ */
        @com.fasterxml.jackson.annotation.JsonProperty("cspPhysicalAzDisplayName")
        private String cspPhysicalAzDisplayName;

        /**
         * User friendly display name for cspPhysicalAZ
         *
         * @param cspPhysicalAzDisplayName the value to set
         * @return this builder
         */
        public Builder cspPhysicalAzDisplayName(String cspPhysicalAzDisplayName) {
            this.cspPhysicalAzDisplayName = cspPhysicalAzDisplayName;
            this.__explicitlySet__.add("cspPhysicalAzDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cspZoneKeyReferenceId")
        private CspZoneKeyReferenceId cspZoneKeyReferenceId;

        public Builder cspZoneKeyReferenceId(CspZoneKeyReferenceId cspZoneKeyReferenceId) {
            this.cspZoneKeyReferenceId = cspZoneKeyReferenceId;
            this.__explicitlySet__.add("cspZoneKeyReferenceId");
            return this;
        }
        /** A mapping of CSP physical availability zone to CSP logical availability zone. */
        @com.fasterxml.jackson.annotation.JsonProperty("cspLogicalAz")
        private String cspLogicalAz;

        /**
         * A mapping of CSP physical availability zone to CSP logical availability zone.
         *
         * @param cspLogicalAz the value to set
         * @return this builder
         */
        public Builder cspLogicalAz(String cspLogicalAz) {
            this.cspLogicalAz = cspLogicalAz;
            this.__explicitlySet__.add("cspLogicalAz");
            return this;
        }
        /** The serviceName that externalLocation map object belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private SubscriptionType serviceName;

        /**
         * The serviceName that externalLocation map object belongs to.
         *
         * @param serviceName the value to set
         * @return this builder
         */
        public Builder serviceName(SubscriptionType serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalLocationDetail build() {
            ExternalLocationDetail model =
                    new ExternalLocationDetail(
                            this.cspRegion,
                            this.cspRegionDisplayName,
                            this.cspPhysicalAz,
                            this.cspPhysicalAzDisplayName,
                            this.cspZoneKeyReferenceId,
                            this.cspLogicalAz,
                            this.serviceName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalLocationDetail model) {
            if (model.wasPropertyExplicitlySet("cspRegion")) {
                this.cspRegion(model.getCspRegion());
            }
            if (model.wasPropertyExplicitlySet("cspRegionDisplayName")) {
                this.cspRegionDisplayName(model.getCspRegionDisplayName());
            }
            if (model.wasPropertyExplicitlySet("cspPhysicalAz")) {
                this.cspPhysicalAz(model.getCspPhysicalAz());
            }
            if (model.wasPropertyExplicitlySet("cspPhysicalAzDisplayName")) {
                this.cspPhysicalAzDisplayName(model.getCspPhysicalAzDisplayName());
            }
            if (model.wasPropertyExplicitlySet("cspZoneKeyReferenceId")) {
                this.cspZoneKeyReferenceId(model.getCspZoneKeyReferenceId());
            }
            if (model.wasPropertyExplicitlySet("cspLogicalAz")) {
                this.cspLogicalAz(model.getCspLogicalAz());
            }
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** CSP region corresponding to the given OCI region */
    @com.fasterxml.jackson.annotation.JsonProperty("cspRegion")
    private final String cspRegion;

    /**
     * CSP region corresponding to the given OCI region
     *
     * @return the value
     */
    public String getCspRegion() {
        return cspRegion;
    }

    /** CSP region display Name corresponding to the given OCI region */
    @com.fasterxml.jackson.annotation.JsonProperty("cspRegionDisplayName")
    private final String cspRegionDisplayName;

    /**
     * CSP region display Name corresponding to the given OCI region
     *
     * @return the value
     */
    public String getCspRegionDisplayName() {
        return cspRegionDisplayName;
    }

    /** A mapping of OCI site group name to CSP physical availability zone name */
    @com.fasterxml.jackson.annotation.JsonProperty("cspPhysicalAz")
    private final String cspPhysicalAz;

    /**
     * A mapping of OCI site group name to CSP physical availability zone name
     *
     * @return the value
     */
    public String getCspPhysicalAz() {
        return cspPhysicalAz;
    }

    /** User friendly display name for cspPhysicalAZ */
    @com.fasterxml.jackson.annotation.JsonProperty("cspPhysicalAzDisplayName")
    private final String cspPhysicalAzDisplayName;

    /**
     * User friendly display name for cspPhysicalAZ
     *
     * @return the value
     */
    public String getCspPhysicalAzDisplayName() {
        return cspPhysicalAzDisplayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cspZoneKeyReferenceId")
    private final CspZoneKeyReferenceId cspZoneKeyReferenceId;

    public CspZoneKeyReferenceId getCspZoneKeyReferenceId() {
        return cspZoneKeyReferenceId;
    }

    /** A mapping of CSP physical availability zone to CSP logical availability zone. */
    @com.fasterxml.jackson.annotation.JsonProperty("cspLogicalAz")
    private final String cspLogicalAz;

    /**
     * A mapping of CSP physical availability zone to CSP logical availability zone.
     *
     * @return the value
     */
    public String getCspLogicalAz() {
        return cspLogicalAz;
    }

    /** The serviceName that externalLocation map object belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final SubscriptionType serviceName;

    /**
     * The serviceName that externalLocation map object belongs to.
     *
     * @return the value
     */
    public SubscriptionType getServiceName() {
        return serviceName;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ExternalLocationDetail(");
        sb.append("super=").append(super.toString());
        sb.append("cspRegion=").append(String.valueOf(this.cspRegion));
        sb.append(", cspRegionDisplayName=").append(String.valueOf(this.cspRegionDisplayName));
        sb.append(", cspPhysicalAz=").append(String.valueOf(this.cspPhysicalAz));
        sb.append(", cspPhysicalAzDisplayName=")
                .append(String.valueOf(this.cspPhysicalAzDisplayName));
        sb.append(", cspZoneKeyReferenceId=").append(String.valueOf(this.cspZoneKeyReferenceId));
        sb.append(", cspLogicalAz=").append(String.valueOf(this.cspLogicalAz));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalLocationDetail)) {
            return false;
        }

        ExternalLocationDetail other = (ExternalLocationDetail) o;
        return java.util.Objects.equals(this.cspRegion, other.cspRegion)
                && java.util.Objects.equals(this.cspRegionDisplayName, other.cspRegionDisplayName)
                && java.util.Objects.equals(this.cspPhysicalAz, other.cspPhysicalAz)
                && java.util.Objects.equals(
                        this.cspPhysicalAzDisplayName, other.cspPhysicalAzDisplayName)
                && java.util.Objects.equals(this.cspZoneKeyReferenceId, other.cspZoneKeyReferenceId)
                && java.util.Objects.equals(this.cspLogicalAz, other.cspLogicalAz)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.cspRegion == null ? 43 : this.cspRegion.hashCode());
        result =
                (result * PRIME)
                        + (this.cspRegionDisplayName == null
                                ? 43
                                : this.cspRegionDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.cspPhysicalAz == null ? 43 : this.cspPhysicalAz.hashCode());
        result =
                (result * PRIME)
                        + (this.cspPhysicalAzDisplayName == null
                                ? 43
                                : this.cspPhysicalAzDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.cspZoneKeyReferenceId == null
                                ? 43
                                : this.cspZoneKeyReferenceId.hashCode());
        result = (result * PRIME) + (this.cspLogicalAz == null ? 43 : this.cspLogicalAz.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
