/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * The Deletion policy for the DB System.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DeletionPolicyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DeletionPolicyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("automaticBackupRetention")
        private AutomaticBackupRetention automaticBackupRetention;

        public Builder automaticBackupRetention(AutomaticBackupRetention automaticBackupRetention) {
            this.automaticBackupRetention = automaticBackupRetention;
            this.__explicitlySet__.add("automaticBackupRetention");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("finalBackup")
        private FinalBackup finalBackup;

        public Builder finalBackup(FinalBackup finalBackup) {
            this.finalBackup = finalBackup;
            this.__explicitlySet__.add("finalBackup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDeleteProtected")
        private Boolean isDeleteProtected;

        public Builder isDeleteProtected(Boolean isDeleteProtected) {
            this.isDeleteProtected = isDeleteProtected;
            this.__explicitlySet__.add("isDeleteProtected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeletionPolicyDetails build() {
            DeletionPolicyDetails __instance__ =
                    new DeletionPolicyDetails(
                            automaticBackupRetention, finalBackup, isDeleteProtected);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeletionPolicyDetails o) {
            Builder copiedBuilder =
                    automaticBackupRetention(o.getAutomaticBackupRetention())
                            .finalBackup(o.getFinalBackup())
                            .isDeleteProtected(o.getIsDeleteProtected());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Specifies if any automatic backups created for a DB System should be retained or deleted when the DB System is deleted.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum AutomaticBackupRetention {
        Delete("DELETE"),
        Retain("RETAIN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, AutomaticBackupRetention> map;

        static {
            map = new java.util.HashMap<>();
            for (AutomaticBackupRetention v : AutomaticBackupRetention.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AutomaticBackupRetention(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AutomaticBackupRetention create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AutomaticBackupRetention', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies if any automatic backups created for a DB System should be retained or deleted when the DB System is deleted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("automaticBackupRetention")
    AutomaticBackupRetention automaticBackupRetention;
    /**
     * Specifies whether or not a backup is taken when the DB System is deleted.
     *   REQUIRE_FINAL_BACKUP: a backup is taken if the DB System is deleted.
     *   SKIP_FINAL_BACKUP: a backup is not taken if the DB System is deleted.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum FinalBackup {
        SkipFinalBackup("SKIP_FINAL_BACKUP"),
        RequireFinalBackup("REQUIRE_FINAL_BACKUP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, FinalBackup> map;

        static {
            map = new java.util.HashMap<>();
            for (FinalBackup v : FinalBackup.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FinalBackup(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FinalBackup create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FinalBackup', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies whether or not a backup is taken when the DB System is deleted.
     *   REQUIRE_FINAL_BACKUP: a backup is taken if the DB System is deleted.
     *   SKIP_FINAL_BACKUP: a backup is not taken if the DB System is deleted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("finalBackup")
    FinalBackup finalBackup;

    /**
     * Specifies whether the DB System can be deleted. Set to true to prevent deletion, false (default) to allow.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDeleteProtected")
    Boolean isDeleteProtected;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
