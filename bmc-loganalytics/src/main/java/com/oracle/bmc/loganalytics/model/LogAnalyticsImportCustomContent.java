/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsImportCustomContent
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
    builder = LogAnalyticsImportCustomContent.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsImportCustomContent {
    @Deprecated
    @java.beans.ConstructorProperties({
        "parserNames",
        "sourceNames",
        "fieldNames",
        "changeList",
        "contentName"
    })
    public LogAnalyticsImportCustomContent(
            java.util.List<String> parserNames,
            java.util.List<String> sourceNames,
            java.util.List<String> fieldNames,
            LogAnalyticsImportCustomChangeList changeList,
            String contentName) {
        super();
        this.parserNames = parserNames;
        this.sourceNames = sourceNames;
        this.fieldNames = fieldNames;
        this.changeList = changeList;
        this.contentName = contentName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("parserNames")
        private java.util.List<String> parserNames;

        public Builder parserNames(java.util.List<String> parserNames) {
            this.parserNames = parserNames;
            this.__explicitlySet__.add("parserNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceNames")
        private java.util.List<String> sourceNames;

        public Builder sourceNames(java.util.List<String> sourceNames) {
            this.sourceNames = sourceNames;
            this.__explicitlySet__.add("sourceNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fieldNames")
        private java.util.List<String> fieldNames;

        public Builder fieldNames(java.util.List<String> fieldNames) {
            this.fieldNames = fieldNames;
            this.__explicitlySet__.add("fieldNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("changeList")
        private LogAnalyticsImportCustomChangeList changeList;

        public Builder changeList(LogAnalyticsImportCustomChangeList changeList) {
            this.changeList = changeList;
            this.__explicitlySet__.add("changeList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contentName")
        private String contentName;

        public Builder contentName(String contentName) {
            this.contentName = contentName;
            this.__explicitlySet__.add("contentName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsImportCustomContent build() {
            LogAnalyticsImportCustomContent __instance__ =
                    new LogAnalyticsImportCustomContent(
                            parserNames, sourceNames, fieldNames, changeList, contentName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsImportCustomContent o) {
            Builder copiedBuilder =
                    parserNames(o.getParserNames())
                            .sourceNames(o.getSourceNames())
                            .fieldNames(o.getFieldNames())
                            .changeList(o.getChangeList())
                            .contentName(o.getContentName());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The parser names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserNames")
    private final java.util.List<String> parserNames;

    public java.util.List<String> getParserNames() {
        return parserNames;
    }

    /**
     * The source names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceNames")
    private final java.util.List<String> sourceNames;

    public java.util.List<String> getSourceNames() {
        return sourceNames;
    }

    /**
     * The field names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldNames")
    private final java.util.List<String> fieldNames;

    public java.util.List<String> getFieldNames() {
        return fieldNames;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("changeList")
    private final LogAnalyticsImportCustomChangeList changeList;

    public LogAnalyticsImportCustomChangeList getChangeList() {
        return changeList;
    }

    /**
     * The content name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contentName")
    private final String contentName;

    public String getContentName() {
        return contentName;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LogAnalyticsImportCustomContent(");
        sb.append("parserNames=").append(String.valueOf(this.parserNames));
        sb.append(", sourceNames=").append(String.valueOf(this.sourceNames));
        sb.append(", fieldNames=").append(String.valueOf(this.fieldNames));
        sb.append(", changeList=").append(String.valueOf(this.changeList));
        sb.append(", contentName=").append(String.valueOf(this.contentName));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsImportCustomContent)) {
            return false;
        }

        LogAnalyticsImportCustomContent other = (LogAnalyticsImportCustomContent) o;
        return java.util.Objects.equals(this.parserNames, other.parserNames)
                && java.util.Objects.equals(this.sourceNames, other.sourceNames)
                && java.util.Objects.equals(this.fieldNames, other.fieldNames)
                && java.util.Objects.equals(this.changeList, other.changeList)
                && java.util.Objects.equals(this.contentName, other.contentName)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.parserNames == null ? 43 : this.parserNames.hashCode());
        result = (result * PRIME) + (this.sourceNames == null ? 43 : this.sourceNames.hashCode());
        result = (result * PRIME) + (this.fieldNames == null ? 43 : this.fieldNames.hashCode());
        result = (result * PRIME) + (this.changeList == null ? 43 : this.changeList.hashCode());
        result = (result * PRIME) + (this.contentName == null ? 43 : this.contentName.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
