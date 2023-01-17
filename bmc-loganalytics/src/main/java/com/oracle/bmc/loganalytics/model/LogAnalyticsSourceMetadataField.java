/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsSourceMetadataField
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsSourceMetadataField.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsSourceMetadataField
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"fieldName", "isEnabled", "isSystem", "key", "sourceName"})
    public LogAnalyticsSourceMetadataField(
            String fieldName, Boolean isEnabled, Boolean isSystem, String key, String sourceName) {
        super();
        this.fieldName = fieldName;
        this.isEnabled = isEnabled;
        this.isSystem = isSystem;
        this.key = key;
        this.sourceName = sourceName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The field internal name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
        private String fieldName;

        /**
         * The field internal name.
         * @param fieldName the value to set
         * @return this builder
         **/
        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            this.__explicitlySet__.add("fieldName");
            return this;
        }
        /**
         * A flag inidcating whether or not the source metadata field is enabled.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * A flag inidcating whether or not the source metadata field is enabled.
         *
         * @param isEnabled the value to set
         * @return this builder
         **/
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * The system flag.  A value of false denotes a custom, or user
         * defined object.  A value of true denotes a built in object.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
        private Boolean isSystem;

        /**
         * The system flag.  A value of false denotes a custom, or user
         * defined object.  A value of true denotes a built in object.
         *
         * @param isSystem the value to set
         * @return this builder
         **/
        public Builder isSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            this.__explicitlySet__.add("isSystem");
            return this;
        }
        /**
         * The key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The key.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The source internal name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
        private String sourceName;

        /**
         * The source internal name.
         * @param sourceName the value to set
         * @return this builder
         **/
        public Builder sourceName(String sourceName) {
            this.sourceName = sourceName;
            this.__explicitlySet__.add("sourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsSourceMetadataField build() {
            LogAnalyticsSourceMetadataField model =
                    new LogAnalyticsSourceMetadataField(
                            this.fieldName,
                            this.isEnabled,
                            this.isSystem,
                            this.key,
                            this.sourceName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsSourceMetadataField model) {
            if (model.wasPropertyExplicitlySet("fieldName")) {
                this.fieldName(model.getFieldName());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("isSystem")) {
                this.isSystem(model.getIsSystem());
            }
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("sourceName")) {
                this.sourceName(model.getSourceName());
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
     * The field internal name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    private final String fieldName;

    /**
     * The field internal name.
     * @return the value
     **/
    public String getFieldName() {
        return fieldName;
    }

    /**
     * A flag inidcating whether or not the source metadata field is enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * A flag inidcating whether or not the source metadata field is enabled.
     *
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * The system flag.  A value of false denotes a custom, or user
     * defined object.  A value of true denotes a built in object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    private final Boolean isSystem;

    /**
     * The system flag.  A value of false denotes a custom, or user
     * defined object.  A value of true denotes a built in object.
     *
     * @return the value
     **/
    public Boolean getIsSystem() {
        return isSystem;
    }

    /**
     * The key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The key.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The source internal name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
    private final String sourceName;

    /**
     * The source internal name.
     * @return the value
     **/
    public String getSourceName() {
        return sourceName;
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
        sb.append("LogAnalyticsSourceMetadataField(");
        sb.append("super=").append(super.toString());
        sb.append("fieldName=").append(String.valueOf(this.fieldName));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", isSystem=").append(String.valueOf(this.isSystem));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", sourceName=").append(String.valueOf(this.sourceName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsSourceMetadataField)) {
            return false;
        }

        LogAnalyticsSourceMetadataField other = (LogAnalyticsSourceMetadataField) o;
        return java.util.Objects.equals(this.fieldName, other.fieldName)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.isSystem, other.isSystem)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.sourceName, other.sourceName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fieldName == null ? 43 : this.fieldName.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.isSystem == null ? 43 : this.isSystem.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.sourceName == null ? 43 : this.sourceName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
