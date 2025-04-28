/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dblm.model;

/**
 * Description of FPP Server. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240102")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FppServer.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FppServer extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "managementAgentId",
        "macAgentCompartmentId",
        "fppRestUrl",
        "trustStoreLocation",
        "trustStorePassword",
        "restUserName",
        "restUserPassword",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public FppServer(
            String id,
            String displayName,
            String compartmentId,
            String managementAgentId,
            String macAgentCompartmentId,
            String fppRestUrl,
            String trustStoreLocation,
            String trustStorePassword,
            String restUserName,
            String restUserPassword,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.managementAgentId = managementAgentId;
        this.macAgentCompartmentId = macAgentCompartmentId;
        this.fppRestUrl = fppRestUrl;
        this.trustStoreLocation = trustStoreLocation;
        this.trustStorePassword = trustStorePassword;
        this.restUserName = restUserName;
        this.restUserPassword = restUserPassword;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier that is immutable on creation */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** FPP Server Identifier, can be renamed */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * FPP Server Identifier, can be renamed
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Compartment Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Unique Management Agent identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
        private String managementAgentId;

        /**
         * Unique Management Agent identifier
         *
         * @param managementAgentId the value to set
         * @return this builder
         */
        public Builder managementAgentId(String managementAgentId) {
            this.managementAgentId = managementAgentId;
            this.__explicitlySet__.add("managementAgentId");
            return this;
        }
        /** Unique Management Agent Compartment identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("macAgentCompartmentId")
        private String macAgentCompartmentId;

        /**
         * Unique Management Agent Compartment identifier
         *
         * @param macAgentCompartmentId the value to set
         * @return this builder
         */
        public Builder macAgentCompartmentId(String macAgentCompartmentId) {
            this.macAgentCompartmentId = macAgentCompartmentId;
            this.__explicitlySet__.add("macAgentCompartmentId");
            return this;
        }
        /** REST endpoint URL of FPP Server */
        @com.fasterxml.jackson.annotation.JsonProperty("fppRestUrl")
        private String fppRestUrl;

        /**
         * REST endpoint URL of FPP Server
         *
         * @param fppRestUrl the value to set
         * @return this builder
         */
        public Builder fppRestUrl(String fppRestUrl) {
            this.fppRestUrl = fppRestUrl;
            this.__explicitlySet__.add("fppRestUrl");
            return this;
        }
        /** Absolute path of JKS Trust Store */
        @com.fasterxml.jackson.annotation.JsonProperty("trustStoreLocation")
        private String trustStoreLocation;

        /**
         * Absolute path of JKS Trust Store
         *
         * @param trustStoreLocation the value to set
         * @return this builder
         */
        public Builder trustStoreLocation(String trustStoreLocation) {
            this.trustStoreLocation = trustStoreLocation;
            this.__explicitlySet__.add("trustStoreLocation");
            return this;
        }
        /** JKS Trust Store Password */
        @com.fasterxml.jackson.annotation.JsonProperty("trustStorePassword")
        private String trustStorePassword;

        /**
         * JKS Trust Store Password
         *
         * @param trustStorePassword the value to set
         * @return this builder
         */
        public Builder trustStorePassword(String trustStorePassword) {
            this.trustStorePassword = trustStorePassword;
            this.__explicitlySet__.add("trustStorePassword");
            return this;
        }
        /** FPP REST User Name */
        @com.fasterxml.jackson.annotation.JsonProperty("restUserName")
        private String restUserName;

        /**
         * FPP REST User Name
         *
         * @param restUserName the value to set
         * @return this builder
         */
        public Builder restUserName(String restUserName) {
            this.restUserName = restUserName;
            this.__explicitlySet__.add("restUserName");
            return this;
        }
        /** FPP REST User Password */
        @com.fasterxml.jackson.annotation.JsonProperty("restUserPassword")
        private String restUserPassword;

        /**
         * FPP REST User Password
         *
         * @param restUserPassword the value to set
         * @return this builder
         */
        public Builder restUserPassword(String restUserPassword) {
            this.restUserPassword = restUserPassword;
            this.__explicitlySet__.add("restUserPassword");
            return this;
        }
        /** The time the the FPP server was created. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the the FPP server was created. An RFC3339 formatted datetime string
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time the FPP server was updated. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the FPP server was updated. An RFC3339 formatted datetime string
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the FPP server. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the FPP server.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FppServer build() {
            FppServer model =
                    new FppServer(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.managementAgentId,
                            this.macAgentCompartmentId,
                            this.fppRestUrl,
                            this.trustStoreLocation,
                            this.trustStorePassword,
                            this.restUserName,
                            this.restUserPassword,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FppServer model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("managementAgentId")) {
                this.managementAgentId(model.getManagementAgentId());
            }
            if (model.wasPropertyExplicitlySet("macAgentCompartmentId")) {
                this.macAgentCompartmentId(model.getMacAgentCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("fppRestUrl")) {
                this.fppRestUrl(model.getFppRestUrl());
            }
            if (model.wasPropertyExplicitlySet("trustStoreLocation")) {
                this.trustStoreLocation(model.getTrustStoreLocation());
            }
            if (model.wasPropertyExplicitlySet("trustStorePassword")) {
                this.trustStorePassword(model.getTrustStorePassword());
            }
            if (model.wasPropertyExplicitlySet("restUserName")) {
                this.restUserName(model.getRestUserName());
            }
            if (model.wasPropertyExplicitlySet("restUserPassword")) {
                this.restUserPassword(model.getRestUserPassword());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** Unique identifier that is immutable on creation */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** FPP Server Identifier, can be renamed */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * FPP Server Identifier, can be renamed
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Compartment Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Unique Management Agent identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
    private final String managementAgentId;

    /**
     * Unique Management Agent identifier
     *
     * @return the value
     */
    public String getManagementAgentId() {
        return managementAgentId;
    }

    /** Unique Management Agent Compartment identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("macAgentCompartmentId")
    private final String macAgentCompartmentId;

    /**
     * Unique Management Agent Compartment identifier
     *
     * @return the value
     */
    public String getMacAgentCompartmentId() {
        return macAgentCompartmentId;
    }

    /** REST endpoint URL of FPP Server */
    @com.fasterxml.jackson.annotation.JsonProperty("fppRestUrl")
    private final String fppRestUrl;

    /**
     * REST endpoint URL of FPP Server
     *
     * @return the value
     */
    public String getFppRestUrl() {
        return fppRestUrl;
    }

    /** Absolute path of JKS Trust Store */
    @com.fasterxml.jackson.annotation.JsonProperty("trustStoreLocation")
    private final String trustStoreLocation;

    /**
     * Absolute path of JKS Trust Store
     *
     * @return the value
     */
    public String getTrustStoreLocation() {
        return trustStoreLocation;
    }

    /** JKS Trust Store Password */
    @com.fasterxml.jackson.annotation.JsonProperty("trustStorePassword")
    private final String trustStorePassword;

    /**
     * JKS Trust Store Password
     *
     * @return the value
     */
    public String getTrustStorePassword() {
        return trustStorePassword;
    }

    /** FPP REST User Name */
    @com.fasterxml.jackson.annotation.JsonProperty("restUserName")
    private final String restUserName;

    /**
     * FPP REST User Name
     *
     * @return the value
     */
    public String getRestUserName() {
        return restUserName;
    }

    /** FPP REST User Password */
    @com.fasterxml.jackson.annotation.JsonProperty("restUserPassword")
    private final String restUserPassword;

    /**
     * FPP REST User Password
     *
     * @return the value
     */
    public String getRestUserPassword() {
        return restUserPassword;
    }

    /** The time the the FPP server was created. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the the FPP server was created. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the FPP server was updated. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the FPP server was updated. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the FPP server. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),
        ;

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                map.put(v.getValue(), v);
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid LifecycleState: " + key);
        }
    };
    /** The current state of the FPP server. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the FPP server.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
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
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("FppServer(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", managementAgentId=").append(String.valueOf(this.managementAgentId));
        sb.append(", macAgentCompartmentId=").append(String.valueOf(this.macAgentCompartmentId));
        sb.append(", fppRestUrl=").append(String.valueOf(this.fppRestUrl));
        sb.append(", trustStoreLocation=").append(String.valueOf(this.trustStoreLocation));
        sb.append(", trustStorePassword=").append(String.valueOf(this.trustStorePassword));
        sb.append(", restUserName=").append(String.valueOf(this.restUserName));
        sb.append(", restUserPassword=").append(String.valueOf(this.restUserPassword));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FppServer)) {
            return false;
        }

        FppServer other = (FppServer) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.managementAgentId, other.managementAgentId)
                && java.util.Objects.equals(this.macAgentCompartmentId, other.macAgentCompartmentId)
                && java.util.Objects.equals(this.fppRestUrl, other.fppRestUrl)
                && java.util.Objects.equals(this.trustStoreLocation, other.trustStoreLocation)
                && java.util.Objects.equals(this.trustStorePassword, other.trustStorePassword)
                && java.util.Objects.equals(this.restUserName, other.restUserName)
                && java.util.Objects.equals(this.restUserPassword, other.restUserPassword)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.managementAgentId == null ? 43 : this.managementAgentId.hashCode());
        result =
                (result * PRIME)
                        + (this.macAgentCompartmentId == null
                                ? 43
                                : this.macAgentCompartmentId.hashCode());
        result = (result * PRIME) + (this.fppRestUrl == null ? 43 : this.fppRestUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.trustStoreLocation == null
                                ? 43
                                : this.trustStoreLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.trustStorePassword == null
                                ? 43
                                : this.trustStorePassword.hashCode());
        result = (result * PRIME) + (this.restUserName == null ? 43 : this.restUserName.hashCode());
        result =
                (result * PRIME)
                        + (this.restUserPassword == null ? 43 : this.restUserPassword.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
