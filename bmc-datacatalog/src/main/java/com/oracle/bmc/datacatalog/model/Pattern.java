/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * A pattern is a data selector or filter which can provide a singular,
 * logical entity view aggregating multiple physical data artifacts for ease of use.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Pattern.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Pattern extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "displayName",
        "description",
        "catalogId",
        "lifecycleState",
        "timeCreated",
        "timeUpdated",
        "createdById",
        "updatedById",
        "expression",
        "filePathPrefix",
        "checkFilePathList",
        "isEnableCheckFailureLimit",
        "checkFailureLimit",
        "properties"
    })
    public Pattern(
            String key,
            String displayName,
            String description,
            String catalogId,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String createdById,
            String updatedById,
            String expression,
            String filePathPrefix,
            java.util.List<String> checkFilePathList,
            Boolean isEnableCheckFailureLimit,
            Integer checkFailureLimit,
            java.util.Map<String, java.util.Map<String, String>> properties) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.catalogId = catalogId;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdById = createdById;
        this.updatedById = updatedById;
        this.expression = expression;
        this.filePathPrefix = filePathPrefix;
        this.checkFilePathList = checkFilePathList;
        this.isEnableCheckFailureLimit = isEnableCheckFailureLimit;
        this.checkFailureLimit = checkFailureLimit;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique pattern key that is immutable.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique pattern key that is immutable.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Detailed description of the pattern.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description of the pattern.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The data catalog's OCID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
        private String catalogId;

        /**
         * The data catalog's OCID.
         * @param catalogId the value to set
         * @return this builder
         **/
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            this.__explicitlySet__.add("catalogId");
            return this;
        }
        /**
         * The current state of the pattern.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the pattern.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The date and time the pattern was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2019-03-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the pattern was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2019-03-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The last time that any change was made to the pattern. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The last time that any change was made to the pattern. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * OCID of the user who created the pattern.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("createdById")
        private String createdById;

        /**
         * OCID of the user who created the pattern.
         * @param createdById the value to set
         * @return this builder
         **/
        public Builder createdById(String createdById) {
            this.createdById = createdById;
            this.__explicitlySet__.add("createdById");
            return this;
        }
        /**
         * OCID of the user who last modified the pattern.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
        private String updatedById;

        /**
         * OCID of the user who last modified the pattern.
         * @param updatedById the value to set
         * @return this builder
         **/
        public Builder updatedById(String updatedById) {
            this.updatedById = updatedById;
            this.__explicitlySet__.add("updatedById");
            return this;
        }
        /**
         * Input string which drives the selection process, allowing for fine-grained control using qualifiers.
         * Refer to the user documentation for details of the format and examples. A pattern cannot include both
         * a prefix and an expression.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("expression")
        private String expression;

        /**
         * Input string which drives the selection process, allowing for fine-grained control using qualifiers.
         * Refer to the user documentation for details of the format and examples. A pattern cannot include both
         * a prefix and an expression.
         *
         * @param expression the value to set
         * @return this builder
         **/
        public Builder expression(String expression) {
            this.expression = expression;
            this.__explicitlySet__.add("expression");
            return this;
        }
        /**
         * Input string which drives the selection process.
         * Refer to the user documentation for details of the format and examples. A pattern cannot include both
         * a prefix and an expression.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("filePathPrefix")
        private String filePathPrefix;

        /**
         * Input string which drives the selection process.
         * Refer to the user documentation for details of the format and examples. A pattern cannot include both
         * a prefix and an expression.
         *
         * @param filePathPrefix the value to set
         * @return this builder
         **/
        public Builder filePathPrefix(String filePathPrefix) {
            this.filePathPrefix = filePathPrefix;
            this.__explicitlySet__.add("filePathPrefix");
            return this;
        }
        /**
         * List of file paths against which the pattern can be tried, as a check. This documents, for reference
         * purposes, some example objects a pattern is meant to work with. If isEnableCheckFailureLimit is set to true,
         * this will be run as a validation during the request, such that if the check fails the request fails. If
         * isEnableCheckFailureLimit instead is set to (the default) false, a pattern will still be created or updated even
         * if the check fails, with a lifecycleState of FAILED.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("checkFilePathList")
        private java.util.List<String> checkFilePathList;

        /**
         * List of file paths against which the pattern can be tried, as a check. This documents, for reference
         * purposes, some example objects a pattern is meant to work with. If isEnableCheckFailureLimit is set to true,
         * this will be run as a validation during the request, such that if the check fails the request fails. If
         * isEnableCheckFailureLimit instead is set to (the default) false, a pattern will still be created or updated even
         * if the check fails, with a lifecycleState of FAILED.
         *
         * @param checkFilePathList the value to set
         * @return this builder
         **/
        public Builder checkFilePathList(java.util.List<String> checkFilePathList) {
            this.checkFilePathList = checkFilePathList;
            this.__explicitlySet__.add("checkFilePathList");
            return this;
        }
        /**
         * Indicates whether the pattern check, against the checkFilePathList, will fail the request if the count of
         * UNMATCHED files is above the checkFailureLimit.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnableCheckFailureLimit")
        private Boolean isEnableCheckFailureLimit;

        /**
         * Indicates whether the pattern check, against the checkFilePathList, will fail the request if the count of
         * UNMATCHED files is above the checkFailureLimit.
         *
         * @param isEnableCheckFailureLimit the value to set
         * @return this builder
         **/
        public Builder isEnableCheckFailureLimit(Boolean isEnableCheckFailureLimit) {
            this.isEnableCheckFailureLimit = isEnableCheckFailureLimit;
            this.__explicitlySet__.add("isEnableCheckFailureLimit");
            return this;
        }
        /**
         * The maximum number of UNMATCHED files, in checkFilePathList, above which the check fails. Optional, if
         * checkFilePathList is provided - but if isEnableCheckFailureLimit is set to true it is required.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("checkFailureLimit")
        private Integer checkFailureLimit;

        /**
         * The maximum number of UNMATCHED files, in checkFilePathList, above which the check fails. Optional, if
         * checkFilePathList is provided - but if isEnableCheckFailureLimit is set to true it is required.
         *
         * @param checkFailureLimit the value to set
         * @return this builder
         **/
        public Builder checkFailureLimit(Integer checkFailureLimit) {
            this.checkFailureLimit = checkFailureLimit;
            this.__explicitlySet__.add("checkFailureLimit");
            return this;
        }
        /**
         * A map of maps that contains the properties which are specific to the pattern type. Each pattern type
         * definition defines it's set of required and optional properties.
         * Example: {@code {"properties": { "default": { "tbd"}}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, java.util.Map<String, String>> properties;

        /**
         * A map of maps that contains the properties which are specific to the pattern type. Each pattern type
         * definition defines it's set of required and optional properties.
         * Example: {@code {"properties": { "default": { "tbd"}}}}
         *
         * @param properties the value to set
         * @return this builder
         **/
        public Builder properties(java.util.Map<String, java.util.Map<String, String>> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Pattern build() {
            Pattern model =
                    new Pattern(
                            this.key,
                            this.displayName,
                            this.description,
                            this.catalogId,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.createdById,
                            this.updatedById,
                            this.expression,
                            this.filePathPrefix,
                            this.checkFilePathList,
                            this.isEnableCheckFailureLimit,
                            this.checkFailureLimit,
                            this.properties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Pattern model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("catalogId")) {
                this.catalogId(model.getCatalogId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("createdById")) {
                this.createdById(model.getCreatedById());
            }
            if (model.wasPropertyExplicitlySet("updatedById")) {
                this.updatedById(model.getUpdatedById());
            }
            if (model.wasPropertyExplicitlySet("expression")) {
                this.expression(model.getExpression());
            }
            if (model.wasPropertyExplicitlySet("filePathPrefix")) {
                this.filePathPrefix(model.getFilePathPrefix());
            }
            if (model.wasPropertyExplicitlySet("checkFilePathList")) {
                this.checkFilePathList(model.getCheckFilePathList());
            }
            if (model.wasPropertyExplicitlySet("isEnableCheckFailureLimit")) {
                this.isEnableCheckFailureLimit(model.getIsEnableCheckFailureLimit());
            }
            if (model.wasPropertyExplicitlySet("checkFailureLimit")) {
                this.checkFailureLimit(model.getCheckFailureLimit());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
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
     * Unique pattern key that is immutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique pattern key that is immutable.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Detailed description of the pattern.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description of the pattern.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The data catalog's OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
    private final String catalogId;

    /**
     * The data catalog's OCID.
     * @return the value
     **/
    public String getCatalogId() {
        return catalogId;
    }

    /**
     * The current state of the pattern.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the pattern.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the pattern was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the pattern was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The last time that any change was made to the pattern. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The last time that any change was made to the pattern. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * OCID of the user who created the pattern.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdById")
    private final String createdById;

    /**
     * OCID of the user who created the pattern.
     * @return the value
     **/
    public String getCreatedById() {
        return createdById;
    }

    /**
     * OCID of the user who last modified the pattern.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
    private final String updatedById;

    /**
     * OCID of the user who last modified the pattern.
     * @return the value
     **/
    public String getUpdatedById() {
        return updatedById;
    }

    /**
     * Input string which drives the selection process, allowing for fine-grained control using qualifiers.
     * Refer to the user documentation for details of the format and examples. A pattern cannot include both
     * a prefix and an expression.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    private final String expression;

    /**
     * Input string which drives the selection process, allowing for fine-grained control using qualifiers.
     * Refer to the user documentation for details of the format and examples. A pattern cannot include both
     * a prefix and an expression.
     *
     * @return the value
     **/
    public String getExpression() {
        return expression;
    }

    /**
     * Input string which drives the selection process.
     * Refer to the user documentation for details of the format and examples. A pattern cannot include both
     * a prefix and an expression.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filePathPrefix")
    private final String filePathPrefix;

    /**
     * Input string which drives the selection process.
     * Refer to the user documentation for details of the format and examples. A pattern cannot include both
     * a prefix and an expression.
     *
     * @return the value
     **/
    public String getFilePathPrefix() {
        return filePathPrefix;
    }

    /**
     * List of file paths against which the pattern can be tried, as a check. This documents, for reference
     * purposes, some example objects a pattern is meant to work with. If isEnableCheckFailureLimit is set to true,
     * this will be run as a validation during the request, such that if the check fails the request fails. If
     * isEnableCheckFailureLimit instead is set to (the default) false, a pattern will still be created or updated even
     * if the check fails, with a lifecycleState of FAILED.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("checkFilePathList")
    private final java.util.List<String> checkFilePathList;

    /**
     * List of file paths against which the pattern can be tried, as a check. This documents, for reference
     * purposes, some example objects a pattern is meant to work with. If isEnableCheckFailureLimit is set to true,
     * this will be run as a validation during the request, such that if the check fails the request fails. If
     * isEnableCheckFailureLimit instead is set to (the default) false, a pattern will still be created or updated even
     * if the check fails, with a lifecycleState of FAILED.
     *
     * @return the value
     **/
    public java.util.List<String> getCheckFilePathList() {
        return checkFilePathList;
    }

    /**
     * Indicates whether the pattern check, against the checkFilePathList, will fail the request if the count of
     * UNMATCHED files is above the checkFailureLimit.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnableCheckFailureLimit")
    private final Boolean isEnableCheckFailureLimit;

    /**
     * Indicates whether the pattern check, against the checkFilePathList, will fail the request if the count of
     * UNMATCHED files is above the checkFailureLimit.
     *
     * @return the value
     **/
    public Boolean getIsEnableCheckFailureLimit() {
        return isEnableCheckFailureLimit;
    }

    /**
     * The maximum number of UNMATCHED files, in checkFilePathList, above which the check fails. Optional, if
     * checkFilePathList is provided - but if isEnableCheckFailureLimit is set to true it is required.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("checkFailureLimit")
    private final Integer checkFailureLimit;

    /**
     * The maximum number of UNMATCHED files, in checkFilePathList, above which the check fails. Optional, if
     * checkFilePathList is provided - but if isEnableCheckFailureLimit is set to true it is required.
     *
     * @return the value
     **/
    public Integer getCheckFailureLimit() {
        return checkFailureLimit;
    }

    /**
     * A map of maps that contains the properties which are specific to the pattern type. Each pattern type
     * definition defines it's set of required and optional properties.
     * Example: {@code {"properties": { "default": { "tbd"}}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, java.util.Map<String, String>> properties;

    /**
     * A map of maps that contains the properties which are specific to the pattern type. Each pattern type
     * definition defines it's set of required and optional properties.
     * Example: {@code {"properties": { "default": { "tbd"}}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, String>> getProperties() {
        return properties;
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
        sb.append("Pattern(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", catalogId=").append(String.valueOf(this.catalogId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdById=").append(String.valueOf(this.createdById));
        sb.append(", updatedById=").append(String.valueOf(this.updatedById));
        sb.append(", expression=").append(String.valueOf(this.expression));
        sb.append(", filePathPrefix=").append(String.valueOf(this.filePathPrefix));
        sb.append(", checkFilePathList=").append(String.valueOf(this.checkFilePathList));
        sb.append(", isEnableCheckFailureLimit=")
                .append(String.valueOf(this.isEnableCheckFailureLimit));
        sb.append(", checkFailureLimit=").append(String.valueOf(this.checkFailureLimit));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pattern)) {
            return false;
        }

        Pattern other = (Pattern) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.createdById, other.createdById)
                && java.util.Objects.equals(this.updatedById, other.updatedById)
                && java.util.Objects.equals(this.expression, other.expression)
                && java.util.Objects.equals(this.filePathPrefix, other.filePathPrefix)
                && java.util.Objects.equals(this.checkFilePathList, other.checkFilePathList)
                && java.util.Objects.equals(
                        this.isEnableCheckFailureLimit, other.isEnableCheckFailureLimit)
                && java.util.Objects.equals(this.checkFailureLimit, other.checkFailureLimit)
                && java.util.Objects.equals(this.properties, other.properties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdById == null ? 43 : this.createdById.hashCode());
        result = (result * PRIME) + (this.updatedById == null ? 43 : this.updatedById.hashCode());
        result = (result * PRIME) + (this.expression == null ? 43 : this.expression.hashCode());
        result =
                (result * PRIME)
                        + (this.filePathPrefix == null ? 43 : this.filePathPrefix.hashCode());
        result =
                (result * PRIME)
                        + (this.checkFilePathList == null ? 43 : this.checkFilePathList.hashCode());
        result =
                (result * PRIME)
                        + (this.isEnableCheckFailureLimit == null
                                ? 43
                                : this.isEnableCheckFailureLimit.hashCode());
        result =
                (result * PRIME)
                        + (this.checkFailureLimit == null ? 43 : this.checkFailureLimit.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
