/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * Summary of the ManagementAgentPlugin.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ManagementAgentPlugin.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ManagementAgentPlugin
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "version",
        "supportedPlatformTypes",
        "displayName",
        "description",
        "isConsoleDeployable",
        "lifecycleState"
    })
    public ManagementAgentPlugin(
            String id,
            String name,
            Integer version,
            java.util.List<PlatformTypes> supportedPlatformTypes,
            String displayName,
            String description,
            Boolean isConsoleDeployable,
            LifecycleStates lifecycleState) {
        super();
        this.id = id;
        this.name = name;
        this.version = version;
        this.supportedPlatformTypes = supportedPlatformTypes;
        this.displayName = displayName;
        this.description = description;
        this.isConsoleDeployable = isConsoleDeployable;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Management Agent Plugin Id
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Management Agent Plugin Id
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Management Agent Plugin Name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Management Agent Plugin Name
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Management Agent Plugin Version
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private Integer version;

        /**
         * Management Agent Plugin Version
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(Integer version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * Supported Platform Types
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("supportedPlatformTypes")
        private java.util.List<PlatformTypes> supportedPlatformTypes;

        /**
         * Supported Platform Types
         * @param supportedPlatformTypes the value to set
         * @return this builder
         **/
        public Builder supportedPlatformTypes(
                java.util.List<PlatformTypes> supportedPlatformTypes) {
            this.supportedPlatformTypes = supportedPlatformTypes;
            this.__explicitlySet__.add("supportedPlatformTypes");
            return this;
        }
        /**
         * Management Agent Plugin Display Name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Management Agent Plugin Display Name
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Management Agent Plugin description
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Management Agent Plugin description
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * A flag to indicate whether a given plugin can be deployed from Agent Console UI or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isConsoleDeployable")
        private Boolean isConsoleDeployable;

        /**
         * A flag to indicate whether a given plugin can be deployed from Agent Console UI or not.
         * @param isConsoleDeployable the value to set
         * @return this builder
         **/
        public Builder isConsoleDeployable(Boolean isConsoleDeployable) {
            this.isConsoleDeployable = isConsoleDeployable;
            this.__explicitlySet__.add("isConsoleDeployable");
            return this;
        }
        /**
         * The current state of Management Agent Plugin
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        /**
         * The current state of Management Agent Plugin
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagementAgentPlugin build() {
            ManagementAgentPlugin model =
                    new ManagementAgentPlugin(
                            this.id,
                            this.name,
                            this.version,
                            this.supportedPlatformTypes,
                            this.displayName,
                            this.description,
                            this.isConsoleDeployable,
                            this.lifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagementAgentPlugin model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("supportedPlatformTypes")) {
                this.supportedPlatformTypes(model.getSupportedPlatformTypes());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isConsoleDeployable")) {
                this.isConsoleDeployable(model.getIsConsoleDeployable());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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
     * Management Agent Plugin Id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Management Agent Plugin Id
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Management Agent Plugin Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Management Agent Plugin Name
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Management Agent Plugin Version
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final Integer version;

    /**
     * Management Agent Plugin Version
     * @return the value
     **/
    public Integer getVersion() {
        return version;
    }

    /**
     * Supported Platform Types
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportedPlatformTypes")
    private final java.util.List<PlatformTypes> supportedPlatformTypes;

    /**
     * Supported Platform Types
     * @return the value
     **/
    public java.util.List<PlatformTypes> getSupportedPlatformTypes() {
        return supportedPlatformTypes;
    }

    /**
     * Management Agent Plugin Display Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Management Agent Plugin Display Name
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Management Agent Plugin description
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Management Agent Plugin description
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * A flag to indicate whether a given plugin can be deployed from Agent Console UI or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isConsoleDeployable")
    private final Boolean isConsoleDeployable;

    /**
     * A flag to indicate whether a given plugin can be deployed from Agent Console UI or not.
     * @return the value
     **/
    public Boolean getIsConsoleDeployable() {
        return isConsoleDeployable;
    }

    /**
     * The current state of Management Agent Plugin
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleStates lifecycleState;

    /**
     * The current state of Management Agent Plugin
     * @return the value
     **/
    public LifecycleStates getLifecycleState() {
        return lifecycleState;
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
        sb.append("ManagementAgentPlugin(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", supportedPlatformTypes=").append(String.valueOf(this.supportedPlatformTypes));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isConsoleDeployable=").append(String.valueOf(this.isConsoleDeployable));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagementAgentPlugin)) {
            return false;
        }

        ManagementAgentPlugin other = (ManagementAgentPlugin) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(
                        this.supportedPlatformTypes, other.supportedPlatformTypes)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isConsoleDeployable, other.isConsoleDeployable)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedPlatformTypes == null
                                ? 43
                                : this.supportedPlatformTypes.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.isConsoleDeployable == null
                                ? 43
                                : this.isConsoleDeployable.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
