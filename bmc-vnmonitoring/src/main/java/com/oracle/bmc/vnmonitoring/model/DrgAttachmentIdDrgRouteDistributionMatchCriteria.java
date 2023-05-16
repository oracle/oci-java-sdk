/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * The criteria by which a specific attachment will import routes to the DRG. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DrgAttachmentIdDrgRouteDistributionMatchCriteria.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "matchType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DrgAttachmentIdDrgRouteDistributionMatchCriteria
        extends DrgRouteDistributionMatchCriteria {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the DRG attachment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("drgAttachmentId")
        private String drgAttachmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the DRG attachment.
         *
         * @param drgAttachmentId the value to set
         * @return this builder
         */
        public Builder drgAttachmentId(String drgAttachmentId) {
            this.drgAttachmentId = drgAttachmentId;
            this.__explicitlySet__.add("drgAttachmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DrgAttachmentIdDrgRouteDistributionMatchCriteria build() {
            DrgAttachmentIdDrgRouteDistributionMatchCriteria model =
                    new DrgAttachmentIdDrgRouteDistributionMatchCriteria(this.drgAttachmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DrgAttachmentIdDrgRouteDistributionMatchCriteria model) {
            if (model.wasPropertyExplicitlySet("drgAttachmentId")) {
                this.drgAttachmentId(model.getDrgAttachmentId());
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

    @Deprecated
    public DrgAttachmentIdDrgRouteDistributionMatchCriteria(String drgAttachmentId) {
        super();
        this.drgAttachmentId = drgAttachmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the DRG attachment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("drgAttachmentId")
    private final String drgAttachmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the DRG attachment.
     *
     * @return the value
     */
    public String getDrgAttachmentId() {
        return drgAttachmentId;
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
        sb.append("DrgAttachmentIdDrgRouteDistributionMatchCriteria(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", drgAttachmentId=").append(String.valueOf(this.drgAttachmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrgAttachmentIdDrgRouteDistributionMatchCriteria)) {
            return false;
        }

        DrgAttachmentIdDrgRouteDistributionMatchCriteria other =
                (DrgAttachmentIdDrgRouteDistributionMatchCriteria) o;
        return java.util.Objects.equals(this.drgAttachmentId, other.drgAttachmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.drgAttachmentId == null ? 43 : this.drgAttachmentId.hashCode());
        return result;
    }
}
