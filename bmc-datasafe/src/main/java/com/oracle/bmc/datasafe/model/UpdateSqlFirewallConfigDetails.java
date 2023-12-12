/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to update the SQL Firewall config. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateSqlFirewallConfigDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateSqlFirewallConfigDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"status", "violationLogAutoPurge", "excludeJob"})
    public UpdateSqlFirewallConfigDetails(
            Status status, ViolationLogAutoPurge violationLogAutoPurge, ExcludeJob excludeJob) {
        super();
        this.status = status;
        this.violationLogAutoPurge = violationLogAutoPurge;
        this.excludeJob = excludeJob;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Specifies whether the firewall is enabled or disabled on the target database. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Specifies whether the firewall is enabled or disabled on the target database.
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
         * Specifies whether Data Safe should automatically purge the violation logs from the
         * database after collecting the violation logs and persisting on Data Safe.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("violationLogAutoPurge")
        private ViolationLogAutoPurge violationLogAutoPurge;

        /**
         * Specifies whether Data Safe should automatically purge the violation logs from the
         * database after collecting the violation logs and persisting on Data Safe.
         *
         * @param violationLogAutoPurge the value to set
         * @return this builder
         */
        public Builder violationLogAutoPurge(ViolationLogAutoPurge violationLogAutoPurge) {
            this.violationLogAutoPurge = violationLogAutoPurge;
            this.__explicitlySet__.add("violationLogAutoPurge");
            return this;
        }
        /**
         * Specifies whether the firewall should include or exclude the database internal job
         * activities.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("excludeJob")
        private ExcludeJob excludeJob;

        /**
         * Specifies whether the firewall should include or exclude the database internal job
         * activities.
         *
         * @param excludeJob the value to set
         * @return this builder
         */
        public Builder excludeJob(ExcludeJob excludeJob) {
            this.excludeJob = excludeJob;
            this.__explicitlySet__.add("excludeJob");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSqlFirewallConfigDetails build() {
            UpdateSqlFirewallConfigDetails model =
                    new UpdateSqlFirewallConfigDetails(
                            this.status, this.violationLogAutoPurge, this.excludeJob);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSqlFirewallConfigDetails model) {
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("violationLogAutoPurge")) {
                this.violationLogAutoPurge(model.getViolationLogAutoPurge());
            }
            if (model.wasPropertyExplicitlySet("excludeJob")) {
                this.excludeJob(model.getExcludeJob());
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

    /** Specifies whether the firewall is enabled or disabled on the target database. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        ;

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Status: " + key);
        }
    };
    /** Specifies whether the firewall is enabled or disabled on the target database. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Specifies whether the firewall is enabled or disabled on the target database.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Specifies whether Data Safe should automatically purge the violation logs from the database
     * after collecting the violation logs and persisting on Data Safe.
     */
    public enum ViolationLogAutoPurge implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        ;

        private final String value;
        private static java.util.Map<String, ViolationLogAutoPurge> map;

        static {
            map = new java.util.HashMap<>();
            for (ViolationLogAutoPurge v : ViolationLogAutoPurge.values()) {
                map.put(v.getValue(), v);
            }
        }

        ViolationLogAutoPurge(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ViolationLogAutoPurge create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ViolationLogAutoPurge: " + key);
        }
    };
    /**
     * Specifies whether Data Safe should automatically purge the violation logs from the database
     * after collecting the violation logs and persisting on Data Safe.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("violationLogAutoPurge")
    private final ViolationLogAutoPurge violationLogAutoPurge;

    /**
     * Specifies whether Data Safe should automatically purge the violation logs from the database
     * after collecting the violation logs and persisting on Data Safe.
     *
     * @return the value
     */
    public ViolationLogAutoPurge getViolationLogAutoPurge() {
        return violationLogAutoPurge;
    }

    /**
     * Specifies whether the firewall should include or exclude the database internal job
     * activities.
     */
    public enum ExcludeJob implements com.oracle.bmc.http.internal.BmcEnum {
        Excluded("EXCLUDED"),
        Included("INCLUDED"),
        ;

        private final String value;
        private static java.util.Map<String, ExcludeJob> map;

        static {
            map = new java.util.HashMap<>();
            for (ExcludeJob v : ExcludeJob.values()) {
                map.put(v.getValue(), v);
            }
        }

        ExcludeJob(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExcludeJob create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ExcludeJob: " + key);
        }
    };
    /**
     * Specifies whether the firewall should include or exclude the database internal job
     * activities.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("excludeJob")
    private final ExcludeJob excludeJob;

    /**
     * Specifies whether the firewall should include or exclude the database internal job
     * activities.
     *
     * @return the value
     */
    public ExcludeJob getExcludeJob() {
        return excludeJob;
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
        sb.append("UpdateSqlFirewallConfigDetails(");
        sb.append("super=").append(super.toString());
        sb.append("status=").append(String.valueOf(this.status));
        sb.append(", violationLogAutoPurge=").append(String.valueOf(this.violationLogAutoPurge));
        sb.append(", excludeJob=").append(String.valueOf(this.excludeJob));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSqlFirewallConfigDetails)) {
            return false;
        }

        UpdateSqlFirewallConfigDetails other = (UpdateSqlFirewallConfigDetails) o;
        return java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.violationLogAutoPurge, other.violationLogAutoPurge)
                && java.util.Objects.equals(this.excludeJob, other.excludeJob)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.violationLogAutoPurge == null
                                ? 43
                                : this.violationLogAutoPurge.hashCode());
        result = (result * PRIME) + (this.excludeJob == null ? 43 : this.excludeJob.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
