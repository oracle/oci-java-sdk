/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The details for creating a database connection bundle. <br>
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
        builder = CreateDbConnectionBundleDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDbConnectionBundleDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "dbConnectionBundleType",
        "associatedResourceDetails",
        "tenantId",
        "freeformTags",
        "definedTags"
    })
    public CreateDbConnectionBundleDetails(
            String compartmentId,
            String displayName,
            DbConnectionBundleType dbConnectionBundleType,
            java.util.List<AssociatedResourceDetails> associatedResourceDetails,
            String tenantId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, String>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.dbConnectionBundleType = dbConnectionBundleType;
        this.associatedResourceDetails = associatedResourceDetails;
        this.tenantId = tenantId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the compartment where you want to create the database connection bundle. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment where you want to create the database connection bundle.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Display name for the connection bundle. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name for the connection bundle.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The type of the database connection bundle. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbConnectionBundleType")
        private DbConnectionBundleType dbConnectionBundleType;

        /**
         * The type of the database connection bundle.
         *
         * @param dbConnectionBundleType the value to set
         * @return this builder
         */
        public Builder dbConnectionBundleType(DbConnectionBundleType dbConnectionBundleType) {
            this.dbConnectionBundleType = dbConnectionBundleType;
            this.__explicitlySet__.add("dbConnectionBundleType");
            return this;
        }
        /** Details about the resources to associate with the connection bundle. */
        @com.fasterxml.jackson.annotation.JsonProperty("associatedResourceDetails")
        private java.util.List<AssociatedResourceDetails> associatedResourceDetails;

        /**
         * Details about the resources to associate with the connection bundle.
         *
         * @param associatedResourceDetails the value to set
         * @return this builder
         */
        public Builder associatedResourceDetails(
                java.util.List<AssociatedResourceDetails> associatedResourceDetails) {
            this.associatedResourceDetails = associatedResourceDetails;
            this.__explicitlySet__.add("associatedResourceDetails");
            return this;
        }
        /** The tenancy ID for the connection bundle. */
        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        /**
         * The tenancy ID for the connection bundle.
         *
         * @param tenantId the value to set
         * @return this builder
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, String>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, String>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDbConnectionBundleDetails build() {
            CreateDbConnectionBundleDetails model =
                    new CreateDbConnectionBundleDetails(
                            this.compartmentId,
                            this.displayName,
                            this.dbConnectionBundleType,
                            this.associatedResourceDetails,
                            this.tenantId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDbConnectionBundleDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("dbConnectionBundleType")) {
                this.dbConnectionBundleType(model.getDbConnectionBundleType());
            }
            if (model.wasPropertyExplicitlySet("associatedResourceDetails")) {
                this.associatedResourceDetails(model.getAssociatedResourceDetails());
            }
            if (model.wasPropertyExplicitlySet("tenantId")) {
                this.tenantId(model.getTenantId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** The OCID of the compartment where you want to create the database connection bundle. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment where you want to create the database connection bundle.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Display name for the connection bundle. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name for the connection bundle.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The type of the database connection bundle. */
    public enum DbConnectionBundleType implements com.oracle.bmc.http.internal.BmcEnum {
        Tls("TLS"),
        Mtls("MTLS"),
        ;

        private final String value;
        private static java.util.Map<String, DbConnectionBundleType> map;

        static {
            map = new java.util.HashMap<>();
            for (DbConnectionBundleType v : DbConnectionBundleType.values()) {
                map.put(v.getValue(), v);
            }
        }

        DbConnectionBundleType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DbConnectionBundleType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DbConnectionBundleType: " + key);
        }
    };
    /** The type of the database connection bundle. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbConnectionBundleType")
    private final DbConnectionBundleType dbConnectionBundleType;

    /**
     * The type of the database connection bundle.
     *
     * @return the value
     */
    public DbConnectionBundleType getDbConnectionBundleType() {
        return dbConnectionBundleType;
    }

    /** Details about the resources to associate with the connection bundle. */
    @com.fasterxml.jackson.annotation.JsonProperty("associatedResourceDetails")
    private final java.util.List<AssociatedResourceDetails> associatedResourceDetails;

    /**
     * Details about the resources to associate with the connection bundle.
     *
     * @return the value
     */
    public java.util.List<AssociatedResourceDetails> getAssociatedResourceDetails() {
        return associatedResourceDetails;
    }

    /** The tenancy ID for the connection bundle. */
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    private final String tenantId;

    /**
     * The tenancy ID for the connection bundle.
     *
     * @return the value
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, String>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, String>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateDbConnectionBundleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", dbConnectionBundleType=").append(String.valueOf(this.dbConnectionBundleType));
        sb.append(", associatedResourceDetails=")
                .append(String.valueOf(this.associatedResourceDetails));
        sb.append(", tenantId=").append(String.valueOf(this.tenantId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDbConnectionBundleDetails)) {
            return false;
        }

        CreateDbConnectionBundleDetails other = (CreateDbConnectionBundleDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.dbConnectionBundleType, other.dbConnectionBundleType)
                && java.util.Objects.equals(
                        this.associatedResourceDetails, other.associatedResourceDetails)
                && java.util.Objects.equals(this.tenantId, other.tenantId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.dbConnectionBundleType == null
                                ? 43
                                : this.dbConnectionBundleType.hashCode());
        result =
                (result * PRIME)
                        + (this.associatedResourceDetails == null
                                ? 43
                                : this.associatedResourceDetails.hashCode());
        result = (result * PRIME) + (this.tenantId == null ? 43 : this.tenantId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
