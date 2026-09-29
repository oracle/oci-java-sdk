/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of a subsetted object. A subsetted object is a database table subsetted by a data
 * subsetting request <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SubsettedObjectSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SubsettedObjectSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "schemaName",
        "objectName",
        "objectType",
        "rowCountBeforeSubsetting",
        "rowCountAfterSubsetting",
        "sizeBeforeSubsettingInKBs",
        "sizeAfterSubsettingInKBs"
    })
    public SubsettedObjectSummary(
            String schemaName,
            String objectName,
            ObjectType objectType,
            Long rowCountBeforeSubsetting,
            Long rowCountAfterSubsetting,
            String sizeBeforeSubsettingInKBs,
            String sizeAfterSubsettingInKBs) {
        super();
        this.schemaName = schemaName;
        this.objectName = objectName;
        this.objectType = objectType;
        this.rowCountBeforeSubsetting = rowCountBeforeSubsetting;
        this.rowCountAfterSubsetting = rowCountAfterSubsetting;
        this.sizeBeforeSubsettingInKBs = sizeBeforeSubsettingInKBs;
        this.sizeAfterSubsettingInKBs = sizeAfterSubsettingInKBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the schema that contains the subsetted object */
        @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
        private String schemaName;

        /**
         * The name of the schema that contains the subsetted object
         *
         * @param schemaName the value to set
         * @return this builder
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            this.__explicitlySet__.add("schemaName");
            return this;
        }
        /** The name of the object (table or editioning view) subsetted */
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * The name of the object (table or editioning view) subsetted
         *
         * @param objectName the value to set
         * @return this builder
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /** The type of the object (table or editioning view) subsetted */
        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private ObjectType objectType;

        /**
         * The type of the object (table or editioning view) subsetted
         *
         * @param objectType the value to set
         * @return this builder
         */
        public Builder objectType(ObjectType objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }
        /** The count of rows in the subsetted table before subsetting */
        @com.fasterxml.jackson.annotation.JsonProperty("rowCountBeforeSubsetting")
        private Long rowCountBeforeSubsetting;

        /**
         * The count of rows in the subsetted table before subsetting
         *
         * @param rowCountBeforeSubsetting the value to set
         * @return this builder
         */
        public Builder rowCountBeforeSubsetting(Long rowCountBeforeSubsetting) {
            this.rowCountBeforeSubsetting = rowCountBeforeSubsetting;
            this.__explicitlySet__.add("rowCountBeforeSubsetting");
            return this;
        }
        /** The count of rows in the subsetted table after subsetting */
        @com.fasterxml.jackson.annotation.JsonProperty("rowCountAfterSubsetting")
        private Long rowCountAfterSubsetting;

        /**
         * The count of rows in the subsetted table after subsetting
         *
         * @param rowCountAfterSubsetting the value to set
         * @return this builder
         */
        public Builder rowCountAfterSubsetting(Long rowCountAfterSubsetting) {
            this.rowCountAfterSubsetting = rowCountAfterSubsetting;
            this.__explicitlySet__.add("rowCountAfterSubsetting");
            return this;
        }
        /** The size of the subsetted table before subsetting in KBs */
        @com.fasterxml.jackson.annotation.JsonProperty("sizeBeforeSubsettingInKBs")
        private String sizeBeforeSubsettingInKBs;

        /**
         * The size of the subsetted table before subsetting in KBs
         *
         * @param sizeBeforeSubsettingInKBs the value to set
         * @return this builder
         */
        public Builder sizeBeforeSubsettingInKBs(String sizeBeforeSubsettingInKBs) {
            this.sizeBeforeSubsettingInKBs = sizeBeforeSubsettingInKBs;
            this.__explicitlySet__.add("sizeBeforeSubsettingInKBs");
            return this;
        }
        /** The size of the subsetted table after subsetting in KBs */
        @com.fasterxml.jackson.annotation.JsonProperty("sizeAfterSubsettingInKBs")
        private String sizeAfterSubsettingInKBs;

        /**
         * The size of the subsetted table after subsetting in KBs
         *
         * @param sizeAfterSubsettingInKBs the value to set
         * @return this builder
         */
        public Builder sizeAfterSubsettingInKBs(String sizeAfterSubsettingInKBs) {
            this.sizeAfterSubsettingInKBs = sizeAfterSubsettingInKBs;
            this.__explicitlySet__.add("sizeAfterSubsettingInKBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubsettedObjectSummary build() {
            SubsettedObjectSummary model =
                    new SubsettedObjectSummary(
                            this.schemaName,
                            this.objectName,
                            this.objectType,
                            this.rowCountBeforeSubsetting,
                            this.rowCountAfterSubsetting,
                            this.sizeBeforeSubsettingInKBs,
                            this.sizeAfterSubsettingInKBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubsettedObjectSummary model) {
            if (model.wasPropertyExplicitlySet("schemaName")) {
                this.schemaName(model.getSchemaName());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
            }
            if (model.wasPropertyExplicitlySet("objectType")) {
                this.objectType(model.getObjectType());
            }
            if (model.wasPropertyExplicitlySet("rowCountBeforeSubsetting")) {
                this.rowCountBeforeSubsetting(model.getRowCountBeforeSubsetting());
            }
            if (model.wasPropertyExplicitlySet("rowCountAfterSubsetting")) {
                this.rowCountAfterSubsetting(model.getRowCountAfterSubsetting());
            }
            if (model.wasPropertyExplicitlySet("sizeBeforeSubsettingInKBs")) {
                this.sizeBeforeSubsettingInKBs(model.getSizeBeforeSubsettingInKBs());
            }
            if (model.wasPropertyExplicitlySet("sizeAfterSubsettingInKBs")) {
                this.sizeAfterSubsettingInKBs(model.getSizeAfterSubsettingInKBs());
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

    /** The name of the schema that contains the subsetted object */
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    private final String schemaName;

    /**
     * The name of the schema that contains the subsetted object
     *
     * @return the value
     */
    public String getSchemaName() {
        return schemaName;
    }

    /** The name of the object (table or editioning view) subsetted */
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * The name of the object (table or editioning view) subsetted
     *
     * @return the value
     */
    public String getObjectName() {
        return objectName;
    }

    /** The type of the object (table or editioning view) subsetted */
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    private final ObjectType objectType;

    /**
     * The type of the object (table or editioning view) subsetted
     *
     * @return the value
     */
    public ObjectType getObjectType() {
        return objectType;
    }

    /** The count of rows in the subsetted table before subsetting */
    @com.fasterxml.jackson.annotation.JsonProperty("rowCountBeforeSubsetting")
    private final Long rowCountBeforeSubsetting;

    /**
     * The count of rows in the subsetted table before subsetting
     *
     * @return the value
     */
    public Long getRowCountBeforeSubsetting() {
        return rowCountBeforeSubsetting;
    }

    /** The count of rows in the subsetted table after subsetting */
    @com.fasterxml.jackson.annotation.JsonProperty("rowCountAfterSubsetting")
    private final Long rowCountAfterSubsetting;

    /**
     * The count of rows in the subsetted table after subsetting
     *
     * @return the value
     */
    public Long getRowCountAfterSubsetting() {
        return rowCountAfterSubsetting;
    }

    /** The size of the subsetted table before subsetting in KBs */
    @com.fasterxml.jackson.annotation.JsonProperty("sizeBeforeSubsettingInKBs")
    private final String sizeBeforeSubsettingInKBs;

    /**
     * The size of the subsetted table before subsetting in KBs
     *
     * @return the value
     */
    public String getSizeBeforeSubsettingInKBs() {
        return sizeBeforeSubsettingInKBs;
    }

    /** The size of the subsetted table after subsetting in KBs */
    @com.fasterxml.jackson.annotation.JsonProperty("sizeAfterSubsettingInKBs")
    private final String sizeAfterSubsettingInKBs;

    /**
     * The size of the subsetted table after subsetting in KBs
     *
     * @return the value
     */
    public String getSizeAfterSubsettingInKBs() {
        return sizeAfterSubsettingInKBs;
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
        sb.append("SubsettedObjectSummary(");
        sb.append("super=").append(super.toString());
        sb.append("schemaName=").append(String.valueOf(this.schemaName));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", objectType=").append(String.valueOf(this.objectType));
        sb.append(", rowCountBeforeSubsetting=")
                .append(String.valueOf(this.rowCountBeforeSubsetting));
        sb.append(", rowCountAfterSubsetting=")
                .append(String.valueOf(this.rowCountAfterSubsetting));
        sb.append(", sizeBeforeSubsettingInKBs=")
                .append(String.valueOf(this.sizeBeforeSubsettingInKBs));
        sb.append(", sizeAfterSubsettingInKBs=")
                .append(String.valueOf(this.sizeAfterSubsettingInKBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubsettedObjectSummary)) {
            return false;
        }

        SubsettedObjectSummary other = (SubsettedObjectSummary) o;
        return java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.objectType, other.objectType)
                && java.util.Objects.equals(
                        this.rowCountBeforeSubsetting, other.rowCountBeforeSubsetting)
                && java.util.Objects.equals(
                        this.rowCountAfterSubsetting, other.rowCountAfterSubsetting)
                && java.util.Objects.equals(
                        this.sizeBeforeSubsettingInKBs, other.sizeBeforeSubsettingInKBs)
                && java.util.Objects.equals(
                        this.sizeAfterSubsettingInKBs, other.sizeAfterSubsettingInKBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.objectType == null ? 43 : this.objectType.hashCode());
        result =
                (result * PRIME)
                        + (this.rowCountBeforeSubsetting == null
                                ? 43
                                : this.rowCountBeforeSubsetting.hashCode());
        result =
                (result * PRIME)
                        + (this.rowCountAfterSubsetting == null
                                ? 43
                                : this.rowCountAfterSubsetting.hashCode());
        result =
                (result * PRIME)
                        + (this.sizeBeforeSubsettingInKBs == null
                                ? 43
                                : this.sizeBeforeSubsettingInKBs.hashCode());
        result =
                (result * PRIME)
                        + (this.sizeAfterSubsettingInKBs == null
                                ? 43
                                : this.sizeAfterSubsettingInKBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
