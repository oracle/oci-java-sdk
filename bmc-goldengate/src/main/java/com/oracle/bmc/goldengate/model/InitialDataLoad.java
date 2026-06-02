/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Options required for the pipeline Initial Data Load. If enabled, copies existing data from source to target before replication.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = InitialDataLoad.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InitialDataLoad extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isInitialLoad",
        "actionOnExistingTable",
        "initialLoadType",
        "adbWalletPath",
        "sourceWalletPath",
        "targetWalletPath",
        "namespaceName",
        "bucketName"
    })
    public InitialDataLoad(
            IsInitialLoad isInitialLoad,
            InitialLoadAction actionOnExistingTable,
            InitialLoadType initialLoadType,
            String adbWalletPath,
            String sourceWalletPath,
            String targetWalletPath,
            String namespaceName,
            String bucketName) {
        super();
        this.isInitialLoad = isInitialLoad;
        this.actionOnExistingTable = actionOnExistingTable;
        this.initialLoadType = initialLoadType;
        this.adbWalletPath = adbWalletPath;
        this.sourceWalletPath = sourceWalletPath;
        this.targetWalletPath = targetWalletPath;
        this.namespaceName = namespaceName;
        this.bucketName = bucketName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * If ENABLED, then existing source data is also synchronized to the target when creating or updating the pipeline.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isInitialLoad")
        private IsInitialLoad isInitialLoad;

        /**
         * If ENABLED, then existing source data is also synchronized to the target when creating or updating the pipeline.
         *
         * @param isInitialLoad the value to set
         * @return this builder
         **/
        public Builder isInitialLoad(IsInitialLoad isInitialLoad) {
            this.isInitialLoad = isInitialLoad;
            this.__explicitlySet__.add("isInitialLoad");
            return this;
        }
        /**
         * Action upon existing tables in target when initial Data Load is set i.e., isInitialLoad=true.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("actionOnExistingTable")
        private InitialLoadAction actionOnExistingTable;

        /**
         * Action upon existing tables in target when initial Data Load is set i.e., isInitialLoad=true.
         *
         * @param actionOnExistingTable the value to set
         * @return this builder
         **/
        public Builder actionOnExistingTable(InitialLoadAction actionOnExistingTable) {
            this.actionOnExistingTable = actionOnExistingTable;
            this.__explicitlySet__.add("actionOnExistingTable");
            return this;
        }
        /**
         * Type of Initial load, which can be objectStorage or dbLink.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("initialLoadType")
        private InitialLoadType initialLoadType;

        /**
         * Type of Initial load, which can be objectStorage or dbLink.
         *
         * @param initialLoadType the value to set
         * @return this builder
         **/
        public Builder initialLoadType(InitialLoadType initialLoadType) {
            this.initialLoadType = initialLoadType;
            this.__explicitlySet__.add("initialLoadType");
            return this;
        }
        /**
         * Directory path of ADB wallet locally available in Non-ADB target DB. Required for ADB to non-ADB DBLink type initial load only. If not provided the default wallet path "/u01/targetwallet" will be used.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("adbWalletPath")
        private String adbWalletPath;

        /**
         * Directory path of ADB wallet locally available in Non-ADB target DB. Required for ADB to non-ADB DBLink type initial load only. If not provided the default wallet path "/u01/targetwallet" will be used.
         *
         * @param adbWalletPath the value to set
         * @return this builder
         **/
        public Builder adbWalletPath(String adbWalletPath) {
            this.adbWalletPath = adbWalletPath;
            this.__explicitlySet__.add("adbWalletPath");
            return this;
        }
        /**
         * Directory path of ObjectStorage wallet locally available in Non-ADB source DB. Required for Object Storage type initial load only if source DB is Non-ADB type.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceWalletPath")
        private String sourceWalletPath;

        /**
         * Directory path of ObjectStorage wallet locally available in Non-ADB source DB. Required for Object Storage type initial load only if source DB is Non-ADB type.
         *
         * @param sourceWalletPath the value to set
         * @return this builder
         **/
        public Builder sourceWalletPath(String sourceWalletPath) {
            this.sourceWalletPath = sourceWalletPath;
            this.__explicitlySet__.add("sourceWalletPath");
            return this;
        }
        /**
         * Directory path of ObjectStorage wallet locally available in Non-ADB target DB. Required for Object Storage type initial load only if target DB is Non-ADB type.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetWalletPath")
        private String targetWalletPath;

        /**
         * Directory path of ObjectStorage wallet locally available in Non-ADB target DB. Required for Object Storage type initial load only if target DB is Non-ADB type.
         *
         * @param targetWalletPath the value to set
         * @return this builder
         **/
        public Builder targetWalletPath(String targetWalletPath) {
            this.targetWalletPath = targetWalletPath;
            this.__explicitlySet__.add("targetWalletPath");
            return this;
        }
        /**
         * Namespace that serves as a container of the ObjectStorage bucket. Required only for Objectstorage Initial load.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
        private String namespaceName;

        /**
         * Namespace that serves as a container of the ObjectStorage bucket. Required only for Objectstorage Initial load.
         *
         * @param namespaceName the value to set
         * @return this builder
         **/
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            this.__explicitlySet__.add("namespaceName");
            return this;
        }
        /**
         * Name of the ObjectStorage bucket. Required only for Objectstorage Initial load.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * Name of the ObjectStorage bucket. Required only for Objectstorage Initial load.
         *
         * @param bucketName the value to set
         * @return this builder
         **/
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InitialDataLoad build() {
            InitialDataLoad model =
                    new InitialDataLoad(
                            this.isInitialLoad,
                            this.actionOnExistingTable,
                            this.initialLoadType,
                            this.adbWalletPath,
                            this.sourceWalletPath,
                            this.targetWalletPath,
                            this.namespaceName,
                            this.bucketName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InitialDataLoad model) {
            if (model.wasPropertyExplicitlySet("isInitialLoad")) {
                this.isInitialLoad(model.getIsInitialLoad());
            }
            if (model.wasPropertyExplicitlySet("actionOnExistingTable")) {
                this.actionOnExistingTable(model.getActionOnExistingTable());
            }
            if (model.wasPropertyExplicitlySet("initialLoadType")) {
                this.initialLoadType(model.getInitialLoadType());
            }
            if (model.wasPropertyExplicitlySet("adbWalletPath")) {
                this.adbWalletPath(model.getAdbWalletPath());
            }
            if (model.wasPropertyExplicitlySet("sourceWalletPath")) {
                this.sourceWalletPath(model.getSourceWalletPath());
            }
            if (model.wasPropertyExplicitlySet("targetWalletPath")) {
                this.targetWalletPath(model.getTargetWalletPath());
            }
            if (model.wasPropertyExplicitlySet("namespaceName")) {
                this.namespaceName(model.getNamespaceName());
            }
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
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
     * If ENABLED, then existing source data is also synchronized to the target when creating or updating the pipeline.
     *
     **/
    public enum IsInitialLoad {
        Enabled("ENABLED"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(IsInitialLoad.class);

        private final String value;
        private static java.util.Map<String, IsInitialLoad> map;

        static {
            map = new java.util.HashMap<>();
            for (IsInitialLoad v : IsInitialLoad.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IsInitialLoad(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IsInitialLoad create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IsInitialLoad', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * If ENABLED, then existing source data is also synchronized to the target when creating or updating the pipeline.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isInitialLoad")
    private final IsInitialLoad isInitialLoad;

    /**
     * If ENABLED, then existing source data is also synchronized to the target when creating or updating the pipeline.
     *
     * @return the value
     **/
    public IsInitialLoad getIsInitialLoad() {
        return isInitialLoad;
    }

    /**
     * Action upon existing tables in target when initial Data Load is set i.e., isInitialLoad=true.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionOnExistingTable")
    private final InitialLoadAction actionOnExistingTable;

    /**
     * Action upon existing tables in target when initial Data Load is set i.e., isInitialLoad=true.
     *
     * @return the value
     **/
    public InitialLoadAction getActionOnExistingTable() {
        return actionOnExistingTable;
    }

    /**
     * Type of Initial load, which can be objectStorage or dbLink.
     *
     **/
    public enum InitialLoadType {
        DbLink("DB_LINK"),
        ObjectStorage("OBJECT_STORAGE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(InitialLoadType.class);

        private final String value;
        private static java.util.Map<String, InitialLoadType> map;

        static {
            map = new java.util.HashMap<>();
            for (InitialLoadType v : InitialLoadType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        InitialLoadType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static InitialLoadType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'InitialLoadType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of Initial load, which can be objectStorage or dbLink.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("initialLoadType")
    private final InitialLoadType initialLoadType;

    /**
     * Type of Initial load, which can be objectStorage or dbLink.
     *
     * @return the value
     **/
    public InitialLoadType getInitialLoadType() {
        return initialLoadType;
    }

    /**
     * Directory path of ADB wallet locally available in Non-ADB target DB. Required for ADB to non-ADB DBLink type initial load only. If not provided the default wallet path "/u01/targetwallet" will be used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adbWalletPath")
    private final String adbWalletPath;

    /**
     * Directory path of ADB wallet locally available in Non-ADB target DB. Required for ADB to non-ADB DBLink type initial load only. If not provided the default wallet path "/u01/targetwallet" will be used.
     *
     * @return the value
     **/
    public String getAdbWalletPath() {
        return adbWalletPath;
    }

    /**
     * Directory path of ObjectStorage wallet locally available in Non-ADB source DB. Required for Object Storage type initial load only if source DB is Non-ADB type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceWalletPath")
    private final String sourceWalletPath;

    /**
     * Directory path of ObjectStorage wallet locally available in Non-ADB source DB. Required for Object Storage type initial load only if source DB is Non-ADB type.
     *
     * @return the value
     **/
    public String getSourceWalletPath() {
        return sourceWalletPath;
    }

    /**
     * Directory path of ObjectStorage wallet locally available in Non-ADB target DB. Required for Object Storage type initial load only if target DB is Non-ADB type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetWalletPath")
    private final String targetWalletPath;

    /**
     * Directory path of ObjectStorage wallet locally available in Non-ADB target DB. Required for Object Storage type initial load only if target DB is Non-ADB type.
     *
     * @return the value
     **/
    public String getTargetWalletPath() {
        return targetWalletPath;
    }

    /**
     * Namespace that serves as a container of the ObjectStorage bucket. Required only for Objectstorage Initial load.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
    private final String namespaceName;

    /**
     * Namespace that serves as a container of the ObjectStorage bucket. Required only for Objectstorage Initial load.
     *
     * @return the value
     **/
    public String getNamespaceName() {
        return namespaceName;
    }

    /**
     * Name of the ObjectStorage bucket. Required only for Objectstorage Initial load.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * Name of the ObjectStorage bucket. Required only for Objectstorage Initial load.
     *
     * @return the value
     **/
    public String getBucketName() {
        return bucketName;
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
        sb.append("InitialDataLoad(");
        sb.append("super=").append(super.toString());
        sb.append("isInitialLoad=").append(String.valueOf(this.isInitialLoad));
        sb.append(", actionOnExistingTable=").append(String.valueOf(this.actionOnExistingTable));
        sb.append(", initialLoadType=").append(String.valueOf(this.initialLoadType));
        sb.append(", adbWalletPath=").append(String.valueOf(this.adbWalletPath));
        sb.append(", sourceWalletPath=").append(String.valueOf(this.sourceWalletPath));
        sb.append(", targetWalletPath=").append(String.valueOf(this.targetWalletPath));
        sb.append(", namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InitialDataLoad)) {
            return false;
        }

        InitialDataLoad other = (InitialDataLoad) o;
        return java.util.Objects.equals(this.isInitialLoad, other.isInitialLoad)
                && java.util.Objects.equals(this.actionOnExistingTable, other.actionOnExistingTable)
                && java.util.Objects.equals(this.initialLoadType, other.initialLoadType)
                && java.util.Objects.equals(this.adbWalletPath, other.adbWalletPath)
                && java.util.Objects.equals(this.sourceWalletPath, other.sourceWalletPath)
                && java.util.Objects.equals(this.targetWalletPath, other.targetWalletPath)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isInitialLoad == null ? 43 : this.isInitialLoad.hashCode());
        result =
                (result * PRIME)
                        + (this.actionOnExistingTable == null
                                ? 43
                                : this.actionOnExistingTable.hashCode());
        result =
                (result * PRIME)
                        + (this.initialLoadType == null ? 43 : this.initialLoadType.hashCode());
        result =
                (result * PRIME)
                        + (this.adbWalletPath == null ? 43 : this.adbWalletPath.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceWalletPath == null ? 43 : this.sourceWalletPath.hashCode());
        result =
                (result * PRIME)
                        + (this.targetWalletPath == null ? 43 : this.targetWalletPath.hashCode());
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
