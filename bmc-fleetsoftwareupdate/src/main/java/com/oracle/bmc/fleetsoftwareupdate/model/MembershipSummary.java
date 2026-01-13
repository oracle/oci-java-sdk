/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Summary of an Exadata Fleet Update Collection containing a target. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MembershipSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MembershipSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"fsuCollectionId", "fsuCollectionType", "fsuCollectionName"})
    public MembershipSummary(
            String fsuCollectionId, CollectionTypes fsuCollectionType, String fsuCollectionName) {
        super();
        this.fsuCollectionId = fsuCollectionId;
        this.fsuCollectionType = fsuCollectionType;
        this.fsuCollectionName = fsuCollectionName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Exadata Fleet Update Collection.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fsuCollectionId")
        private String fsuCollectionId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Exadata Fleet Update Collection.
         *
         * @param fsuCollectionId the value to set
         * @return this builder
         */
        public Builder fsuCollectionId(String fsuCollectionId) {
            this.fsuCollectionId = fsuCollectionId;
            this.__explicitlySet__.add("fsuCollectionId");
            return this;
        }
        /** Type of Exadata Fleet Update Collection. */
        @com.fasterxml.jackson.annotation.JsonProperty("fsuCollectionType")
        private CollectionTypes fsuCollectionType;

        /**
         * Type of Exadata Fleet Update Collection.
         *
         * @param fsuCollectionType the value to set
         * @return this builder
         */
        public Builder fsuCollectionType(CollectionTypes fsuCollectionType) {
            this.fsuCollectionType = fsuCollectionType;
            this.__explicitlySet__.add("fsuCollectionType");
            return this;
        }
        /** The user-friendly name for the Exadata Fleet Update Collection. */
        @com.fasterxml.jackson.annotation.JsonProperty("fsuCollectionName")
        private String fsuCollectionName;

        /**
         * The user-friendly name for the Exadata Fleet Update Collection.
         *
         * @param fsuCollectionName the value to set
         * @return this builder
         */
        public Builder fsuCollectionName(String fsuCollectionName) {
            this.fsuCollectionName = fsuCollectionName;
            this.__explicitlySet__.add("fsuCollectionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MembershipSummary build() {
            MembershipSummary model =
                    new MembershipSummary(
                            this.fsuCollectionId, this.fsuCollectionType, this.fsuCollectionName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MembershipSummary model) {
            if (model.wasPropertyExplicitlySet("fsuCollectionId")) {
                this.fsuCollectionId(model.getFsuCollectionId());
            }
            if (model.wasPropertyExplicitlySet("fsuCollectionType")) {
                this.fsuCollectionType(model.getFsuCollectionType());
            }
            if (model.wasPropertyExplicitlySet("fsuCollectionName")) {
                this.fsuCollectionName(model.getFsuCollectionName());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Exadata Fleet Update Collection.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fsuCollectionId")
    private final String fsuCollectionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Exadata Fleet Update Collection.
     *
     * @return the value
     */
    public String getFsuCollectionId() {
        return fsuCollectionId;
    }

    /** Type of Exadata Fleet Update Collection. */
    @com.fasterxml.jackson.annotation.JsonProperty("fsuCollectionType")
    private final CollectionTypes fsuCollectionType;

    /**
     * Type of Exadata Fleet Update Collection.
     *
     * @return the value
     */
    public CollectionTypes getFsuCollectionType() {
        return fsuCollectionType;
    }

    /** The user-friendly name for the Exadata Fleet Update Collection. */
    @com.fasterxml.jackson.annotation.JsonProperty("fsuCollectionName")
    private final String fsuCollectionName;

    /**
     * The user-friendly name for the Exadata Fleet Update Collection.
     *
     * @return the value
     */
    public String getFsuCollectionName() {
        return fsuCollectionName;
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
        sb.append("MembershipSummary(");
        sb.append("super=").append(super.toString());
        sb.append("fsuCollectionId=").append(String.valueOf(this.fsuCollectionId));
        sb.append(", fsuCollectionType=").append(String.valueOf(this.fsuCollectionType));
        sb.append(", fsuCollectionName=").append(String.valueOf(this.fsuCollectionName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MembershipSummary)) {
            return false;
        }

        MembershipSummary other = (MembershipSummary) o;
        return java.util.Objects.equals(this.fsuCollectionId, other.fsuCollectionId)
                && java.util.Objects.equals(this.fsuCollectionType, other.fsuCollectionType)
                && java.util.Objects.equals(this.fsuCollectionName, other.fsuCollectionName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.fsuCollectionId == null ? 43 : this.fsuCollectionId.hashCode());
        result =
                (result * PRIME)
                        + (this.fsuCollectionType == null ? 43 : this.fsuCollectionType.hashCode());
        result =
                (result * PRIME)
                        + (this.fsuCollectionName == null ? 43 : this.fsuCollectionName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
