/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * The body for defining an attachment between a steering policy and a domain.
 *
 * <p>**Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateSteeringPolicyAttachmentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateSteeringPolicyAttachmentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"steeringPolicyId", "zoneId", "domainName", "displayName"})
    public CreateSteeringPolicyAttachmentDetails(
            String steeringPolicyId, String zoneId, String domainName, String displayName) {
        super();
        this.steeringPolicyId = steeringPolicyId;
        this.zoneId = zoneId;
        this.domainName = domainName;
        this.displayName = displayName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the attached steering policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("steeringPolicyId")
        private String steeringPolicyId;

        /**
         * The OCID of the attached steering policy.
         *
         * @param steeringPolicyId the value to set
         * @return this builder
         */
        public Builder steeringPolicyId(String steeringPolicyId) {
            this.steeringPolicyId = steeringPolicyId;
            this.__explicitlySet__.add("steeringPolicyId");
            return this;
        }
        /** The OCID of the attached zone. */
        @com.fasterxml.jackson.annotation.JsonProperty("zoneId")
        private String zoneId;

        /**
         * The OCID of the attached zone.
         *
         * @param zoneId the value to set
         * @return this builder
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            this.__explicitlySet__.add("zoneId");
            return this;
        }
        /** The attached domain within the attached zone. */
        @com.fasterxml.jackson.annotation.JsonProperty("domainName")
        private String domainName;

        /**
         * The attached domain within the attached zone.
         *
         * @param domainName the value to set
         * @return this builder
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            this.__explicitlySet__.add("domainName");
            return this;
        }
        /**
         * A user-friendly name for the steering policy attachment. Does not have to be unique and
         * can be changed. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for the steering policy attachment. Does not have to be unique and
         * can be changed. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSteeringPolicyAttachmentDetails build() {
            CreateSteeringPolicyAttachmentDetails model =
                    new CreateSteeringPolicyAttachmentDetails(
                            this.steeringPolicyId, this.zoneId, this.domainName, this.displayName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSteeringPolicyAttachmentDetails model) {
            if (model.wasPropertyExplicitlySet("steeringPolicyId")) {
                this.steeringPolicyId(model.getSteeringPolicyId());
            }
            if (model.wasPropertyExplicitlySet("zoneId")) {
                this.zoneId(model.getZoneId());
            }
            if (model.wasPropertyExplicitlySet("domainName")) {
                this.domainName(model.getDomainName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
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

    /** The OCID of the attached steering policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("steeringPolicyId")
    private final String steeringPolicyId;

    /**
     * The OCID of the attached steering policy.
     *
     * @return the value
     */
    public String getSteeringPolicyId() {
        return steeringPolicyId;
    }

    /** The OCID of the attached zone. */
    @com.fasterxml.jackson.annotation.JsonProperty("zoneId")
    private final String zoneId;

    /**
     * The OCID of the attached zone.
     *
     * @return the value
     */
    public String getZoneId() {
        return zoneId;
    }

    /** The attached domain within the attached zone. */
    @com.fasterxml.jackson.annotation.JsonProperty("domainName")
    private final String domainName;

    /**
     * The attached domain within the attached zone.
     *
     * @return the value
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * A user-friendly name for the steering policy attachment. Does not have to be unique and can
     * be changed. Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for the steering policy attachment. Does not have to be unique and can
     * be changed. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
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
        sb.append("CreateSteeringPolicyAttachmentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("steeringPolicyId=").append(String.valueOf(this.steeringPolicyId));
        sb.append(", zoneId=").append(String.valueOf(this.zoneId));
        sb.append(", domainName=").append(String.valueOf(this.domainName));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSteeringPolicyAttachmentDetails)) {
            return false;
        }

        CreateSteeringPolicyAttachmentDetails other = (CreateSteeringPolicyAttachmentDetails) o;
        return java.util.Objects.equals(this.steeringPolicyId, other.steeringPolicyId)
                && java.util.Objects.equals(this.zoneId, other.zoneId)
                && java.util.Objects.equals(this.domainName, other.domainName)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.steeringPolicyId == null ? 43 : this.steeringPolicyId.hashCode());
        result = (result * PRIME) + (this.zoneId == null ? 43 : this.zoneId.hashCode());
        result = (result * PRIME) + (this.domainName == null ? 43 : this.domainName.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
