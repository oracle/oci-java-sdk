/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * An Enterprise Manager entity that can be imported into Operations Insights. <br>
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
        builder = ImportableEnterpriseManagerEntity.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ImportableEnterpriseManagerEntity
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "enterpriseManagerIdentifier",
        "enterpriseManagerEntityName",
        "enterpriseManagerEntityType",
        "enterpriseManagerEntityIdentifier",
        "opsiEntityType"
    })
    public ImportableEnterpriseManagerEntity(
            String enterpriseManagerIdentifier,
            String enterpriseManagerEntityName,
            String enterpriseManagerEntityType,
            String enterpriseManagerEntityIdentifier,
            String opsiEntityType) {
        super();
        this.enterpriseManagerIdentifier = enterpriseManagerIdentifier;
        this.enterpriseManagerEntityName = enterpriseManagerEntityName;
        this.enterpriseManagerEntityType = enterpriseManagerEntityType;
        this.enterpriseManagerEntityIdentifier = enterpriseManagerEntityIdentifier;
        this.opsiEntityType = opsiEntityType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Enterprise Manager Unique Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerIdentifier")
        private String enterpriseManagerIdentifier;

        /**
         * Enterprise Manager Unique Identifier
         *
         * @param enterpriseManagerIdentifier the value to set
         * @return this builder
         */
        public Builder enterpriseManagerIdentifier(String enterpriseManagerIdentifier) {
            this.enterpriseManagerIdentifier = enterpriseManagerIdentifier;
            this.__explicitlySet__.add("enterpriseManagerIdentifier");
            return this;
        }
        /** Enterprise Manager Entity Name */
        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityName")
        private String enterpriseManagerEntityName;

        /**
         * Enterprise Manager Entity Name
         *
         * @param enterpriseManagerEntityName the value to set
         * @return this builder
         */
        public Builder enterpriseManagerEntityName(String enterpriseManagerEntityName) {
            this.enterpriseManagerEntityName = enterpriseManagerEntityName;
            this.__explicitlySet__.add("enterpriseManagerEntityName");
            return this;
        }
        /** Enterprise Manager Entity Type */
        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityType")
        private String enterpriseManagerEntityType;

        /**
         * Enterprise Manager Entity Type
         *
         * @param enterpriseManagerEntityType the value to set
         * @return this builder
         */
        public Builder enterpriseManagerEntityType(String enterpriseManagerEntityType) {
            this.enterpriseManagerEntityType = enterpriseManagerEntityType;
            this.__explicitlySet__.add("enterpriseManagerEntityType");
            return this;
        }
        /** Enterprise Manager Entity Unique Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityIdentifier")
        private String enterpriseManagerEntityIdentifier;

        /**
         * Enterprise Manager Entity Unique Identifier
         *
         * @param enterpriseManagerEntityIdentifier the value to set
         * @return this builder
         */
        public Builder enterpriseManagerEntityIdentifier(String enterpriseManagerEntityIdentifier) {
            this.enterpriseManagerEntityIdentifier = enterpriseManagerEntityIdentifier;
            this.__explicitlySet__.add("enterpriseManagerEntityIdentifier");
            return this;
        }
        /** Ops Insights internal representation of the resource type. */
        @com.fasterxml.jackson.annotation.JsonProperty("opsiEntityType")
        private String opsiEntityType;

        /**
         * Ops Insights internal representation of the resource type.
         *
         * @param opsiEntityType the value to set
         * @return this builder
         */
        public Builder opsiEntityType(String opsiEntityType) {
            this.opsiEntityType = opsiEntityType;
            this.__explicitlySet__.add("opsiEntityType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImportableEnterpriseManagerEntity build() {
            ImportableEnterpriseManagerEntity model =
                    new ImportableEnterpriseManagerEntity(
                            this.enterpriseManagerIdentifier,
                            this.enterpriseManagerEntityName,
                            this.enterpriseManagerEntityType,
                            this.enterpriseManagerEntityIdentifier,
                            this.opsiEntityType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImportableEnterpriseManagerEntity model) {
            if (model.wasPropertyExplicitlySet("enterpriseManagerIdentifier")) {
                this.enterpriseManagerIdentifier(model.getEnterpriseManagerIdentifier());
            }
            if (model.wasPropertyExplicitlySet("enterpriseManagerEntityName")) {
                this.enterpriseManagerEntityName(model.getEnterpriseManagerEntityName());
            }
            if (model.wasPropertyExplicitlySet("enterpriseManagerEntityType")) {
                this.enterpriseManagerEntityType(model.getEnterpriseManagerEntityType());
            }
            if (model.wasPropertyExplicitlySet("enterpriseManagerEntityIdentifier")) {
                this.enterpriseManagerEntityIdentifier(
                        model.getEnterpriseManagerEntityIdentifier());
            }
            if (model.wasPropertyExplicitlySet("opsiEntityType")) {
                this.opsiEntityType(model.getOpsiEntityType());
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

    /** Enterprise Manager Unique Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerIdentifier")
    private final String enterpriseManagerIdentifier;

    /**
     * Enterprise Manager Unique Identifier
     *
     * @return the value
     */
    public String getEnterpriseManagerIdentifier() {
        return enterpriseManagerIdentifier;
    }

    /** Enterprise Manager Entity Name */
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityName")
    private final String enterpriseManagerEntityName;

    /**
     * Enterprise Manager Entity Name
     *
     * @return the value
     */
    public String getEnterpriseManagerEntityName() {
        return enterpriseManagerEntityName;
    }

    /** Enterprise Manager Entity Type */
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityType")
    private final String enterpriseManagerEntityType;

    /**
     * Enterprise Manager Entity Type
     *
     * @return the value
     */
    public String getEnterpriseManagerEntityType() {
        return enterpriseManagerEntityType;
    }

    /** Enterprise Manager Entity Unique Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityIdentifier")
    private final String enterpriseManagerEntityIdentifier;

    /**
     * Enterprise Manager Entity Unique Identifier
     *
     * @return the value
     */
    public String getEnterpriseManagerEntityIdentifier() {
        return enterpriseManagerEntityIdentifier;
    }

    /** Ops Insights internal representation of the resource type. */
    @com.fasterxml.jackson.annotation.JsonProperty("opsiEntityType")
    private final String opsiEntityType;

    /**
     * Ops Insights internal representation of the resource type.
     *
     * @return the value
     */
    public String getOpsiEntityType() {
        return opsiEntityType;
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
        sb.append("ImportableEnterpriseManagerEntity(");
        sb.append("super=").append(super.toString());
        sb.append("enterpriseManagerIdentifier=")
                .append(String.valueOf(this.enterpriseManagerIdentifier));
        sb.append(", enterpriseManagerEntityName=")
                .append(String.valueOf(this.enterpriseManagerEntityName));
        sb.append(", enterpriseManagerEntityType=")
                .append(String.valueOf(this.enterpriseManagerEntityType));
        sb.append(", enterpriseManagerEntityIdentifier=")
                .append(String.valueOf(this.enterpriseManagerEntityIdentifier));
        sb.append(", opsiEntityType=").append(String.valueOf(this.opsiEntityType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportableEnterpriseManagerEntity)) {
            return false;
        }

        ImportableEnterpriseManagerEntity other = (ImportableEnterpriseManagerEntity) o;
        return java.util.Objects.equals(
                        this.enterpriseManagerIdentifier, other.enterpriseManagerIdentifier)
                && java.util.Objects.equals(
                        this.enterpriseManagerEntityName, other.enterpriseManagerEntityName)
                && java.util.Objects.equals(
                        this.enterpriseManagerEntityType, other.enterpriseManagerEntityType)
                && java.util.Objects.equals(
                        this.enterpriseManagerEntityIdentifier,
                        other.enterpriseManagerEntityIdentifier)
                && java.util.Objects.equals(this.opsiEntityType, other.opsiEntityType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.enterpriseManagerIdentifier == null
                                ? 43
                                : this.enterpriseManagerIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerEntityName == null
                                ? 43
                                : this.enterpriseManagerEntityName.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerEntityType == null
                                ? 43
                                : this.enterpriseManagerEntityType.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerEntityIdentifier == null
                                ? 43
                                : this.enterpriseManagerEntityIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.opsiEntityType == null ? 43 : this.opsiEntityType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
