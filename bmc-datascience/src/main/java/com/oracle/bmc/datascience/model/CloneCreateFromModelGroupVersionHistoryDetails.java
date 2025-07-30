/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Parameters needed to cloning a model group from latest model group in model group version
 * history. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CloneCreateFromModelGroupVersionHistoryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelGroupCloneSourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CloneCreateFromModelGroupVersionHistoryDetails
        extends ModelGroupCloneSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * model group version history.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private String sourceId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * model group version history.
         *
         * @param sourceId the value to set
         * @return this builder
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modifyModelGroupDetails")
        private ModifyModelGroupDetails modifyModelGroupDetails;

        public Builder modifyModelGroupDetails(ModifyModelGroupDetails modifyModelGroupDetails) {
            this.modifyModelGroupDetails = modifyModelGroupDetails;
            this.__explicitlySet__.add("modifyModelGroupDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patchModelGroupMemberModelDetails")
        private PatchModelGroupMemberModelDetails patchModelGroupMemberModelDetails;

        public Builder patchModelGroupMemberModelDetails(
                PatchModelGroupMemberModelDetails patchModelGroupMemberModelDetails) {
            this.patchModelGroupMemberModelDetails = patchModelGroupMemberModelDetails;
            this.__explicitlySet__.add("patchModelGroupMemberModelDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CloneCreateFromModelGroupVersionHistoryDetails build() {
            CloneCreateFromModelGroupVersionHistoryDetails model =
                    new CloneCreateFromModelGroupVersionHistoryDetails(
                            this.sourceId,
                            this.modifyModelGroupDetails,
                            this.patchModelGroupMemberModelDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CloneCreateFromModelGroupVersionHistoryDetails model) {
            if (model.wasPropertyExplicitlySet("sourceId")) {
                this.sourceId(model.getSourceId());
            }
            if (model.wasPropertyExplicitlySet("modifyModelGroupDetails")) {
                this.modifyModelGroupDetails(model.getModifyModelGroupDetails());
            }
            if (model.wasPropertyExplicitlySet("patchModelGroupMemberModelDetails")) {
                this.patchModelGroupMemberModelDetails(
                        model.getPatchModelGroupMemberModelDetails());
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
    public CloneCreateFromModelGroupVersionHistoryDetails(
            String sourceId,
            ModifyModelGroupDetails modifyModelGroupDetails,
            PatchModelGroupMemberModelDetails patchModelGroupMemberModelDetails) {
        super();
        this.sourceId = sourceId;
        this.modifyModelGroupDetails = modifyModelGroupDetails;
        this.patchModelGroupMemberModelDetails = patchModelGroupMemberModelDetails;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * model group version history.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final String sourceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * model group version history.
     *
     * @return the value
     */
    public String getSourceId() {
        return sourceId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("modifyModelGroupDetails")
    private final ModifyModelGroupDetails modifyModelGroupDetails;

    public ModifyModelGroupDetails getModifyModelGroupDetails() {
        return modifyModelGroupDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("patchModelGroupMemberModelDetails")
    private final PatchModelGroupMemberModelDetails patchModelGroupMemberModelDetails;

    public PatchModelGroupMemberModelDetails getPatchModelGroupMemberModelDetails() {
        return patchModelGroupMemberModelDetails;
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
        sb.append("CloneCreateFromModelGroupVersionHistoryDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", sourceId=").append(String.valueOf(this.sourceId));
        sb.append(", modifyModelGroupDetails=")
                .append(String.valueOf(this.modifyModelGroupDetails));
        sb.append(", patchModelGroupMemberModelDetails=")
                .append(String.valueOf(this.patchModelGroupMemberModelDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CloneCreateFromModelGroupVersionHistoryDetails)) {
            return false;
        }

        CloneCreateFromModelGroupVersionHistoryDetails other =
                (CloneCreateFromModelGroupVersionHistoryDetails) o;
        return java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(
                        this.modifyModelGroupDetails, other.modifyModelGroupDetails)
                && java.util.Objects.equals(
                        this.patchModelGroupMemberModelDetails,
                        other.patchModelGroupMemberModelDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.modifyModelGroupDetails == null
                                ? 43
                                : this.modifyModelGroupDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.patchModelGroupMemberModelDetails == null
                                ? 43
                                : this.patchModelGroupMemberModelDetails.hashCode());
        return result;
    }
}
