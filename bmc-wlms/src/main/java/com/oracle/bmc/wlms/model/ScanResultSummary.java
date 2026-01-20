/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.wlms.model;

/**
 * The result of a server check in a managed instance. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ScanResultSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ScanResultSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "wlsDomainId",
        "serverName",
        "timeOfServerCheck",
        "serverCheckStatus",
        "serverCheckName",
        "serverCheckResultId",
        "serverCheckResult"
    })
    public ScanResultSummary(
            String wlsDomainId,
            String serverName,
            java.util.Date timeOfServerCheck,
            ServerCheckStatus serverCheckStatus,
            String serverCheckName,
            String serverCheckResultId,
            String serverCheckResult) {
        super();
        this.wlsDomainId = wlsDomainId;
        this.serverName = serverName;
        this.timeOfServerCheck = timeOfServerCheck;
        this.serverCheckStatus = serverCheckStatus;
        this.serverCheckName = serverCheckName;
        this.serverCheckResultId = serverCheckResultId;
        this.serverCheckResult = serverCheckResult;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * WebLogic domain.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("wlsDomainId")
        private String wlsDomainId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * WebLogic domain.
         *
         * @param wlsDomainId the value to set
         * @return this builder
         */
        public Builder wlsDomainId(String wlsDomainId) {
            this.wlsDomainId = wlsDomainId;
            this.__explicitlySet__.add("wlsDomainId");
            return this;
        }
        /** The name of the WebLogic server to which the server check belongs. */
        @com.fasterxml.jackson.annotation.JsonProperty("serverName")
        private String serverName;

        /**
         * The name of the WebLogic server to which the server check belongs.
         *
         * @param serverName the value to set
         * @return this builder
         */
        public Builder serverName(String serverName) {
            this.serverName = serverName;
            this.__explicitlySet__.add("serverName");
            return this;
        }
        /**
         * The date when the WebLogic server health check is performed (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfServerCheck")
        private java.util.Date timeOfServerCheck;

        /**
         * The date when the WebLogic server health check is performed (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeOfServerCheck the value to set
         * @return this builder
         */
        public Builder timeOfServerCheck(java.util.Date timeOfServerCheck) {
            this.timeOfServerCheck = timeOfServerCheck;
            this.__explicitlySet__.add("timeOfServerCheck");
            return this;
        }
        /** The status of the server check which is OK, FAILURE, or WARNING. */
        @com.fasterxml.jackson.annotation.JsonProperty("serverCheckStatus")
        private ServerCheckStatus serverCheckStatus;

        /**
         * The status of the server check which is OK, FAILURE, or WARNING.
         *
         * @param serverCheckStatus the value to set
         * @return this builder
         */
        public Builder serverCheckStatus(ServerCheckStatus serverCheckStatus) {
            this.serverCheckStatus = serverCheckStatus;
            this.__explicitlySet__.add("serverCheckStatus");
            return this;
        }
        /** The name of the check performed. */
        @com.fasterxml.jackson.annotation.JsonProperty("serverCheckName")
        private String serverCheckName;

        /**
         * The name of the check performed.
         *
         * @param serverCheckName the value to set
         * @return this builder
         */
        public Builder serverCheckName(String serverCheckName) {
            this.serverCheckName = serverCheckName;
            this.__explicitlySet__.add("serverCheckName");
            return this;
        }
        /** The identifier of the the server check result. */
        @com.fasterxml.jackson.annotation.JsonProperty("serverCheckResultId")
        private String serverCheckResultId;

        /**
         * The identifier of the the server check result.
         *
         * @param serverCheckResultId the value to set
         * @return this builder
         */
        public Builder serverCheckResultId(String serverCheckResultId) {
            this.serverCheckResultId = serverCheckResultId;
            this.__explicitlySet__.add("serverCheckResultId");
            return this;
        }
        /** The result of the server check. */
        @com.fasterxml.jackson.annotation.JsonProperty("serverCheckResult")
        private String serverCheckResult;

        /**
         * The result of the server check.
         *
         * @param serverCheckResult the value to set
         * @return this builder
         */
        public Builder serverCheckResult(String serverCheckResult) {
            this.serverCheckResult = serverCheckResult;
            this.__explicitlySet__.add("serverCheckResult");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScanResultSummary build() {
            ScanResultSummary model =
                    new ScanResultSummary(
                            this.wlsDomainId,
                            this.serverName,
                            this.timeOfServerCheck,
                            this.serverCheckStatus,
                            this.serverCheckName,
                            this.serverCheckResultId,
                            this.serverCheckResult);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScanResultSummary model) {
            if (model.wasPropertyExplicitlySet("wlsDomainId")) {
                this.wlsDomainId(model.getWlsDomainId());
            }
            if (model.wasPropertyExplicitlySet("serverName")) {
                this.serverName(model.getServerName());
            }
            if (model.wasPropertyExplicitlySet("timeOfServerCheck")) {
                this.timeOfServerCheck(model.getTimeOfServerCheck());
            }
            if (model.wasPropertyExplicitlySet("serverCheckStatus")) {
                this.serverCheckStatus(model.getServerCheckStatus());
            }
            if (model.wasPropertyExplicitlySet("serverCheckName")) {
                this.serverCheckName(model.getServerCheckName());
            }
            if (model.wasPropertyExplicitlySet("serverCheckResultId")) {
                this.serverCheckResultId(model.getServerCheckResultId());
            }
            if (model.wasPropertyExplicitlySet("serverCheckResult")) {
                this.serverCheckResult(model.getServerCheckResult());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * WebLogic domain.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("wlsDomainId")
    private final String wlsDomainId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * WebLogic domain.
     *
     * @return the value
     */
    public String getWlsDomainId() {
        return wlsDomainId;
    }

    /** The name of the WebLogic server to which the server check belongs. */
    @com.fasterxml.jackson.annotation.JsonProperty("serverName")
    private final String serverName;

    /**
     * The name of the WebLogic server to which the server check belongs.
     *
     * @return the value
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * The date when the WebLogic server health check is performed (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfServerCheck")
    private final java.util.Date timeOfServerCheck;

    /**
     * The date when the WebLogic server health check is performed (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeOfServerCheck() {
        return timeOfServerCheck;
    }

    /** The status of the server check which is OK, FAILURE, or WARNING. */
    public enum ServerCheckStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Ok("OK"),
        Warning("WARNING"),
        Failure("FAILURE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ServerCheckStatus.class);

        private final String value;
        private static java.util.Map<String, ServerCheckStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (ServerCheckStatus v : ServerCheckStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ServerCheckStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ServerCheckStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ServerCheckStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The status of the server check which is OK, FAILURE, or WARNING. */
    @com.fasterxml.jackson.annotation.JsonProperty("serverCheckStatus")
    private final ServerCheckStatus serverCheckStatus;

    /**
     * The status of the server check which is OK, FAILURE, or WARNING.
     *
     * @return the value
     */
    public ServerCheckStatus getServerCheckStatus() {
        return serverCheckStatus;
    }

    /** The name of the check performed. */
    @com.fasterxml.jackson.annotation.JsonProperty("serverCheckName")
    private final String serverCheckName;

    /**
     * The name of the check performed.
     *
     * @return the value
     */
    public String getServerCheckName() {
        return serverCheckName;
    }

    /** The identifier of the the server check result. */
    @com.fasterxml.jackson.annotation.JsonProperty("serverCheckResultId")
    private final String serverCheckResultId;

    /**
     * The identifier of the the server check result.
     *
     * @return the value
     */
    public String getServerCheckResultId() {
        return serverCheckResultId;
    }

    /** The result of the server check. */
    @com.fasterxml.jackson.annotation.JsonProperty("serverCheckResult")
    private final String serverCheckResult;

    /**
     * The result of the server check.
     *
     * @return the value
     */
    public String getServerCheckResult() {
        return serverCheckResult;
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
        sb.append("ScanResultSummary(");
        sb.append("super=").append(super.toString());
        sb.append("wlsDomainId=").append(String.valueOf(this.wlsDomainId));
        sb.append(", serverName=").append(String.valueOf(this.serverName));
        sb.append(", timeOfServerCheck=").append(String.valueOf(this.timeOfServerCheck));
        sb.append(", serverCheckStatus=").append(String.valueOf(this.serverCheckStatus));
        sb.append(", serverCheckName=").append(String.valueOf(this.serverCheckName));
        sb.append(", serverCheckResultId=").append(String.valueOf(this.serverCheckResultId));
        sb.append(", serverCheckResult=").append(String.valueOf(this.serverCheckResult));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScanResultSummary)) {
            return false;
        }

        ScanResultSummary other = (ScanResultSummary) o;
        return java.util.Objects.equals(this.wlsDomainId, other.wlsDomainId)
                && java.util.Objects.equals(this.serverName, other.serverName)
                && java.util.Objects.equals(this.timeOfServerCheck, other.timeOfServerCheck)
                && java.util.Objects.equals(this.serverCheckStatus, other.serverCheckStatus)
                && java.util.Objects.equals(this.serverCheckName, other.serverCheckName)
                && java.util.Objects.equals(this.serverCheckResultId, other.serverCheckResultId)
                && java.util.Objects.equals(this.serverCheckResult, other.serverCheckResult)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.wlsDomainId == null ? 43 : this.wlsDomainId.hashCode());
        result = (result * PRIME) + (this.serverName == null ? 43 : this.serverName.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfServerCheck == null ? 43 : this.timeOfServerCheck.hashCode());
        result =
                (result * PRIME)
                        + (this.serverCheckStatus == null ? 43 : this.serverCheckStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.serverCheckName == null ? 43 : this.serverCheckName.hashCode());
        result =
                (result * PRIME)
                        + (this.serverCheckResultId == null
                                ? 43
                                : this.serverCheckResultId.hashCode());
        result =
                (result * PRIME)
                        + (this.serverCheckResult == null ? 43 : this.serverCheckResult.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
