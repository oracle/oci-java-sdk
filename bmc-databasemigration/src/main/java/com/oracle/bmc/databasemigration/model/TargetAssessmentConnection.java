/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Target Assessment Connection object
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TargetAssessmentConnection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TargetAssessmentConnection
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "connectionType",
        "technologyType",
        "technologySubType",
        "databaseVersion"
    })
    public TargetAssessmentConnection(
            String id,
            ConnectionType connectionType,
            TechnologyType technologyType,
            String technologySubType,
            String databaseVersion) {
        super();
        this.id = id;
        this.connectionType = connectionType;
        this.technologyType = technologyType;
        this.technologySubType = technologySubType;
        this.databaseVersion = databaseVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the resource being referenced.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the resource being referenced.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Defines the type of connection. For example, ORACLE.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectionType")
        private ConnectionType connectionType;

        /**
         * Defines the type of connection. For example, ORACLE.
         * @param connectionType the value to set
         * @return this builder
         **/
        public Builder connectionType(ConnectionType connectionType) {
            this.connectionType = connectionType;
            this.__explicitlySet__.add("connectionType");
            return this;
        }
        /**
         * The technology type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
        private TechnologyType technologyType;

        /**
         * The technology type.
         * @param technologyType the value to set
         * @return this builder
         **/
        public Builder technologyType(TechnologyType technologyType) {
            this.technologyType = technologyType;
            this.__explicitlySet__.add("technologyType");
            return this;
        }
        /**
         * Technology sub-type e.g. ADW_SHARED, ADW_DEDICATED, ATP_SHARED, ATP_DEDICATED
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("technologySubType")
        private String technologySubType;

        /**
         * Technology sub-type e.g. ADW_SHARED, ADW_DEDICATED, ATP_SHARED, ATP_DEDICATED
         * @param technologySubType the value to set
         * @return this builder
         **/
        public Builder technologySubType(String technologySubType) {
            this.technologySubType = technologySubType;
            this.__explicitlySet__.add("technologySubType");
            return this;
        }
        /**
         * The database version
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
        private String databaseVersion;

        /**
         * The database version
         * @param databaseVersion the value to set
         * @return this builder
         **/
        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            this.__explicitlySet__.add("databaseVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TargetAssessmentConnection build() {
            TargetAssessmentConnection model =
                    new TargetAssessmentConnection(
                            this.id,
                            this.connectionType,
                            this.technologyType,
                            this.technologySubType,
                            this.databaseVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TargetAssessmentConnection model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("connectionType")) {
                this.connectionType(model.getConnectionType());
            }
            if (model.wasPropertyExplicitlySet("technologyType")) {
                this.technologyType(model.getTechnologyType());
            }
            if (model.wasPropertyExplicitlySet("technologySubType")) {
                this.technologySubType(model.getTechnologySubType());
            }
            if (model.wasPropertyExplicitlySet("databaseVersion")) {
                this.databaseVersion(model.getDatabaseVersion());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The OCID of the resource being referenced.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the resource being referenced.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Defines the type of connection. For example, ORACLE.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionType")
    private final ConnectionType connectionType;

    /**
     * Defines the type of connection. For example, ORACLE.
     * @return the value
     **/
    public ConnectionType getConnectionType() {
        return connectionType;
    }

    /**
     * The technology type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
    private final TechnologyType technologyType;

    /**
     * The technology type.
     * @return the value
     **/
    public TechnologyType getTechnologyType() {
        return technologyType;
    }

    /**
     * Technology sub-type e.g. ADW_SHARED, ADW_DEDICATED, ATP_SHARED, ATP_DEDICATED
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("technologySubType")
    private final String technologySubType;

    /**
     * Technology sub-type e.g. ADW_SHARED, ADW_DEDICATED, ATP_SHARED, ATP_DEDICATED
     * @return the value
     **/
    public String getTechnologySubType() {
        return technologySubType;
    }

    /**
     * The database version
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
    private final String databaseVersion;

    /**
     * The database version
     * @return the value
     **/
    public String getDatabaseVersion() {
        return databaseVersion;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TargetAssessmentConnection(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", connectionType=").append(String.valueOf(this.connectionType));
        sb.append(", technologyType=").append(String.valueOf(this.technologyType));
        sb.append(", technologySubType=").append(String.valueOf(this.technologySubType));
        sb.append(", databaseVersion=").append(String.valueOf(this.databaseVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TargetAssessmentConnection)) {
            return false;
        }

        TargetAssessmentConnection other = (TargetAssessmentConnection) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.connectionType, other.connectionType)
                && java.util.Objects.equals(this.technologyType, other.technologyType)
                && java.util.Objects.equals(this.technologySubType, other.technologySubType)
                && java.util.Objects.equals(this.databaseVersion, other.databaseVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionType == null ? 43 : this.connectionType.hashCode());
        result =
                (result * PRIME)
                        + (this.technologyType == null ? 43 : this.technologyType.hashCode());
        result =
                (result * PRIME)
                        + (this.technologySubType == null ? 43 : this.technologySubType.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseVersion == null ? 43 : this.databaseVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
