/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Information about a new metastore. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateMetastoreDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateMetastoreDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
        "defaultManagedTableLocation",
        "defaultExternalTableLocation",
        "freeformTags",
        "definedTags"
    })
    public CreateMetastoreDetails(
            String displayName,
            String compartmentId,
            String defaultManagedTableLocation,
            String defaultExternalTableLocation,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.defaultManagedTableLocation = defaultManagedTableLocation;
        this.defaultExternalTableLocation = defaultExternalTableLocation;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Mutable name of the metastore. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Mutable name of the metastore.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** OCID of the compartment which holds the metastore. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of the compartment which holds the metastore.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Location under which managed tables will be created by default. This references Object
         * Storage using an HDFS URI format. Example: oci://bucket@namespace/sub-dir/
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultManagedTableLocation")
        private String defaultManagedTableLocation;

        /**
         * Location under which managed tables will be created by default. This references Object
         * Storage using an HDFS URI format. Example: oci://bucket@namespace/sub-dir/
         *
         * @param defaultManagedTableLocation the value to set
         * @return this builder
         */
        public Builder defaultManagedTableLocation(String defaultManagedTableLocation) {
            this.defaultManagedTableLocation = defaultManagedTableLocation;
            this.__explicitlySet__.add("defaultManagedTableLocation");
            return this;
        }
        /**
         * Location under which external tables will be created by default. This references Object
         * Storage using an HDFS URI format. Example: oci://bucket@namespace/sub-dir/
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultExternalTableLocation")
        private String defaultExternalTableLocation;

        /**
         * Location under which external tables will be created by default. This references Object
         * Storage using an HDFS URI format. Example: oci://bucket@namespace/sub-dir/
         *
         * @param defaultExternalTableLocation the value to set
         * @return this builder
         */
        public Builder defaultExternalTableLocation(String defaultExternalTableLocation) {
            this.defaultExternalTableLocation = defaultExternalTableLocation;
            this.__explicitlySet__.add("defaultExternalTableLocation");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example:
         * {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example:
         * {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMetastoreDetails build() {
            CreateMetastoreDetails model =
                    new CreateMetastoreDetails(
                            this.displayName,
                            this.compartmentId,
                            this.defaultManagedTableLocation,
                            this.defaultExternalTableLocation,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMetastoreDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("defaultManagedTableLocation")) {
                this.defaultManagedTableLocation(model.getDefaultManagedTableLocation());
            }
            if (model.wasPropertyExplicitlySet("defaultExternalTableLocation")) {
                this.defaultExternalTableLocation(model.getDefaultExternalTableLocation());
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

    /** Mutable name of the metastore. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Mutable name of the metastore.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** OCID of the compartment which holds the metastore. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of the compartment which holds the metastore.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Location under which managed tables will be created by default. This references Object
     * Storage using an HDFS URI format. Example: oci://bucket@namespace/sub-dir/
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultManagedTableLocation")
    private final String defaultManagedTableLocation;

    /**
     * Location under which managed tables will be created by default. This references Object
     * Storage using an HDFS URI format. Example: oci://bucket@namespace/sub-dir/
     *
     * @return the value
     */
    public String getDefaultManagedTableLocation() {
        return defaultManagedTableLocation;
    }

    /**
     * Location under which external tables will be created by default. This references Object
     * Storage using an HDFS URI format. Example: oci://bucket@namespace/sub-dir/
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultExternalTableLocation")
    private final String defaultExternalTableLocation;

    /**
     * Location under which external tables will be created by default. This references Object
     * Storage using an HDFS URI format. Example: oci://bucket@namespace/sub-dir/
     *
     * @return the value
     */
    public String getDefaultExternalTableLocation() {
        return defaultExternalTableLocation;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
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
        sb.append("CreateMetastoreDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", defaultManagedTableLocation=")
                .append(String.valueOf(this.defaultManagedTableLocation));
        sb.append(", defaultExternalTableLocation=")
                .append(String.valueOf(this.defaultExternalTableLocation));
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
        if (!(o instanceof CreateMetastoreDetails)) {
            return false;
        }

        CreateMetastoreDetails other = (CreateMetastoreDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.defaultManagedTableLocation, other.defaultManagedTableLocation)
                && java.util.Objects.equals(
                        this.defaultExternalTableLocation, other.defaultExternalTableLocation)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultManagedTableLocation == null
                                ? 43
                                : this.defaultManagedTableLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultExternalTableLocation == null
                                ? 43
                                : this.defaultExternalTableLocation.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
