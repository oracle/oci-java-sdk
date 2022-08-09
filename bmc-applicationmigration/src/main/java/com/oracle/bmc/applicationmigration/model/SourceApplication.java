/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.applicationmigration.model;

/**
 * Details about an application running in the source environment that you can migrate to Oracle Cloud Infrastructure.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SourceApplication.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SourceApplication extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "type", "sourceId", "version", "state"})
    public SourceApplication(
            String name, MigrationTypes type, String sourceId, String version, String state) {
        super();
        this.name = name;
        this.type = type;
        this.sourceId = sourceId;
        this.version = version;
        this.state = state;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the application.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the application.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The type of application.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private MigrationTypes type;

        /**
         * The type of application.
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(MigrationTypes type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the source to which the application belongs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private String sourceId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the source to which the application belongs.
         * @param sourceId the value to set
         * @return this builder
         **/
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }
        /**
         * The version of the application.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The version of the application.
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * The current state of the application.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private String state;

        /**
         * The current state of the application.
         * @param state the value to set
         * @return this builder
         **/
        public Builder state(String state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SourceApplication build() {
            SourceApplication model =
                    new SourceApplication(
                            this.name, this.type, this.sourceId, this.version, this.state);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SourceApplication model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("sourceId")) {
                this.sourceId(model.getSourceId());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
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
     * The name of the application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the application.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The type of application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final MigrationTypes type;

    /**
     * The type of application.
     * @return the value
     **/
    public MigrationTypes getType() {
        return type;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the source to which the application belongs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final String sourceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the source to which the application belongs.
     * @return the value
     **/
    public String getSourceId() {
        return sourceId;
    }

    /**
     * The version of the application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The version of the application.
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    /**
     * The current state of the application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final String state;

    /**
     * The current state of the application.
     * @return the value
     **/
    public String getState() {
        return state;
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
        sb.append("SourceApplication(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", sourceId=").append(String.valueOf(this.sourceId));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SourceApplication)) {
            return false;
        }

        SourceApplication other = (SourceApplication) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.state, other.state)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
