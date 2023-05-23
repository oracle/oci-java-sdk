/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * CRI parser. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UnifiedAgentCriParser.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "parserType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UnifiedAgentCriParser extends UnifiedAgentParser {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("fieldTimeKey")
        private String fieldTimeKey;

        public Builder fieldTimeKey(String fieldTimeKey) {
            this.fieldTimeKey = fieldTimeKey;
            this.__explicitlySet__.add("fieldTimeKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("types")
        private java.util.Map<String, String> types;

        public Builder types(java.util.Map<String, String> types) {
            this.types = types;
            this.__explicitlySet__.add("types");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nullValuePattern")
        private String nullValuePattern;

        public Builder nullValuePattern(String nullValuePattern) {
            this.nullValuePattern = nullValuePattern;
            this.__explicitlySet__.add("nullValuePattern");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isNullEmptyString")
        private Boolean isNullEmptyString;

        public Builder isNullEmptyString(Boolean isNullEmptyString) {
            this.isNullEmptyString = isNullEmptyString;
            this.__explicitlySet__.add("isNullEmptyString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEstimateCurrentEvent")
        private Boolean isEstimateCurrentEvent;

        public Builder isEstimateCurrentEvent(Boolean isEstimateCurrentEvent) {
            this.isEstimateCurrentEvent = isEstimateCurrentEvent;
            this.__explicitlySet__.add("isEstimateCurrentEvent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isKeepTimeKey")
        private Boolean isKeepTimeKey;

        public Builder isKeepTimeKey(Boolean isKeepTimeKey) {
            this.isKeepTimeKey = isKeepTimeKey;
            this.__explicitlySet__.add("isKeepTimeKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMilliseconds")
        private Integer timeoutInMilliseconds;

        public Builder timeoutInMilliseconds(Integer timeoutInMilliseconds) {
            this.timeoutInMilliseconds = timeoutInMilliseconds;
            this.__explicitlySet__.add("timeoutInMilliseconds");
            return this;
        }
        /** If you don't need stream/logtag fields, set this to false. */
        @com.fasterxml.jackson.annotation.JsonProperty("isMergeCriFields")
        private Boolean isMergeCriFields;

        /**
         * If you don't need stream/logtag fields, set this to false.
         *
         * @param isMergeCriFields the value to set
         * @return this builder
         */
        public Builder isMergeCriFields(Boolean isMergeCriFields) {
            this.isMergeCriFields = isMergeCriFields;
            this.__explicitlySet__.add("isMergeCriFields");
            return this;
        }
        /**
         * Optional nested JSON Parser for CRI Parser. Supported fields are fieldTimeKey,
         * timeFormat, and isKeepTimeKey.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nestedParser")
        private UnifiedJSONParser nestedParser;

        /**
         * Optional nested JSON Parser for CRI Parser. Supported fields are fieldTimeKey,
         * timeFormat, and isKeepTimeKey.
         *
         * @param nestedParser the value to set
         * @return this builder
         */
        public Builder nestedParser(UnifiedJSONParser nestedParser) {
            this.nestedParser = nestedParser;
            this.__explicitlySet__.add("nestedParser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UnifiedAgentCriParser build() {
            UnifiedAgentCriParser model =
                    new UnifiedAgentCriParser(
                            this.fieldTimeKey,
                            this.types,
                            this.nullValuePattern,
                            this.isNullEmptyString,
                            this.isEstimateCurrentEvent,
                            this.isKeepTimeKey,
                            this.timeoutInMilliseconds,
                            this.isMergeCriFields,
                            this.nestedParser);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UnifiedAgentCriParser model) {
            if (model.wasPropertyExplicitlySet("fieldTimeKey")) {
                this.fieldTimeKey(model.getFieldTimeKey());
            }
            if (model.wasPropertyExplicitlySet("types")) {
                this.types(model.getTypes());
            }
            if (model.wasPropertyExplicitlySet("nullValuePattern")) {
                this.nullValuePattern(model.getNullValuePattern());
            }
            if (model.wasPropertyExplicitlySet("isNullEmptyString")) {
                this.isNullEmptyString(model.getIsNullEmptyString());
            }
            if (model.wasPropertyExplicitlySet("isEstimateCurrentEvent")) {
                this.isEstimateCurrentEvent(model.getIsEstimateCurrentEvent());
            }
            if (model.wasPropertyExplicitlySet("isKeepTimeKey")) {
                this.isKeepTimeKey(model.getIsKeepTimeKey());
            }
            if (model.wasPropertyExplicitlySet("timeoutInMilliseconds")) {
                this.timeoutInMilliseconds(model.getTimeoutInMilliseconds());
            }
            if (model.wasPropertyExplicitlySet("isMergeCriFields")) {
                this.isMergeCriFields(model.getIsMergeCriFields());
            }
            if (model.wasPropertyExplicitlySet("nestedParser")) {
                this.nestedParser(model.getNestedParser());
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

    @Deprecated
    public UnifiedAgentCriParser(
            String fieldTimeKey,
            java.util.Map<String, String> types,
            String nullValuePattern,
            Boolean isNullEmptyString,
            Boolean isEstimateCurrentEvent,
            Boolean isKeepTimeKey,
            Integer timeoutInMilliseconds,
            Boolean isMergeCriFields,
            UnifiedJSONParser nestedParser) {
        super(
                fieldTimeKey,
                types,
                nullValuePattern,
                isNullEmptyString,
                isEstimateCurrentEvent,
                isKeepTimeKey,
                timeoutInMilliseconds);
        this.isMergeCriFields = isMergeCriFields;
        this.nestedParser = nestedParser;
    }

    /** If you don't need stream/logtag fields, set this to false. */
    @com.fasterxml.jackson.annotation.JsonProperty("isMergeCriFields")
    private final Boolean isMergeCriFields;

    /**
     * If you don't need stream/logtag fields, set this to false.
     *
     * @return the value
     */
    public Boolean getIsMergeCriFields() {
        return isMergeCriFields;
    }

    /**
     * Optional nested JSON Parser for CRI Parser. Supported fields are fieldTimeKey, timeFormat,
     * and isKeepTimeKey.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nestedParser")
    private final UnifiedJSONParser nestedParser;

    /**
     * Optional nested JSON Parser for CRI Parser. Supported fields are fieldTimeKey, timeFormat,
     * and isKeepTimeKey.
     *
     * @return the value
     */
    public UnifiedJSONParser getNestedParser() {
        return nestedParser;
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
        sb.append("UnifiedAgentCriParser(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", isMergeCriFields=").append(String.valueOf(this.isMergeCriFields));
        sb.append(", nestedParser=").append(String.valueOf(this.nestedParser));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UnifiedAgentCriParser)) {
            return false;
        }

        UnifiedAgentCriParser other = (UnifiedAgentCriParser) o;
        return java.util.Objects.equals(this.isMergeCriFields, other.isMergeCriFields)
                && java.util.Objects.equals(this.nestedParser, other.nestedParser)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.isMergeCriFields == null ? 43 : this.isMergeCriFields.hashCode());
        result = (result * PRIME) + (this.nestedParser == null ? 43 : this.nestedParser.hashCode());
        return result;
    }
}
