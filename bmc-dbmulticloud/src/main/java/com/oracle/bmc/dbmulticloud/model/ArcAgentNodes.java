/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.model;

/**
 * Azure Arc Agent node details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ArcAgentNodes.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ArcAgentNodes extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "hostName",
        "hostId",
        "currentArcAgentVersion",
        "status",
        "timeLastChecked"
    })
    public ArcAgentNodes(
            String hostName,
            String hostId,
            String currentArcAgentVersion,
            Status status,
            java.util.Date timeLastChecked) {
        super();
        this.hostName = hostName;
        this.hostId = hostId;
        this.currentArcAgentVersion = currentArcAgentVersion;
        this.status = status;
        this.timeLastChecked = timeLastChecked;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Host name or Azure Arc Agent name. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * Host name or Azure Arc Agent name.
         *
         * @param hostName the value to set
         * @return this builder
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /** Host ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostId")
        private String hostId;

        /**
         * Host ID.
         *
         * @param hostId the value to set
         * @return this builder
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            this.__explicitlySet__.add("hostId");
            return this;
        }
        /** Current Arc Agent Version installed on this node of Oracle Cloud VM Cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("currentArcAgentVersion")
        private String currentArcAgentVersion;

        /**
         * Current Arc Agent Version installed on this node of Oracle Cloud VM Cluster.
         *
         * @param currentArcAgentVersion the value to set
         * @return this builder
         */
        public Builder currentArcAgentVersion(String currentArcAgentVersion) {
            this.currentArcAgentVersion = currentArcAgentVersion;
            this.__explicitlySet__.add("currentArcAgentVersion");
            return this;
        }
        /** The current status of the Azure Arc Agent resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The current status of the Azure Arc Agent resource.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Time when the Azure Arc Agent's status was checked [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g.
         * '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastChecked")
        private java.util.Date timeLastChecked;

        /**
         * Time when the Azure Arc Agent's status was checked [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g.
         * '2020-05-22T21:10:29.600Z'
         *
         * @param timeLastChecked the value to set
         * @return this builder
         */
        public Builder timeLastChecked(java.util.Date timeLastChecked) {
            this.timeLastChecked = timeLastChecked;
            this.__explicitlySet__.add("timeLastChecked");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ArcAgentNodes build() {
            ArcAgentNodes model =
                    new ArcAgentNodes(
                            this.hostName,
                            this.hostId,
                            this.currentArcAgentVersion,
                            this.status,
                            this.timeLastChecked);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ArcAgentNodes model) {
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("hostId")) {
                this.hostId(model.getHostId());
            }
            if (model.wasPropertyExplicitlySet("currentArcAgentVersion")) {
                this.currentArcAgentVersion(model.getCurrentArcAgentVersion());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("timeLastChecked")) {
                this.timeLastChecked(model.getTimeLastChecked());
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

    /** Host name or Azure Arc Agent name. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * Host name or Azure Arc Agent name.
     *
     * @return the value
     */
    public String getHostName() {
        return hostName;
    }

    /** Host ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostId")
    private final String hostId;

    /**
     * Host ID.
     *
     * @return the value
     */
    public String getHostId() {
        return hostId;
    }

    /** Current Arc Agent Version installed on this node of Oracle Cloud VM Cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("currentArcAgentVersion")
    private final String currentArcAgentVersion;

    /**
     * Current Arc Agent Version installed on this node of Oracle Cloud VM Cluster.
     *
     * @return the value
     */
    public String getCurrentArcAgentVersion() {
        return currentArcAgentVersion;
    }

    /** The current status of the Azure Arc Agent resource. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Connected("CONNECTED"),
        Disconnected("DISCONNECTED"),
        Unknown("UNKNOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current status of the Azure Arc Agent resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The current status of the Azure Arc Agent resource.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Time when the Azure Arc Agent's status was checked [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g. '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastChecked")
    private final java.util.Date timeLastChecked;

    /**
     * Time when the Azure Arc Agent's status was checked [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g. '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeLastChecked() {
        return timeLastChecked;
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
        sb.append("ArcAgentNodes(");
        sb.append("super=").append(super.toString());
        sb.append("hostName=").append(String.valueOf(this.hostName));
        sb.append(", hostId=").append(String.valueOf(this.hostId));
        sb.append(", currentArcAgentVersion=").append(String.valueOf(this.currentArcAgentVersion));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeLastChecked=").append(String.valueOf(this.timeLastChecked));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ArcAgentNodes)) {
            return false;
        }

        ArcAgentNodes other = (ArcAgentNodes) o;
        return java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.hostId, other.hostId)
                && java.util.Objects.equals(
                        this.currentArcAgentVersion, other.currentArcAgentVersion)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeLastChecked, other.timeLastChecked)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result = (result * PRIME) + (this.hostId == null ? 43 : this.hostId.hashCode());
        result =
                (result * PRIME)
                        + (this.currentArcAgentVersion == null
                                ? 43
                                : this.currentArcAgentVersion.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastChecked == null ? 43 : this.timeLastChecked.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
