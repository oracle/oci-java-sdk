/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Partial definition of the exadata insight resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExadataMemberCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExadataMemberCollection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "exadataInsightId",
        "exadataName",
        "exadataDisplayName",
        "exadataType",
        "exadataRackType",
        "items"
    })
    public ExadataMemberCollection(
            String exadataInsightId,
            String exadataName,
            String exadataDisplayName,
            ExadataType exadataType,
            ExadataRackType exadataRackType,
            java.util.List<ExadataMemberSummary> items) {
        super();
        this.exadataInsightId = exadataInsightId;
        this.exadataName = exadataName;
        this.exadataDisplayName = exadataDisplayName;
        this.exadataType = exadataType;
        this.exadataRackType = exadataRackType;
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Exadata insight.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exadataInsightId")
        private String exadataInsightId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Exadata insight.
         *
         * @param exadataInsightId the value to set
         * @return this builder
         */
        public Builder exadataInsightId(String exadataInsightId) {
            this.exadataInsightId = exadataInsightId;
            this.__explicitlySet__.add("exadataInsightId");
            return this;
        }
        /**
         * The Exadata system name. If the Exadata systems managed by Enterprise Manager, the name
         * is unique amongst the Exadata systems managed by the same Enterprise Manager.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exadataName")
        private String exadataName;

        /**
         * The Exadata system name. If the Exadata systems managed by Enterprise Manager, the name
         * is unique amongst the Exadata systems managed by the same Enterprise Manager.
         *
         * @param exadataName the value to set
         * @return this builder
         */
        public Builder exadataName(String exadataName) {
            this.exadataName = exadataName;
            this.__explicitlySet__.add("exadataName");
            return this;
        }
        /** The user-friendly name for the Exadata system. The name does not have to be unique. */
        @com.fasterxml.jackson.annotation.JsonProperty("exadataDisplayName")
        private String exadataDisplayName;

        /**
         * The user-friendly name for the Exadata system. The name does not have to be unique.
         *
         * @param exadataDisplayName the value to set
         * @return this builder
         */
        public Builder exadataDisplayName(String exadataDisplayName) {
            this.exadataDisplayName = exadataDisplayName;
            this.__explicitlySet__.add("exadataDisplayName");
            return this;
        }
        /** Operations Insights internal representation of the the Exadata system type. */
        @com.fasterxml.jackson.annotation.JsonProperty("exadataType")
        private ExadataType exadataType;

        /**
         * Operations Insights internal representation of the the Exadata system type.
         *
         * @param exadataType the value to set
         * @return this builder
         */
        public Builder exadataType(ExadataType exadataType) {
            this.exadataType = exadataType;
            this.__explicitlySet__.add("exadataType");
            return this;
        }
        /** Exadata rack type. */
        @com.fasterxml.jackson.annotation.JsonProperty("exadataRackType")
        private ExadataRackType exadataRackType;

        /**
         * Exadata rack type.
         *
         * @param exadataRackType the value to set
         * @return this builder
         */
        public Builder exadataRackType(ExadataRackType exadataRackType) {
            this.exadataRackType = exadataRackType;
            this.__explicitlySet__.add("exadataRackType");
            return this;
        }
        /** Collection of Exadata members */
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<ExadataMemberSummary> items;

        /**
         * Collection of Exadata members
         *
         * @param items the value to set
         * @return this builder
         */
        public Builder items(java.util.List<ExadataMemberSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadataMemberCollection build() {
            ExadataMemberCollection model =
                    new ExadataMemberCollection(
                            this.exadataInsightId,
                            this.exadataName,
                            this.exadataDisplayName,
                            this.exadataType,
                            this.exadataRackType,
                            this.items);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadataMemberCollection model) {
            if (model.wasPropertyExplicitlySet("exadataInsightId")) {
                this.exadataInsightId(model.getExadataInsightId());
            }
            if (model.wasPropertyExplicitlySet("exadataName")) {
                this.exadataName(model.getExadataName());
            }
            if (model.wasPropertyExplicitlySet("exadataDisplayName")) {
                this.exadataDisplayName(model.getExadataDisplayName());
            }
            if (model.wasPropertyExplicitlySet("exadataType")) {
                this.exadataType(model.getExadataType());
            }
            if (model.wasPropertyExplicitlySet("exadataRackType")) {
                this.exadataRackType(model.getExadataRackType());
            }
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
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
     * Exadata insight.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exadataInsightId")
    private final String exadataInsightId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Exadata insight.
     *
     * @return the value
     */
    public String getExadataInsightId() {
        return exadataInsightId;
    }

    /**
     * The Exadata system name. If the Exadata systems managed by Enterprise Manager, the name is
     * unique amongst the Exadata systems managed by the same Enterprise Manager.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exadataName")
    private final String exadataName;

    /**
     * The Exadata system name. If the Exadata systems managed by Enterprise Manager, the name is
     * unique amongst the Exadata systems managed by the same Enterprise Manager.
     *
     * @return the value
     */
    public String getExadataName() {
        return exadataName;
    }

    /** The user-friendly name for the Exadata system. The name does not have to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("exadataDisplayName")
    private final String exadataDisplayName;

    /**
     * The user-friendly name for the Exadata system. The name does not have to be unique.
     *
     * @return the value
     */
    public String getExadataDisplayName() {
        return exadataDisplayName;
    }

    /** Operations Insights internal representation of the the Exadata system type. */
    @com.fasterxml.jackson.annotation.JsonProperty("exadataType")
    private final ExadataType exadataType;

    /**
     * Operations Insights internal representation of the the Exadata system type.
     *
     * @return the value
     */
    public ExadataType getExadataType() {
        return exadataType;
    }

    /** Exadata rack type. */
    @com.fasterxml.jackson.annotation.JsonProperty("exadataRackType")
    private final ExadataRackType exadataRackType;

    /**
     * Exadata rack type.
     *
     * @return the value
     */
    public ExadataRackType getExadataRackType() {
        return exadataRackType;
    }

    /** Collection of Exadata members */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<ExadataMemberSummary> items;

    /**
     * Collection of Exadata members
     *
     * @return the value
     */
    public java.util.List<ExadataMemberSummary> getItems() {
        return items;
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
        sb.append("ExadataMemberCollection(");
        sb.append("super=").append(super.toString());
        sb.append("exadataInsightId=").append(String.valueOf(this.exadataInsightId));
        sb.append(", exadataName=").append(String.valueOf(this.exadataName));
        sb.append(", exadataDisplayName=").append(String.valueOf(this.exadataDisplayName));
        sb.append(", exadataType=").append(String.valueOf(this.exadataType));
        sb.append(", exadataRackType=").append(String.valueOf(this.exadataRackType));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExadataMemberCollection)) {
            return false;
        }

        ExadataMemberCollection other = (ExadataMemberCollection) o;
        return java.util.Objects.equals(this.exadataInsightId, other.exadataInsightId)
                && java.util.Objects.equals(this.exadataName, other.exadataName)
                && java.util.Objects.equals(this.exadataDisplayName, other.exadataDisplayName)
                && java.util.Objects.equals(this.exadataType, other.exadataType)
                && java.util.Objects.equals(this.exadataRackType, other.exadataRackType)
                && java.util.Objects.equals(this.items, other.items)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.exadataInsightId == null ? 43 : this.exadataInsightId.hashCode());
        result = (result * PRIME) + (this.exadataName == null ? 43 : this.exadataName.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataDisplayName == null
                                ? 43
                                : this.exadataDisplayName.hashCode());
        result = (result * PRIME) + (this.exadataType == null ? 43 : this.exadataType.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataRackType == null ? 43 : this.exadataRackType.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
