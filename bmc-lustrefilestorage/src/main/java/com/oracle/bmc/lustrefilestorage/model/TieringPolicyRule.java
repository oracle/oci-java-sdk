/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lustrefilestorage.model;

/**
 * A path-based tiering policy rule. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TieringPolicyRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TieringPolicyRule
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "pathPrefixes",
        "action",
        "minSizeInBytes",
        "archiveAfterDaysSinceLastAccess",
        "releaseAfterDaysSinceLastAccess"
    })
    public TieringPolicyRule(
            java.util.List<String> pathPrefixes,
            Action action,
            Long minSizeInBytes,
            Integer archiveAfterDaysSinceLastAccess,
            Integer releaseAfterDaysSinceLastAccess) {
        super();
        this.pathPrefixes = pathPrefixes;
        this.action = action;
        this.minSizeInBytes = minSizeInBytes;
        this.archiveAfterDaysSinceLastAccess = archiveAfterDaysSinceLastAccess;
        this.releaseAfterDaysSinceLastAccess = releaseAfterDaysSinceLastAccess;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * One or more absolute path prefixes in the Lustre file system to which this rule applies.
         * The service preserves the order of path prefixes in responses. Each path prefix can
         * contain up to 4096 characters. Each rule must contain at least one path prefix, and a
         * tiering policy can contain up to 100 path prefixes total across all rules.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("pathPrefixes")
        private java.util.List<String> pathPrefixes;

        /**
         * One or more absolute path prefixes in the Lustre file system to which this rule applies.
         * The service preserves the order of path prefixes in responses. Each path prefix can
         * contain up to 4096 characters. Each rule must contain at least one path prefix, and a
         * tiering policy can contain up to 100 path prefixes total across all rules.
         *
         * @param pathPrefixes the value to set
         * @return this builder
         */
        public Builder pathPrefixes(java.util.List<String> pathPrefixes) {
            this.pathPrefixes = pathPrefixes;
            this.__explicitlySet__.add("pathPrefixes");
            return this;
        }
        /**
         * The action to apply to files whose paths match this rule. {@code ARCHIVE} makes matching
         * files eligible to be archived to Object Storage. {@code SKIP} excludes matching files
         * from being archived.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * The action to apply to files whose paths match this rule. {@code ARCHIVE} makes matching
         * files eligible to be archived to Object Storage. {@code SKIP} excludes matching files
         * from being archived.
         *
         * @param action the value to set
         * @return this builder
         */
        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /**
         * Optional minimum file size in bytes for an ARCHIVE rule to apply. Must not be specified
         * for SKIP rules.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minSizeInBytes")
        private Long minSizeInBytes;

        /**
         * Optional minimum file size in bytes for an ARCHIVE rule to apply. Must not be specified
         * for SKIP rules.
         *
         * @param minSizeInBytes the value to set
         * @return this builder
         */
        public Builder minSizeInBytes(Long minSizeInBytes) {
            this.minSizeInBytes = minSizeInBytes;
            this.__explicitlySet__.add("minSizeInBytes");
            return this;
        }
        /**
         * Required for ARCHIVE rules. Archive files that have not been accessed for this many days.
         * Must not be specified for SKIP rules.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("archiveAfterDaysSinceLastAccess")
        private Integer archiveAfterDaysSinceLastAccess;

        /**
         * Required for ARCHIVE rules. Archive files that have not been accessed for this many days.
         * Must not be specified for SKIP rules.
         *
         * @param archiveAfterDaysSinceLastAccess the value to set
         * @return this builder
         */
        public Builder archiveAfterDaysSinceLastAccess(Integer archiveAfterDaysSinceLastAccess) {
            this.archiveAfterDaysSinceLastAccess = archiveAfterDaysSinceLastAccess;
            this.__explicitlySet__.add("archiveAfterDaysSinceLastAccess");
            return this;
        }
        /**
         * Required for ARCHIVE rules. Release archived file data from files that have not been
         * accessed for this many days. This value must be greater than {@code
         * archiveAfterDaysSinceLastAccess}. Must not be specified for SKIP rules.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("releaseAfterDaysSinceLastAccess")
        private Integer releaseAfterDaysSinceLastAccess;

        /**
         * Required for ARCHIVE rules. Release archived file data from files that have not been
         * accessed for this many days. This value must be greater than {@code
         * archiveAfterDaysSinceLastAccess}. Must not be specified for SKIP rules.
         *
         * @param releaseAfterDaysSinceLastAccess the value to set
         * @return this builder
         */
        public Builder releaseAfterDaysSinceLastAccess(Integer releaseAfterDaysSinceLastAccess) {
            this.releaseAfterDaysSinceLastAccess = releaseAfterDaysSinceLastAccess;
            this.__explicitlySet__.add("releaseAfterDaysSinceLastAccess");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TieringPolicyRule build() {
            TieringPolicyRule model =
                    new TieringPolicyRule(
                            this.pathPrefixes,
                            this.action,
                            this.minSizeInBytes,
                            this.archiveAfterDaysSinceLastAccess,
                            this.releaseAfterDaysSinceLastAccess);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TieringPolicyRule model) {
            if (model.wasPropertyExplicitlySet("pathPrefixes")) {
                this.pathPrefixes(model.getPathPrefixes());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("minSizeInBytes")) {
                this.minSizeInBytes(model.getMinSizeInBytes());
            }
            if (model.wasPropertyExplicitlySet("archiveAfterDaysSinceLastAccess")) {
                this.archiveAfterDaysSinceLastAccess(model.getArchiveAfterDaysSinceLastAccess());
            }
            if (model.wasPropertyExplicitlySet("releaseAfterDaysSinceLastAccess")) {
                this.releaseAfterDaysSinceLastAccess(model.getReleaseAfterDaysSinceLastAccess());
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
     * One or more absolute path prefixes in the Lustre file system to which this rule applies. The
     * service preserves the order of path prefixes in responses. Each path prefix can contain up to
     * 4096 characters. Each rule must contain at least one path prefix, and a tiering policy can
     * contain up to 100 path prefixes total across all rules.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pathPrefixes")
    private final java.util.List<String> pathPrefixes;

    /**
     * One or more absolute path prefixes in the Lustre file system to which this rule applies. The
     * service preserves the order of path prefixes in responses. Each path prefix can contain up to
     * 4096 characters. Each rule must contain at least one path prefix, and a tiering policy can
     * contain up to 100 path prefixes total across all rules.
     *
     * @return the value
     */
    public java.util.List<String> getPathPrefixes() {
        return pathPrefixes;
    }

    /**
     * The action to apply to files whose paths match this rule. {@code ARCHIVE} makes matching
     * files eligible to be archived to Object Storage. {@code SKIP} excludes matching files from
     * being archived.
     */
    public enum Action implements com.oracle.bmc.http.internal.BmcEnum {
        Archive("ARCHIVE"),
        Skip("SKIP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Action.class);

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Action(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Action create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Action', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The action to apply to files whose paths match this rule. {@code ARCHIVE} makes matching
     * files eligible to be archived to Object Storage. {@code SKIP} excludes matching files from
     * being archived.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * The action to apply to files whose paths match this rule. {@code ARCHIVE} makes matching
     * files eligible to be archived to Object Storage. {@code SKIP} excludes matching files from
     * being archived.
     *
     * @return the value
     */
    public Action getAction() {
        return action;
    }

    /**
     * Optional minimum file size in bytes for an ARCHIVE rule to apply. Must not be specified for
     * SKIP rules.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minSizeInBytes")
    private final Long minSizeInBytes;

    /**
     * Optional minimum file size in bytes for an ARCHIVE rule to apply. Must not be specified for
     * SKIP rules.
     *
     * @return the value
     */
    public Long getMinSizeInBytes() {
        return minSizeInBytes;
    }

    /**
     * Required for ARCHIVE rules. Archive files that have not been accessed for this many days.
     * Must not be specified for SKIP rules.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("archiveAfterDaysSinceLastAccess")
    private final Integer archiveAfterDaysSinceLastAccess;

    /**
     * Required for ARCHIVE rules. Archive files that have not been accessed for this many days.
     * Must not be specified for SKIP rules.
     *
     * @return the value
     */
    public Integer getArchiveAfterDaysSinceLastAccess() {
        return archiveAfterDaysSinceLastAccess;
    }

    /**
     * Required for ARCHIVE rules. Release archived file data from files that have not been accessed
     * for this many days. This value must be greater than {@code archiveAfterDaysSinceLastAccess}.
     * Must not be specified for SKIP rules.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("releaseAfterDaysSinceLastAccess")
    private final Integer releaseAfterDaysSinceLastAccess;

    /**
     * Required for ARCHIVE rules. Release archived file data from files that have not been accessed
     * for this many days. This value must be greater than {@code archiveAfterDaysSinceLastAccess}.
     * Must not be specified for SKIP rules.
     *
     * @return the value
     */
    public Integer getReleaseAfterDaysSinceLastAccess() {
        return releaseAfterDaysSinceLastAccess;
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
        sb.append("TieringPolicyRule(");
        sb.append("super=").append(super.toString());
        sb.append("pathPrefixes=").append(String.valueOf(this.pathPrefixes));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", minSizeInBytes=").append(String.valueOf(this.minSizeInBytes));
        sb.append(", archiveAfterDaysSinceLastAccess=")
                .append(String.valueOf(this.archiveAfterDaysSinceLastAccess));
        sb.append(", releaseAfterDaysSinceLastAccess=")
                .append(String.valueOf(this.releaseAfterDaysSinceLastAccess));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TieringPolicyRule)) {
            return false;
        }

        TieringPolicyRule other = (TieringPolicyRule) o;
        return java.util.Objects.equals(this.pathPrefixes, other.pathPrefixes)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.minSizeInBytes, other.minSizeInBytes)
                && java.util.Objects.equals(
                        this.archiveAfterDaysSinceLastAccess, other.archiveAfterDaysSinceLastAccess)
                && java.util.Objects.equals(
                        this.releaseAfterDaysSinceLastAccess, other.releaseAfterDaysSinceLastAccess)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.pathPrefixes == null ? 43 : this.pathPrefixes.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result =
                (result * PRIME)
                        + (this.minSizeInBytes == null ? 43 : this.minSizeInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.archiveAfterDaysSinceLastAccess == null
                                ? 43
                                : this.archiveAfterDaysSinceLastAccess.hashCode());
        result =
                (result * PRIME)
                        + (this.releaseAfterDaysSinceLastAccess == null
                                ? 43
                                : this.releaseAfterDaysSinceLastAccess.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
