/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.wlms.model;

/**
 * The summary of servers. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ServerSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ServerSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "isAdmin",
        "status",
        "restartOrder",
        "middlewarePath",
        "middlewareType",
        "weblogicVersion",
        "jdkPath",
        "jdkVersion",
        "wlsDomainName",
        "wlsDomainId",
        "wlsDomainPath",
        "latestPatchesStatus",
        "patchReadinessStatus",
        "hostName",
        "managedInstanceId",
        "timeCreated",
        "timeUpdated"
    })
    public ServerSummary(
            String id,
            String name,
            Boolean isAdmin,
            String status,
            Integer restartOrder,
            String middlewarePath,
            String middlewareType,
            String weblogicVersion,
            String jdkPath,
            String jdkVersion,
            String wlsDomainName,
            String wlsDomainId,
            String wlsDomainPath,
            LatestPatchesStatus latestPatchesStatus,
            PatchReadinessStatus patchReadinessStatus,
            String hostName,
            String managedInstanceId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.id = id;
        this.name = name;
        this.isAdmin = isAdmin;
        this.status = status;
        this.restartOrder = restartOrder;
        this.middlewarePath = middlewarePath;
        this.middlewareType = middlewareType;
        this.weblogicVersion = weblogicVersion;
        this.jdkPath = jdkPath;
        this.jdkVersion = jdkVersion;
        this.wlsDomainName = wlsDomainName;
        this.wlsDomainId = wlsDomainId;
        this.wlsDomainPath = wlsDomainPath;
        this.latestPatchesStatus = latestPatchesStatus;
        this.patchReadinessStatus = patchReadinessStatus;
        this.hostName = hostName;
        this.managedInstanceId = managedInstanceId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique identifier of the server.
         *
         * <p>*Note:** Not an
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique identifier of the server.
         *
         * <p>*Note:** Not an
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The name of the server. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the server.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Whether or not the server is an admin node. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAdmin")
        private Boolean isAdmin;

        /**
         * Whether or not the server is an admin node.
         *
         * @param isAdmin the value to set
         * @return this builder
         */
        public Builder isAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            this.__explicitlySet__.add("isAdmin");
            return this;
        }
        /** The status of the server. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * The status of the server.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The restart order assigned to the server. */
        @com.fasterxml.jackson.annotation.JsonProperty("restartOrder")
        private Integer restartOrder;

        /**
         * The restart order assigned to the server.
         *
         * @param restartOrder the value to set
         * @return this builder
         */
        public Builder restartOrder(Integer restartOrder) {
            this.restartOrder = restartOrder;
            this.__explicitlySet__.add("restartOrder");
            return this;
        }
        /** The middleware path on the server. */
        @com.fasterxml.jackson.annotation.JsonProperty("middlewarePath")
        private String middlewarePath;

        /**
         * The middleware path on the server.
         *
         * @param middlewarePath the value to set
         * @return this builder
         */
        public Builder middlewarePath(String middlewarePath) {
            this.middlewarePath = middlewarePath;
            this.__explicitlySet__.add("middlewarePath");
            return this;
        }
        /** The middleware type on the server. */
        @com.fasterxml.jackson.annotation.JsonProperty("middlewareType")
        private String middlewareType;

        /**
         * The middleware type on the server.
         *
         * @param middlewareType the value to set
         * @return this builder
         */
        public Builder middlewareType(String middlewareType) {
            this.middlewareType = middlewareType;
            this.__explicitlySet__.add("middlewareType");
            return this;
        }
        /** The version of the WebLogic domain of the server */
        @com.fasterxml.jackson.annotation.JsonProperty("weblogicVersion")
        private String weblogicVersion;

        /**
         * The version of the WebLogic domain of the server
         *
         * @param weblogicVersion the value to set
         * @return this builder
         */
        public Builder weblogicVersion(String weblogicVersion) {
            this.weblogicVersion = weblogicVersion;
            this.__explicitlySet__.add("weblogicVersion");
            return this;
        }
        /** The JDK path on the server. */
        @com.fasterxml.jackson.annotation.JsonProperty("jdkPath")
        private String jdkPath;

        /**
         * The JDK path on the server.
         *
         * @param jdkPath the value to set
         * @return this builder
         */
        public Builder jdkPath(String jdkPath) {
            this.jdkPath = jdkPath;
            this.__explicitlySet__.add("jdkPath");
            return this;
        }
        /** The JDK version on the server. */
        @com.fasterxml.jackson.annotation.JsonProperty("jdkVersion")
        private String jdkVersion;

        /**
         * The JDK version on the server.
         *
         * @param jdkVersion the value to set
         * @return this builder
         */
        public Builder jdkVersion(String jdkVersion) {
            this.jdkVersion = jdkVersion;
            this.__explicitlySet__.add("jdkVersion");
            return this;
        }
        /** The name of the WebLogic domain to which the server belongs. */
        @com.fasterxml.jackson.annotation.JsonProperty("wlsDomainName")
        private String wlsDomainName;

        /**
         * The name of the WebLogic domain to which the server belongs.
         *
         * @param wlsDomainName the value to set
         * @return this builder
         */
        public Builder wlsDomainName(String wlsDomainName) {
            this.wlsDomainName = wlsDomainName;
            this.__explicitlySet__.add("wlsDomainName");
            return this;
        }
        /** The ID of the WebLogic domain to which the server belongs. */
        @com.fasterxml.jackson.annotation.JsonProperty("wlsDomainId")
        private String wlsDomainId;

        /**
         * The ID of the WebLogic domain to which the server belongs.
         *
         * @param wlsDomainId the value to set
         * @return this builder
         */
        public Builder wlsDomainId(String wlsDomainId) {
            this.wlsDomainId = wlsDomainId;
            this.__explicitlySet__.add("wlsDomainId");
            return this;
        }
        /** The path of the WebLogic domain to which the server belongs. */
        @com.fasterxml.jackson.annotation.JsonProperty("wlsDomainPath")
        private String wlsDomainPath;

        /**
         * The path of the WebLogic domain to which the server belongs.
         *
         * @param wlsDomainPath the value to set
         * @return this builder
         */
        public Builder wlsDomainPath(String wlsDomainPath) {
            this.wlsDomainPath = wlsDomainPath;
            this.__explicitlySet__.add("wlsDomainPath");
            return this;
        }
        /** Whether or not the server has installed the latest patches. */
        @com.fasterxml.jackson.annotation.JsonProperty("latestPatchesStatus")
        private LatestPatchesStatus latestPatchesStatus;

        /**
         * Whether or not the server has installed the latest patches.
         *
         * @param latestPatchesStatus the value to set
         * @return this builder
         */
        public Builder latestPatchesStatus(LatestPatchesStatus latestPatchesStatus) {
            this.latestPatchesStatus = latestPatchesStatus;
            this.__explicitlySet__.add("latestPatchesStatus");
            return this;
        }
        /** The patch readiness status of the server. */
        @com.fasterxml.jackson.annotation.JsonProperty("patchReadinessStatus")
        private PatchReadinessStatus patchReadinessStatus;

        /**
         * The patch readiness status of the server.
         *
         * @param patchReadinessStatus the value to set
         * @return this builder
         */
        public Builder patchReadinessStatus(PatchReadinessStatus patchReadinessStatus) {
            this.patchReadinessStatus = patchReadinessStatus;
            this.__explicitlySet__.add("patchReadinessStatus");
            return this;
        }
        /** The name of the server. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * The name of the server.
         *
         * @param hostName the value to set
         * @return this builder
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /** The managed instance ID of the server. */
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
        private String managedInstanceId;

        /**
         * The managed instance ID of the server.
         *
         * @param managedInstanceId the value to set
         * @return this builder
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            this.__explicitlySet__.add("managedInstanceId");
            return this;
        }
        /**
         * The date and time the server was first reported (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the server was first reported (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the server was last reported (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the server was last reported (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ServerSummary build() {
            ServerSummary model =
                    new ServerSummary(
                            this.id,
                            this.name,
                            this.isAdmin,
                            this.status,
                            this.restartOrder,
                            this.middlewarePath,
                            this.middlewareType,
                            this.weblogicVersion,
                            this.jdkPath,
                            this.jdkVersion,
                            this.wlsDomainName,
                            this.wlsDomainId,
                            this.wlsDomainPath,
                            this.latestPatchesStatus,
                            this.patchReadinessStatus,
                            this.hostName,
                            this.managedInstanceId,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ServerSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("isAdmin")) {
                this.isAdmin(model.getIsAdmin());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("restartOrder")) {
                this.restartOrder(model.getRestartOrder());
            }
            if (model.wasPropertyExplicitlySet("middlewarePath")) {
                this.middlewarePath(model.getMiddlewarePath());
            }
            if (model.wasPropertyExplicitlySet("middlewareType")) {
                this.middlewareType(model.getMiddlewareType());
            }
            if (model.wasPropertyExplicitlySet("weblogicVersion")) {
                this.weblogicVersion(model.getWeblogicVersion());
            }
            if (model.wasPropertyExplicitlySet("jdkPath")) {
                this.jdkPath(model.getJdkPath());
            }
            if (model.wasPropertyExplicitlySet("jdkVersion")) {
                this.jdkVersion(model.getJdkVersion());
            }
            if (model.wasPropertyExplicitlySet("wlsDomainName")) {
                this.wlsDomainName(model.getWlsDomainName());
            }
            if (model.wasPropertyExplicitlySet("wlsDomainId")) {
                this.wlsDomainId(model.getWlsDomainId());
            }
            if (model.wasPropertyExplicitlySet("wlsDomainPath")) {
                this.wlsDomainPath(model.getWlsDomainPath());
            }
            if (model.wasPropertyExplicitlySet("latestPatchesStatus")) {
                this.latestPatchesStatus(model.getLatestPatchesStatus());
            }
            if (model.wasPropertyExplicitlySet("patchReadinessStatus")) {
                this.patchReadinessStatus(model.getPatchReadinessStatus());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceId")) {
                this.managedInstanceId(model.getManagedInstanceId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
     * The unique identifier of the server.
     *
     * <p>*Note:** Not an
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique identifier of the server.
     *
     * <p>*Note:** Not an
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The name of the server. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the server.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Whether or not the server is an admin node. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAdmin")
    private final Boolean isAdmin;

    /**
     * Whether or not the server is an admin node.
     *
     * @return the value
     */
    public Boolean getIsAdmin() {
        return isAdmin;
    }

    /** The status of the server. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * The status of the server.
     *
     * @return the value
     */
    public String getStatus() {
        return status;
    }

    /** The restart order assigned to the server. */
    @com.fasterxml.jackson.annotation.JsonProperty("restartOrder")
    private final Integer restartOrder;

    /**
     * The restart order assigned to the server.
     *
     * @return the value
     */
    public Integer getRestartOrder() {
        return restartOrder;
    }

    /** The middleware path on the server. */
    @com.fasterxml.jackson.annotation.JsonProperty("middlewarePath")
    private final String middlewarePath;

    /**
     * The middleware path on the server.
     *
     * @return the value
     */
    public String getMiddlewarePath() {
        return middlewarePath;
    }

    /** The middleware type on the server. */
    @com.fasterxml.jackson.annotation.JsonProperty("middlewareType")
    private final String middlewareType;

    /**
     * The middleware type on the server.
     *
     * @return the value
     */
    public String getMiddlewareType() {
        return middlewareType;
    }

    /** The version of the WebLogic domain of the server */
    @com.fasterxml.jackson.annotation.JsonProperty("weblogicVersion")
    private final String weblogicVersion;

    /**
     * The version of the WebLogic domain of the server
     *
     * @return the value
     */
    public String getWeblogicVersion() {
        return weblogicVersion;
    }

    /** The JDK path on the server. */
    @com.fasterxml.jackson.annotation.JsonProperty("jdkPath")
    private final String jdkPath;

    /**
     * The JDK path on the server.
     *
     * @return the value
     */
    public String getJdkPath() {
        return jdkPath;
    }

    /** The JDK version on the server. */
    @com.fasterxml.jackson.annotation.JsonProperty("jdkVersion")
    private final String jdkVersion;

    /**
     * The JDK version on the server.
     *
     * @return the value
     */
    public String getJdkVersion() {
        return jdkVersion;
    }

    /** The name of the WebLogic domain to which the server belongs. */
    @com.fasterxml.jackson.annotation.JsonProperty("wlsDomainName")
    private final String wlsDomainName;

    /**
     * The name of the WebLogic domain to which the server belongs.
     *
     * @return the value
     */
    public String getWlsDomainName() {
        return wlsDomainName;
    }

    /** The ID of the WebLogic domain to which the server belongs. */
    @com.fasterxml.jackson.annotation.JsonProperty("wlsDomainId")
    private final String wlsDomainId;

    /**
     * The ID of the WebLogic domain to which the server belongs.
     *
     * @return the value
     */
    public String getWlsDomainId() {
        return wlsDomainId;
    }

    /** The path of the WebLogic domain to which the server belongs. */
    @com.fasterxml.jackson.annotation.JsonProperty("wlsDomainPath")
    private final String wlsDomainPath;

    /**
     * The path of the WebLogic domain to which the server belongs.
     *
     * @return the value
     */
    public String getWlsDomainPath() {
        return wlsDomainPath;
    }

    /** Whether or not the server has installed the latest patches. */
    public enum LatestPatchesStatus implements com.oracle.bmc.http.internal.BmcEnum {
        OnLatestPatches("ON_LATEST_PATCHES"),
        PatchingRequired("PATCHING_REQUIRED"),
        Unknown("UNKNOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LatestPatchesStatus.class);

        private final String value;
        private static java.util.Map<String, LatestPatchesStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (LatestPatchesStatus v : LatestPatchesStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LatestPatchesStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LatestPatchesStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LatestPatchesStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Whether or not the server has installed the latest patches. */
    @com.fasterxml.jackson.annotation.JsonProperty("latestPatchesStatus")
    private final LatestPatchesStatus latestPatchesStatus;

    /**
     * Whether or not the server has installed the latest patches.
     *
     * @return the value
     */
    public LatestPatchesStatus getLatestPatchesStatus() {
        return latestPatchesStatus;
    }

    /** The patch readiness status of the server. */
    @com.fasterxml.jackson.annotation.JsonProperty("patchReadinessStatus")
    private final PatchReadinessStatus patchReadinessStatus;

    /**
     * The patch readiness status of the server.
     *
     * @return the value
     */
    public PatchReadinessStatus getPatchReadinessStatus() {
        return patchReadinessStatus;
    }

    /** The name of the server. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * The name of the server.
     *
     * @return the value
     */
    public String getHostName() {
        return hostName;
    }

    /** The managed instance ID of the server. */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
    private final String managedInstanceId;

    /**
     * The managed instance ID of the server.
     *
     * @return the value
     */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }

    /**
     * The date and time the server was first reported (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the server was first reported (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the server was last reported (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the server was last reported (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("ServerSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", isAdmin=").append(String.valueOf(this.isAdmin));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", restartOrder=").append(String.valueOf(this.restartOrder));
        sb.append(", middlewarePath=").append(String.valueOf(this.middlewarePath));
        sb.append(", middlewareType=").append(String.valueOf(this.middlewareType));
        sb.append(", weblogicVersion=").append(String.valueOf(this.weblogicVersion));
        sb.append(", jdkPath=").append(String.valueOf(this.jdkPath));
        sb.append(", jdkVersion=").append(String.valueOf(this.jdkVersion));
        sb.append(", wlsDomainName=").append(String.valueOf(this.wlsDomainName));
        sb.append(", wlsDomainId=").append(String.valueOf(this.wlsDomainId));
        sb.append(", wlsDomainPath=").append(String.valueOf(this.wlsDomainPath));
        sb.append(", latestPatchesStatus=").append(String.valueOf(this.latestPatchesStatus));
        sb.append(", patchReadinessStatus=").append(String.valueOf(this.patchReadinessStatus));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServerSummary)) {
            return false;
        }

        ServerSummary other = (ServerSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.isAdmin, other.isAdmin)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.restartOrder, other.restartOrder)
                && java.util.Objects.equals(this.middlewarePath, other.middlewarePath)
                && java.util.Objects.equals(this.middlewareType, other.middlewareType)
                && java.util.Objects.equals(this.weblogicVersion, other.weblogicVersion)
                && java.util.Objects.equals(this.jdkPath, other.jdkPath)
                && java.util.Objects.equals(this.jdkVersion, other.jdkVersion)
                && java.util.Objects.equals(this.wlsDomainName, other.wlsDomainName)
                && java.util.Objects.equals(this.wlsDomainId, other.wlsDomainId)
                && java.util.Objects.equals(this.wlsDomainPath, other.wlsDomainPath)
                && java.util.Objects.equals(this.latestPatchesStatus, other.latestPatchesStatus)
                && java.util.Objects.equals(this.patchReadinessStatus, other.patchReadinessStatus)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.isAdmin == null ? 43 : this.isAdmin.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.restartOrder == null ? 43 : this.restartOrder.hashCode());
        result =
                (result * PRIME)
                        + (this.middlewarePath == null ? 43 : this.middlewarePath.hashCode());
        result =
                (result * PRIME)
                        + (this.middlewareType == null ? 43 : this.middlewareType.hashCode());
        result =
                (result * PRIME)
                        + (this.weblogicVersion == null ? 43 : this.weblogicVersion.hashCode());
        result = (result * PRIME) + (this.jdkPath == null ? 43 : this.jdkPath.hashCode());
        result = (result * PRIME) + (this.jdkVersion == null ? 43 : this.jdkVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.wlsDomainName == null ? 43 : this.wlsDomainName.hashCode());
        result = (result * PRIME) + (this.wlsDomainId == null ? 43 : this.wlsDomainId.hashCode());
        result =
                (result * PRIME)
                        + (this.wlsDomainPath == null ? 43 : this.wlsDomainPath.hashCode());
        result =
                (result * PRIME)
                        + (this.latestPatchesStatus == null
                                ? 43
                                : this.latestPatchesStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.patchReadinessStatus == null
                                ? 43
                                : this.patchReadinessStatus.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
