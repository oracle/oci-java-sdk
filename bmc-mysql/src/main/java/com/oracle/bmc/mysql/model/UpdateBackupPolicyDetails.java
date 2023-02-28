/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Backup Policy as optionally used for DB System update. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateBackupPolicyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateBackupPolicyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isEnabled",
        "windowStartTime",
        "retentionInDays",
        "freeformTags",
        "definedTags",
        "pitrPolicy"
    })
    public UpdateBackupPolicyDetails(
            Boolean isEnabled,
            String windowStartTime,
            Integer retentionInDays,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            PitrPolicy pitrPolicy) {
        super();
        this.isEnabled = isEnabled;
        this.windowStartTime = windowStartTime;
        this.retentionInDays = retentionInDays;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.pitrPolicy = pitrPolicy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Specifies if automatic backups are enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Specifies if automatic backups are enabled.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * The start of a 30-minute window of time in which daily, automated backups occur.
         *
         * <p>This should be in the format of the "Time" portion of an RFC3339-formatted timestamp.
         * Any second or sub-second time data will be truncated to zero.
         *
         * <p>At some point in the window, the system may incur a brief service disruption as the
         * backup is performed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("windowStartTime")
        private String windowStartTime;

        /**
         * The start of a 30-minute window of time in which daily, automated backups occur.
         *
         * <p>This should be in the format of the "Time" portion of an RFC3339-formatted timestamp.
         * Any second or sub-second time data will be truncated to zero.
         *
         * <p>At some point in the window, the system may incur a brief service disruption as the
         * backup is performed.
         *
         * @param windowStartTime the value to set
         * @return this builder
         */
        public Builder windowStartTime(String windowStartTime) {
            this.windowStartTime = windowStartTime;
            this.__explicitlySet__.add("windowStartTime");
            return this;
        }
        /** Number of days to retain an automatic backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionInDays")
        private Integer retentionInDays;

        /**
         * Number of days to retain an automatic backup.
         *
         * @param retentionInDays the value to set
         * @return this builder
         */
        public Builder retentionInDays(Integer retentionInDays) {
            this.retentionInDays = retentionInDays;
            this.__explicitlySet__.add("retentionInDays");
            return this;
        }
        /**
         * Simple key-value pair applied without any predefined name, type or scope. Exists for
         * cross-compatibility only.
         *
         * <p>Tags defined here will be copied verbatim as tags on the Backup resource created by
         * this BackupPolicy.
         *
         * <p>Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair applied without any predefined name, type or scope. Exists for
         * cross-compatibility only.
         *
         * <p>Tags defined here will be copied verbatim as tags on the Backup resource created by
         * this BackupPolicy.
         *
         * <p>Example: {@code {"bar-key": "value"}}
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
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
         *
         * <p>Tags defined here will be copied verbatim as tags on the Backup resource created by
         * this BackupPolicy.
         *
         * <p>Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
         *
         * <p>Tags defined here will be copied verbatim as tags on the Backup resource created by
         * this BackupPolicy.
         *
         * <p>Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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

        @com.fasterxml.jackson.annotation.JsonProperty("pitrPolicy")
        private PitrPolicy pitrPolicy;

        public Builder pitrPolicy(PitrPolicy pitrPolicy) {
            this.pitrPolicy = pitrPolicy;
            this.__explicitlySet__.add("pitrPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateBackupPolicyDetails build() {
            UpdateBackupPolicyDetails model =
                    new UpdateBackupPolicyDetails(
                            this.isEnabled,
                            this.windowStartTime,
                            this.retentionInDays,
                            this.freeformTags,
                            this.definedTags,
                            this.pitrPolicy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateBackupPolicyDetails model) {
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("windowStartTime")) {
                this.windowStartTime(model.getWindowStartTime());
            }
            if (model.wasPropertyExplicitlySet("retentionInDays")) {
                this.retentionInDays(model.getRetentionInDays());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("pitrPolicy")) {
                this.pitrPolicy(model.getPitrPolicy());
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

    /** Specifies if automatic backups are enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Specifies if automatic backups are enabled.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * The start of a 30-minute window of time in which daily, automated backups occur.
     *
     * <p>This should be in the format of the "Time" portion of an RFC3339-formatted timestamp. Any
     * second or sub-second time data will be truncated to zero.
     *
     * <p>At some point in the window, the system may incur a brief service disruption as the backup
     * is performed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("windowStartTime")
    private final String windowStartTime;

    /**
     * The start of a 30-minute window of time in which daily, automated backups occur.
     *
     * <p>This should be in the format of the "Time" portion of an RFC3339-formatted timestamp. Any
     * second or sub-second time data will be truncated to zero.
     *
     * <p>At some point in the window, the system may incur a brief service disruption as the backup
     * is performed.
     *
     * @return the value
     */
    public String getWindowStartTime() {
        return windowStartTime;
    }

    /** Number of days to retain an automatic backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionInDays")
    private final Integer retentionInDays;

    /**
     * Number of days to retain an automatic backup.
     *
     * @return the value
     */
    public Integer getRetentionInDays() {
        return retentionInDays;
    }

    /**
     * Simple key-value pair applied without any predefined name, type or scope. Exists for
     * cross-compatibility only.
     *
     * <p>Tags defined here will be copied verbatim as tags on the Backup resource created by this
     * BackupPolicy.
     *
     * <p>Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair applied without any predefined name, type or scope. Exists for
     * cross-compatibility only.
     *
     * <p>Tags defined here will be copied verbatim as tags on the Backup resource created by this
     * BackupPolicy.
     *
     * <p>Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     *
     * <p>Tags defined here will be copied verbatim as tags on the Backup resource created by this
     * BackupPolicy.
     *
     * <p>Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     *
     * <p>Tags defined here will be copied verbatim as tags on the Backup resource created by this
     * BackupPolicy.
     *
     * <p>Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("pitrPolicy")
    private final PitrPolicy pitrPolicy;

    public PitrPolicy getPitrPolicy() {
        return pitrPolicy;
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
        sb.append("UpdateBackupPolicyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", windowStartTime=").append(String.valueOf(this.windowStartTime));
        sb.append(", retentionInDays=").append(String.valueOf(this.retentionInDays));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", pitrPolicy=").append(String.valueOf(this.pitrPolicy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateBackupPolicyDetails)) {
            return false;
        }

        UpdateBackupPolicyDetails other = (UpdateBackupPolicyDetails) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.windowStartTime, other.windowStartTime)
                && java.util.Objects.equals(this.retentionInDays, other.retentionInDays)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.pitrPolicy, other.pitrPolicy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.windowStartTime == null ? 43 : this.windowStartTime.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionInDays == null ? 43 : this.retentionInDays.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.pitrPolicy == null ? 43 : this.pitrPolicy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
