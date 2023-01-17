/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The health status details for a backend set.
 *
 * <p>This object does not explicitly enumerate backend servers with a status of {@code OK}.
 * However, they are included in the {@code totalBackendCount} sum. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BackendSetHealth.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class BackendSetHealth
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "status",
        "warningStateBackendNames",
        "criticalStateBackendNames",
        "unknownStateBackendNames",
        "totalBackendCount"
    })
    public BackendSetHealth(
            Status status,
            java.util.List<String> warningStateBackendNames,
            java.util.List<String> criticalStateBackendNames,
            java.util.List<String> unknownStateBackendNames,
            Integer totalBackendCount) {
        super();
        this.status = status;
        this.warningStateBackendNames = warningStateBackendNames;
        this.criticalStateBackendNames = criticalStateBackendNames;
        this.unknownStateBackendNames = unknownStateBackendNames;
        this.totalBackendCount = totalBackendCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Overall health status of the backend set.
         *
         * <p>**OK:** All backend servers in the backend set return a status of {@code OK}.
         *
         * <p>**WARNING:** Half or more of the backend set's backend servers return a status of
         * {@code OK} and at least one backend server returns a status of {@code WARNING}, {@code
         * CRITICAL}, or {@code UNKNOWN}.
         *
         * <p>**CRITICAL:** Fewer than half of the backend set's backend servers return a status of
         * {@code OK}.
         *
         * <p>**UNKNOWN:** More than half of the backend set's backend servers return a status of
         * {@code UNKNOWN}, the system was unable to retrieve metrics, or the backend set does not
         * have a listener attached.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Overall health status of the backend set.
         *
         * <p>**OK:** All backend servers in the backend set return a status of {@code OK}.
         *
         * <p>**WARNING:** Half or more of the backend set's backend servers return a status of
         * {@code OK} and at least one backend server returns a status of {@code WARNING}, {@code
         * CRITICAL}, or {@code UNKNOWN}.
         *
         * <p>**CRITICAL:** Fewer than half of the backend set's backend servers return a status of
         * {@code OK}.
         *
         * <p>**UNKNOWN:** More than half of the backend set's backend servers return a status of
         * {@code UNKNOWN}, the system was unable to retrieve metrics, or the backend set does not
         * have a listener attached.
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
         * A list of backend servers that are currently in the {@code WARNING} health state. The
         * list identifies each backend server by IP address and port.
         *
         * <p>Example: {@code 10.0.0.3:8080}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("warningStateBackendNames")
        private java.util.List<String> warningStateBackendNames;

        /**
         * A list of backend servers that are currently in the {@code WARNING} health state. The
         * list identifies each backend server by IP address and port.
         *
         * <p>Example: {@code 10.0.0.3:8080}
         *
         * @param warningStateBackendNames the value to set
         * @return this builder
         */
        public Builder warningStateBackendNames(java.util.List<String> warningStateBackendNames) {
            this.warningStateBackendNames = warningStateBackendNames;
            this.__explicitlySet__.add("warningStateBackendNames");
            return this;
        }
        /**
         * A list of backend servers that are currently in the {@code CRITICAL} health state. The
         * list identifies each backend server by IP address and port.
         *
         * <p>Example: {@code 10.0.0.4:8080}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("criticalStateBackendNames")
        private java.util.List<String> criticalStateBackendNames;

        /**
         * A list of backend servers that are currently in the {@code CRITICAL} health state. The
         * list identifies each backend server by IP address and port.
         *
         * <p>Example: {@code 10.0.0.4:8080}
         *
         * @param criticalStateBackendNames the value to set
         * @return this builder
         */
        public Builder criticalStateBackendNames(java.util.List<String> criticalStateBackendNames) {
            this.criticalStateBackendNames = criticalStateBackendNames;
            this.__explicitlySet__.add("criticalStateBackendNames");
            return this;
        }
        /**
         * A list of backend servers that are currently in the {@code UNKNOWN} health state. The
         * list identifies each backend server by IP address and port.
         *
         * <p>Example: {@code 10.0.0.5:8080}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("unknownStateBackendNames")
        private java.util.List<String> unknownStateBackendNames;

        /**
         * A list of backend servers that are currently in the {@code UNKNOWN} health state. The
         * list identifies each backend server by IP address and port.
         *
         * <p>Example: {@code 10.0.0.5:8080}
         *
         * @param unknownStateBackendNames the value to set
         * @return this builder
         */
        public Builder unknownStateBackendNames(java.util.List<String> unknownStateBackendNames) {
            this.unknownStateBackendNames = unknownStateBackendNames;
            this.__explicitlySet__.add("unknownStateBackendNames");
            return this;
        }
        /**
         * The total number of backend servers in this backend set.
         *
         * <p>Example: {@code 7}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("totalBackendCount")
        private Integer totalBackendCount;

        /**
         * The total number of backend servers in this backend set.
         *
         * <p>Example: {@code 7}
         *
         * @param totalBackendCount the value to set
         * @return this builder
         */
        public Builder totalBackendCount(Integer totalBackendCount) {
            this.totalBackendCount = totalBackendCount;
            this.__explicitlySet__.add("totalBackendCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BackendSetHealth build() {
            BackendSetHealth model =
                    new BackendSetHealth(
                            this.status,
                            this.warningStateBackendNames,
                            this.criticalStateBackendNames,
                            this.unknownStateBackendNames,
                            this.totalBackendCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BackendSetHealth model) {
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("warningStateBackendNames")) {
                this.warningStateBackendNames(model.getWarningStateBackendNames());
            }
            if (model.wasPropertyExplicitlySet("criticalStateBackendNames")) {
                this.criticalStateBackendNames(model.getCriticalStateBackendNames());
            }
            if (model.wasPropertyExplicitlySet("unknownStateBackendNames")) {
                this.unknownStateBackendNames(model.getUnknownStateBackendNames());
            }
            if (model.wasPropertyExplicitlySet("totalBackendCount")) {
                this.totalBackendCount(model.getTotalBackendCount());
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
     * Overall health status of the backend set.
     *
     * <p>**OK:** All backend servers in the backend set return a status of {@code OK}.
     *
     * <p>**WARNING:** Half or more of the backend set's backend servers return a status of {@code
     * OK} and at least one backend server returns a status of {@code WARNING}, {@code CRITICAL}, or
     * {@code UNKNOWN}.
     *
     * <p>**CRITICAL:** Fewer than half of the backend set's backend servers return a status of
     * {@code OK}.
     *
     * <p>**UNKNOWN:** More than half of the backend set's backend servers return a status of {@code
     * UNKNOWN}, the system was unable to retrieve metrics, or the backend set does not have a
     * listener attached.
     */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Ok("OK"),
        Warning("WARNING"),
        Critical("CRITICAL"),
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
    /**
     * Overall health status of the backend set.
     *
     * <p>**OK:** All backend servers in the backend set return a status of {@code OK}.
     *
     * <p>**WARNING:** Half or more of the backend set's backend servers return a status of {@code
     * OK} and at least one backend server returns a status of {@code WARNING}, {@code CRITICAL}, or
     * {@code UNKNOWN}.
     *
     * <p>**CRITICAL:** Fewer than half of the backend set's backend servers return a status of
     * {@code OK}.
     *
     * <p>**UNKNOWN:** More than half of the backend set's backend servers return a status of {@code
     * UNKNOWN}, the system was unable to retrieve metrics, or the backend set does not have a
     * listener attached.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Overall health status of the backend set.
     *
     * <p>**OK:** All backend servers in the backend set return a status of {@code OK}.
     *
     * <p>**WARNING:** Half or more of the backend set's backend servers return a status of {@code
     * OK} and at least one backend server returns a status of {@code WARNING}, {@code CRITICAL}, or
     * {@code UNKNOWN}.
     *
     * <p>**CRITICAL:** Fewer than half of the backend set's backend servers return a status of
     * {@code OK}.
     *
     * <p>**UNKNOWN:** More than half of the backend set's backend servers return a status of {@code
     * UNKNOWN}, the system was unable to retrieve metrics, or the backend set does not have a
     * listener attached.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /**
     * A list of backend servers that are currently in the {@code WARNING} health state. The list
     * identifies each backend server by IP address and port.
     *
     * <p>Example: {@code 10.0.0.3:8080}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("warningStateBackendNames")
    private final java.util.List<String> warningStateBackendNames;

    /**
     * A list of backend servers that are currently in the {@code WARNING} health state. The list
     * identifies each backend server by IP address and port.
     *
     * <p>Example: {@code 10.0.0.3:8080}
     *
     * @return the value
     */
    public java.util.List<String> getWarningStateBackendNames() {
        return warningStateBackendNames;
    }

    /**
     * A list of backend servers that are currently in the {@code CRITICAL} health state. The list
     * identifies each backend server by IP address and port.
     *
     * <p>Example: {@code 10.0.0.4:8080}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("criticalStateBackendNames")
    private final java.util.List<String> criticalStateBackendNames;

    /**
     * A list of backend servers that are currently in the {@code CRITICAL} health state. The list
     * identifies each backend server by IP address and port.
     *
     * <p>Example: {@code 10.0.0.4:8080}
     *
     * @return the value
     */
    public java.util.List<String> getCriticalStateBackendNames() {
        return criticalStateBackendNames;
    }

    /**
     * A list of backend servers that are currently in the {@code UNKNOWN} health state. The list
     * identifies each backend server by IP address and port.
     *
     * <p>Example: {@code 10.0.0.5:8080}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("unknownStateBackendNames")
    private final java.util.List<String> unknownStateBackendNames;

    /**
     * A list of backend servers that are currently in the {@code UNKNOWN} health state. The list
     * identifies each backend server by IP address and port.
     *
     * <p>Example: {@code 10.0.0.5:8080}
     *
     * @return the value
     */
    public java.util.List<String> getUnknownStateBackendNames() {
        return unknownStateBackendNames;
    }

    /**
     * The total number of backend servers in this backend set.
     *
     * <p>Example: {@code 7}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("totalBackendCount")
    private final Integer totalBackendCount;

    /**
     * The total number of backend servers in this backend set.
     *
     * <p>Example: {@code 7}
     *
     * @return the value
     */
    public Integer getTotalBackendCount() {
        return totalBackendCount;
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
        sb.append("BackendSetHealth(");
        sb.append("super=").append(super.toString());
        sb.append("status=").append(String.valueOf(this.status));
        sb.append(", warningStateBackendNames=")
                .append(String.valueOf(this.warningStateBackendNames));
        sb.append(", criticalStateBackendNames=")
                .append(String.valueOf(this.criticalStateBackendNames));
        sb.append(", unknownStateBackendNames=")
                .append(String.valueOf(this.unknownStateBackendNames));
        sb.append(", totalBackendCount=").append(String.valueOf(this.totalBackendCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BackendSetHealth)) {
            return false;
        }

        BackendSetHealth other = (BackendSetHealth) o;
        return java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(
                        this.warningStateBackendNames, other.warningStateBackendNames)
                && java.util.Objects.equals(
                        this.criticalStateBackendNames, other.criticalStateBackendNames)
                && java.util.Objects.equals(
                        this.unknownStateBackendNames, other.unknownStateBackendNames)
                && java.util.Objects.equals(this.totalBackendCount, other.totalBackendCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.warningStateBackendNames == null
                                ? 43
                                : this.warningStateBackendNames.hashCode());
        result =
                (result * PRIME)
                        + (this.criticalStateBackendNames == null
                                ? 43
                                : this.criticalStateBackendNames.hashCode());
        result =
                (result * PRIME)
                        + (this.unknownStateBackendNames == null
                                ? 43
                                : this.unknownStateBackendNames.hashCode());
        result =
                (result * PRIME)
                        + (this.totalBackendCount == null ? 43 : this.totalBackendCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
