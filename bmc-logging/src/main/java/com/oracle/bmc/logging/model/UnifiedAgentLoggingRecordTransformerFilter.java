/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Logging record transformer filter object mutates/transforms logs.
 * Ref: https://docs.fluentd.org/filter/record_transformer
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UnifiedAgentLoggingRecordTransformerFilter.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "filterType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UnifiedAgentLoggingRecordTransformerFilter extends UnifiedAgentLoggingFilter {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Add new key-value pairs in logs
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recordList")
        private java.util.List<RecordTransformerPair> recordList;

        /**
         * Add new key-value pairs in logs
         * @param recordList the value to set
         * @return this builder
         **/
        public Builder recordList(java.util.List<RecordTransformerPair> recordList) {
            this.recordList = recordList;
            this.__explicitlySet__.add("recordList");
            return this;
        }
        /**
         * When set to true, the full Ruby syntax is enabled in the ${} expression.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRubyEnabled")
        private Boolean isRubyEnabled;

        /**
         * When set to true, the full Ruby syntax is enabled in the ${} expression.
         * @param isRubyEnabled the value to set
         * @return this builder
         **/
        public Builder isRubyEnabled(Boolean isRubyEnabled) {
            this.isRubyEnabled = isRubyEnabled;
            this.__explicitlySet__.add("isRubyEnabled");
            return this;
        }
        /**
         * If true, automatically casts the field types.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoTypecastEnabled")
        private Boolean isAutoTypecastEnabled;

        /**
         * If true, automatically casts the field types.
         * @param isAutoTypecastEnabled the value to set
         * @return this builder
         **/
        public Builder isAutoTypecastEnabled(Boolean isAutoTypecastEnabled) {
            this.isAutoTypecastEnabled = isAutoTypecastEnabled;
            this.__explicitlySet__.add("isAutoTypecastEnabled");
            return this;
        }
        /**
         * If true, it modifies a new empty hash
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRenewRecordEnabled")
        private Boolean isRenewRecordEnabled;

        /**
         * If true, it modifies a new empty hash
         * @param isRenewRecordEnabled the value to set
         * @return this builder
         **/
        public Builder isRenewRecordEnabled(Boolean isRenewRecordEnabled) {
            this.isRenewRecordEnabled = isRenewRecordEnabled;
            this.__explicitlySet__.add("isRenewRecordEnabled");
            return this;
        }
        /**
         * Overwrites the time of logs with this value, this value must be a Unix timestamp.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("renewTimeKey")
        private String renewTimeKey;

        /**
         * Overwrites the time of logs with this value, this value must be a Unix timestamp.
         * @param renewTimeKey the value to set
         * @return this builder
         **/
        public Builder renewTimeKey(String renewTimeKey) {
            this.renewTimeKey = renewTimeKey;
            this.__explicitlySet__.add("renewTimeKey");
            return this;
        }
        /**
         * A list of keys to keep. Only relevant if isRenewRecordEnabled is set to true
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keepKeys")
        private java.util.List<String> keepKeys;

        /**
         * A list of keys to keep. Only relevant if isRenewRecordEnabled is set to true
         * @param keepKeys the value to set
         * @return this builder
         **/
        public Builder keepKeys(java.util.List<String> keepKeys) {
            this.keepKeys = keepKeys;
            this.__explicitlySet__.add("keepKeys");
            return this;
        }
        /**
         * A list of keys to delete
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("removeKeys")
        private java.util.List<String> removeKeys;

        /**
         * A list of keys to delete
         * @param removeKeys the value to set
         * @return this builder
         **/
        public Builder removeKeys(java.util.List<String> removeKeys) {
            this.removeKeys = removeKeys;
            this.__explicitlySet__.add("removeKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UnifiedAgentLoggingRecordTransformerFilter build() {
            UnifiedAgentLoggingRecordTransformerFilter model =
                    new UnifiedAgentLoggingRecordTransformerFilter(
                            this.name,
                            this.recordList,
                            this.isRubyEnabled,
                            this.isAutoTypecastEnabled,
                            this.isRenewRecordEnabled,
                            this.renewTimeKey,
                            this.keepKeys,
                            this.removeKeys);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UnifiedAgentLoggingRecordTransformerFilter model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("recordList")) {
                this.recordList(model.getRecordList());
            }
            if (model.wasPropertyExplicitlySet("isRubyEnabled")) {
                this.isRubyEnabled(model.getIsRubyEnabled());
            }
            if (model.wasPropertyExplicitlySet("isAutoTypecastEnabled")) {
                this.isAutoTypecastEnabled(model.getIsAutoTypecastEnabled());
            }
            if (model.wasPropertyExplicitlySet("isRenewRecordEnabled")) {
                this.isRenewRecordEnabled(model.getIsRenewRecordEnabled());
            }
            if (model.wasPropertyExplicitlySet("renewTimeKey")) {
                this.renewTimeKey(model.getRenewTimeKey());
            }
            if (model.wasPropertyExplicitlySet("keepKeys")) {
                this.keepKeys(model.getKeepKeys());
            }
            if (model.wasPropertyExplicitlySet("removeKeys")) {
                this.removeKeys(model.getRemoveKeys());
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

    @Deprecated
    public UnifiedAgentLoggingRecordTransformerFilter(
            String name,
            java.util.List<RecordTransformerPair> recordList,
            Boolean isRubyEnabled,
            Boolean isAutoTypecastEnabled,
            Boolean isRenewRecordEnabled,
            String renewTimeKey,
            java.util.List<String> keepKeys,
            java.util.List<String> removeKeys) {
        super(name);
        this.recordList = recordList;
        this.isRubyEnabled = isRubyEnabled;
        this.isAutoTypecastEnabled = isAutoTypecastEnabled;
        this.isRenewRecordEnabled = isRenewRecordEnabled;
        this.renewTimeKey = renewTimeKey;
        this.keepKeys = keepKeys;
        this.removeKeys = removeKeys;
    }

    /**
     * Add new key-value pairs in logs
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recordList")
    private final java.util.List<RecordTransformerPair> recordList;

    /**
     * Add new key-value pairs in logs
     * @return the value
     **/
    public java.util.List<RecordTransformerPair> getRecordList() {
        return recordList;
    }

    /**
     * When set to true, the full Ruby syntax is enabled in the ${} expression.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRubyEnabled")
    private final Boolean isRubyEnabled;

    /**
     * When set to true, the full Ruby syntax is enabled in the ${} expression.
     * @return the value
     **/
    public Boolean getIsRubyEnabled() {
        return isRubyEnabled;
    }

    /**
     * If true, automatically casts the field types.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoTypecastEnabled")
    private final Boolean isAutoTypecastEnabled;

    /**
     * If true, automatically casts the field types.
     * @return the value
     **/
    public Boolean getIsAutoTypecastEnabled() {
        return isAutoTypecastEnabled;
    }

    /**
     * If true, it modifies a new empty hash
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRenewRecordEnabled")
    private final Boolean isRenewRecordEnabled;

    /**
     * If true, it modifies a new empty hash
     * @return the value
     **/
    public Boolean getIsRenewRecordEnabled() {
        return isRenewRecordEnabled;
    }

    /**
     * Overwrites the time of logs with this value, this value must be a Unix timestamp.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("renewTimeKey")
    private final String renewTimeKey;

    /**
     * Overwrites the time of logs with this value, this value must be a Unix timestamp.
     * @return the value
     **/
    public String getRenewTimeKey() {
        return renewTimeKey;
    }

    /**
     * A list of keys to keep. Only relevant if isRenewRecordEnabled is set to true
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keepKeys")
    private final java.util.List<String> keepKeys;

    /**
     * A list of keys to keep. Only relevant if isRenewRecordEnabled is set to true
     * @return the value
     **/
    public java.util.List<String> getKeepKeys() {
        return keepKeys;
    }

    /**
     * A list of keys to delete
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("removeKeys")
    private final java.util.List<String> removeKeys;

    /**
     * A list of keys to delete
     * @return the value
     **/
    public java.util.List<String> getRemoveKeys() {
        return removeKeys;
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
        sb.append("UnifiedAgentLoggingRecordTransformerFilter(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", recordList=").append(String.valueOf(this.recordList));
        sb.append(", isRubyEnabled=").append(String.valueOf(this.isRubyEnabled));
        sb.append(", isAutoTypecastEnabled=").append(String.valueOf(this.isAutoTypecastEnabled));
        sb.append(", isRenewRecordEnabled=").append(String.valueOf(this.isRenewRecordEnabled));
        sb.append(", renewTimeKey=").append(String.valueOf(this.renewTimeKey));
        sb.append(", keepKeys=").append(String.valueOf(this.keepKeys));
        sb.append(", removeKeys=").append(String.valueOf(this.removeKeys));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UnifiedAgentLoggingRecordTransformerFilter)) {
            return false;
        }

        UnifiedAgentLoggingRecordTransformerFilter other =
                (UnifiedAgentLoggingRecordTransformerFilter) o;
        return java.util.Objects.equals(this.recordList, other.recordList)
                && java.util.Objects.equals(this.isRubyEnabled, other.isRubyEnabled)
                && java.util.Objects.equals(this.isAutoTypecastEnabled, other.isAutoTypecastEnabled)
                && java.util.Objects.equals(this.isRenewRecordEnabled, other.isRenewRecordEnabled)
                && java.util.Objects.equals(this.renewTimeKey, other.renewTimeKey)
                && java.util.Objects.equals(this.keepKeys, other.keepKeys)
                && java.util.Objects.equals(this.removeKeys, other.removeKeys)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.recordList == null ? 43 : this.recordList.hashCode());
        result =
                (result * PRIME)
                        + (this.isRubyEnabled == null ? 43 : this.isRubyEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoTypecastEnabled == null
                                ? 43
                                : this.isAutoTypecastEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isRenewRecordEnabled == null
                                ? 43
                                : this.isRenewRecordEnabled.hashCode());
        result = (result * PRIME) + (this.renewTimeKey == null ? 43 : this.renewTimeKey.hashCode());
        result = (result * PRIME) + (this.keepKeys == null ? 43 : this.keepKeys.hashCode());
        result = (result * PRIME) + (this.removeKeys == null ? 43 : this.removeKeys.hashCode());
        return result;
    }
}
