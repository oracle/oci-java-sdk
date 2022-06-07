/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Syslog Parser.
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
    builder = UnifiedAgentSyslogParser.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "parserType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UnifiedAgentSyslogParser extends UnifiedAgentParser {
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeFormat")
        private String timeFormat;

        public Builder timeFormat(String timeFormat) {
            this.timeFormat = timeFormat;
            this.__explicitlySet__.add("timeFormat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rfc5424TimeFormat")
        private String rfc5424TimeFormat;

        public Builder rfc5424TimeFormat(String rfc5424TimeFormat) {
            this.rfc5424TimeFormat = rfc5424TimeFormat;
            this.__explicitlySet__.add("rfc5424TimeFormat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("messageFormat")
        private MessageFormat messageFormat;

        public Builder messageFormat(MessageFormat messageFormat) {
            this.messageFormat = messageFormat;
            this.__explicitlySet__.add("messageFormat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isWithPriority")
        private Boolean isWithPriority;

        public Builder isWithPriority(Boolean isWithPriority) {
            this.isWithPriority = isWithPriority;
            this.__explicitlySet__.add("isWithPriority");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSupportColonlessIdent")
        private Boolean isSupportColonlessIdent;

        public Builder isSupportColonlessIdent(Boolean isSupportColonlessIdent) {
            this.isSupportColonlessIdent = isSupportColonlessIdent;
            this.__explicitlySet__.add("isSupportColonlessIdent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("syslogParserType")
        private SyslogParserType syslogParserType;

        public Builder syslogParserType(SyslogParserType syslogParserType) {
            this.syslogParserType = syslogParserType;
            this.__explicitlySet__.add("syslogParserType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UnifiedAgentSyslogParser build() {
            UnifiedAgentSyslogParser __instance__ =
                    new UnifiedAgentSyslogParser(
                            fieldTimeKey,
                            types,
                            nullValuePattern,
                            isNullEmptyString,
                            isEstimateCurrentEvent,
                            isKeepTimeKey,
                            timeoutInMilliseconds,
                            timeFormat,
                            rfc5424TimeFormat,
                            messageFormat,
                            isWithPriority,
                            isSupportColonlessIdent,
                            syslogParserType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UnifiedAgentSyslogParser o) {
            Builder copiedBuilder =
                    fieldTimeKey(o.getFieldTimeKey())
                            .types(o.getTypes())
                            .nullValuePattern(o.getNullValuePattern())
                            .isNullEmptyString(o.getIsNullEmptyString())
                            .isEstimateCurrentEvent(o.getIsEstimateCurrentEvent())
                            .isKeepTimeKey(o.getIsKeepTimeKey())
                            .timeoutInMilliseconds(o.getTimeoutInMilliseconds())
                            .timeFormat(o.getTimeFormat())
                            .rfc5424TimeFormat(o.getRfc5424TimeFormat())
                            .messageFormat(o.getMessageFormat())
                            .isWithPriority(o.getIsWithPriority())
                            .isSupportColonlessIdent(o.getIsSupportColonlessIdent())
                            .syslogParserType(o.getSyslogParserType());

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

    @Deprecated
    public UnifiedAgentSyslogParser(
            String fieldTimeKey,
            java.util.Map<String, String> types,
            String nullValuePattern,
            Boolean isNullEmptyString,
            Boolean isEstimateCurrentEvent,
            Boolean isKeepTimeKey,
            Integer timeoutInMilliseconds,
            String timeFormat,
            String rfc5424TimeFormat,
            MessageFormat messageFormat,
            Boolean isWithPriority,
            Boolean isSupportColonlessIdent,
            SyslogParserType syslogParserType) {
        super(
                fieldTimeKey,
                types,
                nullValuePattern,
                isNullEmptyString,
                isEstimateCurrentEvent,
                isKeepTimeKey,
                timeoutInMilliseconds);
        this.timeFormat = timeFormat;
        this.rfc5424TimeFormat = rfc5424TimeFormat;
        this.messageFormat = messageFormat;
        this.isWithPriority = isWithPriority;
        this.isSupportColonlessIdent = isSupportColonlessIdent;
        this.syslogParserType = syslogParserType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("timeFormat")
    private final String timeFormat;

    public String getTimeFormat() {
        return timeFormat;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("rfc5424TimeFormat")
    private final String rfc5424TimeFormat;

    public String getRfc5424TimeFormat() {
        return rfc5424TimeFormat;
    }

    /**
     **/
    public enum MessageFormat {
        Rfc3164("RFC3164"),
        Rfc5424("RFC5424"),
        Auto("AUTO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MessageFormat.class);

        private final String value;
        private static java.util.Map<String, MessageFormat> map;

        static {
            map = new java.util.HashMap<>();
            for (MessageFormat v : MessageFormat.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MessageFormat(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MessageFormat create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MessageFormat', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };

    @com.fasterxml.jackson.annotation.JsonProperty("messageFormat")
    private final MessageFormat messageFormat;

    public MessageFormat getMessageFormat() {
        return messageFormat;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("isWithPriority")
    private final Boolean isWithPriority;

    public Boolean getIsWithPriority() {
        return isWithPriority;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("isSupportColonlessIdent")
    private final Boolean isSupportColonlessIdent;

    public Boolean getIsSupportColonlessIdent() {
        return isSupportColonlessIdent;
    }

    /**
     **/
    public enum SyslogParserType {
        String("STRING"),
        Regexp("REGEXP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SyslogParserType.class);

        private final String value;
        private static java.util.Map<String, SyslogParserType> map;

        static {
            map = new java.util.HashMap<>();
            for (SyslogParserType v : SyslogParserType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SyslogParserType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SyslogParserType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SyslogParserType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };

    @com.fasterxml.jackson.annotation.JsonProperty("syslogParserType")
    private final SyslogParserType syslogParserType;

    public SyslogParserType getSyslogParserType() {
        return syslogParserType;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UnifiedAgentSyslogParser(");
        sb.append("super=").append(super.toString());
        sb.append(", timeFormat=").append(String.valueOf(this.timeFormat));
        sb.append(", rfc5424TimeFormat=").append(String.valueOf(this.rfc5424TimeFormat));
        sb.append(", messageFormat=").append(String.valueOf(this.messageFormat));
        sb.append(", isWithPriority=").append(String.valueOf(this.isWithPriority));
        sb.append(", isSupportColonlessIdent=")
                .append(String.valueOf(this.isSupportColonlessIdent));
        sb.append(", syslogParserType=").append(String.valueOf(this.syslogParserType));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UnifiedAgentSyslogParser)) {
            return false;
        }

        UnifiedAgentSyslogParser other = (UnifiedAgentSyslogParser) o;
        return java.util.Objects.equals(this.timeFormat, other.timeFormat)
                && java.util.Objects.equals(this.rfc5424TimeFormat, other.rfc5424TimeFormat)
                && java.util.Objects.equals(this.messageFormat, other.messageFormat)
                && java.util.Objects.equals(this.isWithPriority, other.isWithPriority)
                && java.util.Objects.equals(
                        this.isSupportColonlessIdent, other.isSupportColonlessIdent)
                && java.util.Objects.equals(this.syslogParserType, other.syslogParserType)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.timeFormat == null ? 43 : this.timeFormat.hashCode());
        result =
                (result * PRIME)
                        + (this.rfc5424TimeFormat == null ? 43 : this.rfc5424TimeFormat.hashCode());
        result =
                (result * PRIME)
                        + (this.messageFormat == null ? 43 : this.messageFormat.hashCode());
        result =
                (result * PRIME)
                        + (this.isWithPriority == null ? 43 : this.isWithPriority.hashCode());
        result =
                (result * PRIME)
                        + (this.isSupportColonlessIdent == null
                                ? 43
                                : this.isSupportColonlessIdent.hashCode());
        result =
                (result * PRIME)
                        + (this.syslogParserType == null ? 43 : this.syslogParserType.hashCode());
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
