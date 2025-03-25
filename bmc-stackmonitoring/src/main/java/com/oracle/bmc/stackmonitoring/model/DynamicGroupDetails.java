/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Dynamic Group object <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DynamicGroupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DynamicGroupDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "domain", "stackMonitoringAssignment"})
    public DynamicGroupDetails(
            String name, String domain, StackMonitoringAssignment stackMonitoringAssignment) {
        super();
        this.name = name;
        this.domain = domain;
        this.stackMonitoringAssignment = stackMonitoringAssignment;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of dynamic Group */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of dynamic Group
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Identity domain name */
        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        /**
         * Identity domain name
         *
         * @param domain the value to set
         * @return this builder
         */
        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }
        /**
         * Assignment of dynamic group in context of Stack Monitoring service. It describes the
         * purpose of dynamic groups in Stack Monitoring.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("stackMonitoringAssignment")
        private StackMonitoringAssignment stackMonitoringAssignment;

        /**
         * Assignment of dynamic group in context of Stack Monitoring service. It describes the
         * purpose of dynamic groups in Stack Monitoring.
         *
         * @param stackMonitoringAssignment the value to set
         * @return this builder
         */
        public Builder stackMonitoringAssignment(
                StackMonitoringAssignment stackMonitoringAssignment) {
            this.stackMonitoringAssignment = stackMonitoringAssignment;
            this.__explicitlySet__.add("stackMonitoringAssignment");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DynamicGroupDetails build() {
            DynamicGroupDetails model =
                    new DynamicGroupDetails(this.name, this.domain, this.stackMonitoringAssignment);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DynamicGroupDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("domain")) {
                this.domain(model.getDomain());
            }
            if (model.wasPropertyExplicitlySet("stackMonitoringAssignment")) {
                this.stackMonitoringAssignment(model.getStackMonitoringAssignment());
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

    /** Name of dynamic Group */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of dynamic Group
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Identity domain name */
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    private final String domain;

    /**
     * Identity domain name
     *
     * @return the value
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Assignment of dynamic group in context of Stack Monitoring service. It describes the purpose
     * of dynamic groups in Stack Monitoring.
     */
    public enum StackMonitoringAssignment implements com.oracle.bmc.http.internal.BmcEnum {
        ManagementAgents("MANAGEMENT_AGENTS"),
        MonitoredInstances("MONITORED_INSTANCES"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(StackMonitoringAssignment.class);

        private final String value;
        private static java.util.Map<String, StackMonitoringAssignment> map;

        static {
            map = new java.util.HashMap<>();
            for (StackMonitoringAssignment v : StackMonitoringAssignment.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        StackMonitoringAssignment(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StackMonitoringAssignment create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'StackMonitoringAssignment', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Assignment of dynamic group in context of Stack Monitoring service. It describes the purpose
     * of dynamic groups in Stack Monitoring.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("stackMonitoringAssignment")
    private final StackMonitoringAssignment stackMonitoringAssignment;

    /**
     * Assignment of dynamic group in context of Stack Monitoring service. It describes the purpose
     * of dynamic groups in Stack Monitoring.
     *
     * @return the value
     */
    public StackMonitoringAssignment getStackMonitoringAssignment() {
        return stackMonitoringAssignment;
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
        sb.append("DynamicGroupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", domain=").append(String.valueOf(this.domain));
        sb.append(", stackMonitoringAssignment=")
                .append(String.valueOf(this.stackMonitoringAssignment));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DynamicGroupDetails)) {
            return false;
        }

        DynamicGroupDetails other = (DynamicGroupDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(
                        this.stackMonitoringAssignment, other.stackMonitoringAssignment)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result =
                (result * PRIME)
                        + (this.stackMonitoringAssignment == null
                                ? 43
                                : this.stackMonitoringAssignment.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
