/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CompleteExternalBackupJobDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CompleteExternalBackupJobDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "tdeWalletPath",
        "cfBackupHandle",
        "spfBackupHandle",
        "sqlPatches",
        "dataSize",
        "redoSize"
    })
    public CompleteExternalBackupJobDetails(
            String tdeWalletPath,
            String cfBackupHandle,
            String spfBackupHandle,
            java.util.List<String> sqlPatches,
            Long dataSize,
            Long redoSize) {
        super();
        this.tdeWalletPath = tdeWalletPath;
        this.cfBackupHandle = cfBackupHandle;
        this.spfBackupHandle = spfBackupHandle;
        this.sqlPatches = sqlPatches;
        this.dataSize = dataSize;
        this.redoSize = redoSize;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * If the database being backed up is TDE enabled, this will be the path to the associated TDE wallet in Object Storage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tdeWalletPath")
        private String tdeWalletPath;

        /**
         * If the database being backed up is TDE enabled, this will be the path to the associated TDE wallet in Object Storage.
         * @param tdeWalletPath the value to set
         * @return this builder
         **/
        public Builder tdeWalletPath(String tdeWalletPath) {
            this.tdeWalletPath = tdeWalletPath;
            this.__explicitlySet__.add("tdeWalletPath");
            return this;
        }
        /**
         * The handle of the control file backup.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cfBackupHandle")
        private String cfBackupHandle;

        /**
         * The handle of the control file backup.
         * @param cfBackupHandle the value to set
         * @return this builder
         **/
        public Builder cfBackupHandle(String cfBackupHandle) {
            this.cfBackupHandle = cfBackupHandle;
            this.__explicitlySet__.add("cfBackupHandle");
            return this;
        }
        /**
         * The handle of the spfile backup.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("spfBackupHandle")
        private String spfBackupHandle;

        /**
         * The handle of the spfile backup.
         * @param spfBackupHandle the value to set
         * @return this builder
         **/
        public Builder spfBackupHandle(String spfBackupHandle) {
            this.spfBackupHandle = spfBackupHandle;
            this.__explicitlySet__.add("spfBackupHandle");
            return this;
        }
        /**
         * The list of SQL patches that need to be applied to the backup during the restore.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlPatches")
        private java.util.List<String> sqlPatches;

        /**
         * The list of SQL patches that need to be applied to the backup during the restore.
         * @param sqlPatches the value to set
         * @return this builder
         **/
        public Builder sqlPatches(java.util.List<String> sqlPatches) {
            this.sqlPatches = sqlPatches;
            this.__explicitlySet__.add("sqlPatches");
            return this;
        }
        /**
         * The size of the data in the database, in megabytes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataSize")
        private Long dataSize;

        /**
         * The size of the data in the database, in megabytes.
         * @param dataSize the value to set
         * @return this builder
         **/
        public Builder dataSize(Long dataSize) {
            this.dataSize = dataSize;
            this.__explicitlySet__.add("dataSize");
            return this;
        }
        /**
         * The size of the redo in the database, in megabytes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("redoSize")
        private Long redoSize;

        /**
         * The size of the redo in the database, in megabytes.
         * @param redoSize the value to set
         * @return this builder
         **/
        public Builder redoSize(Long redoSize) {
            this.redoSize = redoSize;
            this.__explicitlySet__.add("redoSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CompleteExternalBackupJobDetails build() {
            CompleteExternalBackupJobDetails model =
                    new CompleteExternalBackupJobDetails(
                            this.tdeWalletPath,
                            this.cfBackupHandle,
                            this.spfBackupHandle,
                            this.sqlPatches,
                            this.dataSize,
                            this.redoSize);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CompleteExternalBackupJobDetails model) {
            if (model.wasPropertyExplicitlySet("tdeWalletPath")) {
                this.tdeWalletPath(model.getTdeWalletPath());
            }
            if (model.wasPropertyExplicitlySet("cfBackupHandle")) {
                this.cfBackupHandle(model.getCfBackupHandle());
            }
            if (model.wasPropertyExplicitlySet("spfBackupHandle")) {
                this.spfBackupHandle(model.getSpfBackupHandle());
            }
            if (model.wasPropertyExplicitlySet("sqlPatches")) {
                this.sqlPatches(model.getSqlPatches());
            }
            if (model.wasPropertyExplicitlySet("dataSize")) {
                this.dataSize(model.getDataSize());
            }
            if (model.wasPropertyExplicitlySet("redoSize")) {
                this.redoSize(model.getRedoSize());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * If the database being backed up is TDE enabled, this will be the path to the associated TDE wallet in Object Storage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tdeWalletPath")
    private final String tdeWalletPath;

    /**
     * If the database being backed up is TDE enabled, this will be the path to the associated TDE wallet in Object Storage.
     * @return the value
     **/
    public String getTdeWalletPath() {
        return tdeWalletPath;
    }

    /**
     * The handle of the control file backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cfBackupHandle")
    private final String cfBackupHandle;

    /**
     * The handle of the control file backup.
     * @return the value
     **/
    public String getCfBackupHandle() {
        return cfBackupHandle;
    }

    /**
     * The handle of the spfile backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("spfBackupHandle")
    private final String spfBackupHandle;

    /**
     * The handle of the spfile backup.
     * @return the value
     **/
    public String getSpfBackupHandle() {
        return spfBackupHandle;
    }

    /**
     * The list of SQL patches that need to be applied to the backup during the restore.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlPatches")
    private final java.util.List<String> sqlPatches;

    /**
     * The list of SQL patches that need to be applied to the backup during the restore.
     * @return the value
     **/
    public java.util.List<String> getSqlPatches() {
        return sqlPatches;
    }

    /**
     * The size of the data in the database, in megabytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataSize")
    private final Long dataSize;

    /**
     * The size of the data in the database, in megabytes.
     * @return the value
     **/
    public Long getDataSize() {
        return dataSize;
    }

    /**
     * The size of the redo in the database, in megabytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("redoSize")
    private final Long redoSize;

    /**
     * The size of the redo in the database, in megabytes.
     * @return the value
     **/
    public Long getRedoSize() {
        return redoSize;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CompleteExternalBackupJobDetails(");
        sb.append("super=").append(super.toString());
        sb.append("tdeWalletPath=").append(String.valueOf(this.tdeWalletPath));
        sb.append(", cfBackupHandle=").append(String.valueOf(this.cfBackupHandle));
        sb.append(", spfBackupHandle=").append(String.valueOf(this.spfBackupHandle));
        sb.append(", sqlPatches=").append(String.valueOf(this.sqlPatches));
        sb.append(", dataSize=").append(String.valueOf(this.dataSize));
        sb.append(", redoSize=").append(String.valueOf(this.redoSize));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CompleteExternalBackupJobDetails)) {
            return false;
        }

        CompleteExternalBackupJobDetails other = (CompleteExternalBackupJobDetails) o;
        return java.util.Objects.equals(this.tdeWalletPath, other.tdeWalletPath)
                && java.util.Objects.equals(this.cfBackupHandle, other.cfBackupHandle)
                && java.util.Objects.equals(this.spfBackupHandle, other.spfBackupHandle)
                && java.util.Objects.equals(this.sqlPatches, other.sqlPatches)
                && java.util.Objects.equals(this.dataSize, other.dataSize)
                && java.util.Objects.equals(this.redoSize, other.redoSize)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.tdeWalletPath == null ? 43 : this.tdeWalletPath.hashCode());
        result =
                (result * PRIME)
                        + (this.cfBackupHandle == null ? 43 : this.cfBackupHandle.hashCode());
        result =
                (result * PRIME)
                        + (this.spfBackupHandle == null ? 43 : this.spfBackupHandle.hashCode());
        result = (result * PRIME) + (this.sqlPatches == null ? 43 : this.sqlPatches.hashCode());
        result = (result * PRIME) + (this.dataSize == null ? 43 : this.dataSize.hashCode());
        result = (result * PRIME) + (this.redoSize == null ? 43 : this.redoSize.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
