/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourceanalytics.model;

/**
 * The data to create a TenancyAttachment. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateTenancyAttachmentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateTenancyAttachmentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"description", "resourceAnalyticsInstanceId", "tenancyId"})
    public CreateTenancyAttachmentDetails(
            String description, String resourceAnalyticsInstanceId, String tenancyId) {
        super();
        this.description = description;
        this.resourceAnalyticsInstanceId = resourceAnalyticsInstanceId;
        this.tenancyId = tenancyId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A description of the tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description of the tenancy.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * ResourceAnalyticsInstance associated with this TenancyAttachment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceAnalyticsInstanceId")
        private String resourceAnalyticsInstanceId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * ResourceAnalyticsInstance associated with this TenancyAttachment.
         *
         * @param resourceAnalyticsInstanceId the value to set
         * @return this builder
         */
        public Builder resourceAnalyticsInstanceId(String resourceAnalyticsInstanceId) {
            this.resourceAnalyticsInstanceId = resourceAnalyticsInstanceId;
            this.__explicitlySet__.add("resourceAnalyticsInstanceId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * tenancy associated with this TenancyAttachment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * tenancy associated with this TenancyAttachment.
         *
         * @param tenancyId the value to set
         * @return this builder
         */
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateTenancyAttachmentDetails build() {
            CreateTenancyAttachmentDetails model =
                    new CreateTenancyAttachmentDetails(
                            this.description, this.resourceAnalyticsInstanceId, this.tenancyId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateTenancyAttachmentDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("resourceAnalyticsInstanceId")) {
                this.resourceAnalyticsInstanceId(model.getResourceAnalyticsInstanceId());
            }
            if (model.wasPropertyExplicitlySet("tenancyId")) {
                this.tenancyId(model.getTenancyId());
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

    /** A description of the tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description of the tenancy.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * ResourceAnalyticsInstance associated with this TenancyAttachment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceAnalyticsInstanceId")
    private final String resourceAnalyticsInstanceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * ResourceAnalyticsInstance associated with this TenancyAttachment.
     *
     * @return the value
     */
    public String getResourceAnalyticsInstanceId() {
        return resourceAnalyticsInstanceId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * tenancy associated with this TenancyAttachment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    private final String tenancyId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * tenancy associated with this TenancyAttachment.
     *
     * @return the value
     */
    public String getTenancyId() {
        return tenancyId;
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
        sb.append("CreateTenancyAttachmentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", resourceAnalyticsInstanceId=")
                .append(String.valueOf(this.resourceAnalyticsInstanceId));
        sb.append(", tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateTenancyAttachmentDetails)) {
            return false;
        }

        CreateTenancyAttachmentDetails other = (CreateTenancyAttachmentDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.resourceAnalyticsInstanceId, other.resourceAnalyticsInstanceId)
                && java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceAnalyticsInstanceId == null
                                ? 43
                                : this.resourceAnalyticsInstanceId.hashCode());
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
