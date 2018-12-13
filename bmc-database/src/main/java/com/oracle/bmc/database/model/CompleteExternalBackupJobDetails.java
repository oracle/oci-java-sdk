/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CompleteExternalBackupJobDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CompleteExternalBackupJobDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("tdeWalletPath")
        private String tdeWalletPath;

        public Builder tdeWalletPath(String tdeWalletPath) {
            this.tdeWalletPath = tdeWalletPath;
            this.__explicitlySet__.add("tdeWalletPath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cfBackupHandle")
        private String cfBackupHandle;

        public Builder cfBackupHandle(String cfBackupHandle) {
            this.cfBackupHandle = cfBackupHandle;
            this.__explicitlySet__.add("cfBackupHandle");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("spfBackupHandle")
        private String spfBackupHandle;

        public Builder spfBackupHandle(String spfBackupHandle) {
            this.spfBackupHandle = spfBackupHandle;
            this.__explicitlySet__.add("spfBackupHandle");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sqlPatches")
        private java.util.List<String> sqlPatches;

        public Builder sqlPatches(java.util.List<String> sqlPatches) {
            this.sqlPatches = sqlPatches;
            this.__explicitlySet__.add("sqlPatches");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataSize")
        private Long dataSize;

        public Builder dataSize(Long dataSize) {
            this.dataSize = dataSize;
            this.__explicitlySet__.add("dataSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("redoSize")
        private Long redoSize;

        public Builder redoSize(Long redoSize) {
            this.redoSize = redoSize;
            this.__explicitlySet__.add("redoSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CompleteExternalBackupJobDetails build() {
            CompleteExternalBackupJobDetails __instance__ =
                    new CompleteExternalBackupJobDetails(
                            tdeWalletPath,
                            cfBackupHandle,
                            spfBackupHandle,
                            sqlPatches,
                            dataSize,
                            redoSize);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CompleteExternalBackupJobDetails o) {
            Builder copiedBuilder =
                    tdeWalletPath(o.getTdeWalletPath())
                            .cfBackupHandle(o.getCfBackupHandle())
                            .spfBackupHandle(o.getSpfBackupHandle())
                            .sqlPatches(o.getSqlPatches())
                            .dataSize(o.getDataSize())
                            .redoSize(o.getRedoSize());

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
     * If the database being backed up is TDE enabled, this will be the path to the associated TDE wallet in Object Storage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tdeWalletPath")
    String tdeWalletPath;

    /**
     * The handle of the control file backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cfBackupHandle")
    String cfBackupHandle;

    /**
     * The handle of the spfile backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("spfBackupHandle")
    String spfBackupHandle;

    /**
     * The list of SQL patches that need to be applied to the backup during the restore.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlPatches")
    java.util.List<String> sqlPatches;

    /**
     * The size of the data in the database, in megabytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataSize")
    Long dataSize;

    /**
     * The size of the redo in the database, in megabytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("redoSize")
    Long redoSize;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
