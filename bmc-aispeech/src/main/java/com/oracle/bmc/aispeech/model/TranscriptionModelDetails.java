/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * Model details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TranscriptionModelDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TranscriptionModelDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"domain", "languageCode"})
    public TranscriptionModelDetails(Domain domain, LanguageCode languageCode) {
        super();
        this.domain = domain;
        this.languageCode = languageCode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Domain for input files. */
        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private Domain domain;

        /**
         * Domain for input files.
         *
         * @param domain the value to set
         * @return this builder
         */
        public Builder domain(Domain domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }
        /**
         * Locale value as per given in [https://datatracker.ietf.org/doc/html/rfc5646]. - en-US:
         * English - United States - es-ES: Spanish - Spain - pt-BR: Portuguese - Brazil - en-GB:
         * English - Great Britain - en-AU: English - Australia - en-IN: English - India - hi-IN:
         * Hindi - India - fr-FR: French - France - de-DE: German - Germany - it-IT: Italian - Italy
         */
        @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
        private LanguageCode languageCode;

        /**
         * Locale value as per given in [https://datatracker.ietf.org/doc/html/rfc5646]. - en-US:
         * English - United States - es-ES: Spanish - Spain - pt-BR: Portuguese - Brazil - en-GB:
         * English - Great Britain - en-AU: English - Australia - en-IN: English - India - hi-IN:
         * Hindi - India - fr-FR: French - France - de-DE: German - Germany - it-IT: Italian - Italy
         *
         * @param languageCode the value to set
         * @return this builder
         */
        public Builder languageCode(LanguageCode languageCode) {
            this.languageCode = languageCode;
            this.__explicitlySet__.add("languageCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TranscriptionModelDetails build() {
            TranscriptionModelDetails model =
                    new TranscriptionModelDetails(this.domain, this.languageCode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TranscriptionModelDetails model) {
            if (model.wasPropertyExplicitlySet("domain")) {
                this.domain(model.getDomain());
            }
            if (model.wasPropertyExplicitlySet("languageCode")) {
                this.languageCode(model.getLanguageCode());
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

    /** Domain for input files. */
    public enum Domain implements com.oracle.bmc.http.internal.BmcEnum {
        Generic("GENERIC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Domain.class);

        private final String value;
        private static java.util.Map<String, Domain> map;

        static {
            map = new java.util.HashMap<>();
            for (Domain v : Domain.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Domain(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Domain create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Domain', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Domain for input files. */
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    private final Domain domain;

    /**
     * Domain for input files.
     *
     * @return the value
     */
    public Domain getDomain() {
        return domain;
    }

    /**
     * Locale value as per given in [https://datatracker.ietf.org/doc/html/rfc5646]. - en-US:
     * English - United States - es-ES: Spanish - Spain - pt-BR: Portuguese - Brazil - en-GB:
     * English - Great Britain - en-AU: English - Australia - en-IN: English - India - hi-IN: Hindi
     * - India - fr-FR: French - France - de-DE: German - Germany - it-IT: Italian - Italy
     */
    public enum LanguageCode implements com.oracle.bmc.http.internal.BmcEnum {
        EnUs("en-US"),
        EsEs("es-ES"),
        PtBr("pt-BR"),
        EnGb("en-GB"),
        EnAu("en-AU"),
        EnIn("en-IN"),
        HiIn("hi-IN"),
        FrFr("fr-FR"),
        DeDe("de-DE"),
        ItIt("it-IT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LanguageCode.class);

        private final String value;
        private static java.util.Map<String, LanguageCode> map;

        static {
            map = new java.util.HashMap<>();
            for (LanguageCode v : LanguageCode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LanguageCode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LanguageCode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LanguageCode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Locale value as per given in [https://datatracker.ietf.org/doc/html/rfc5646]. - en-US:
     * English - United States - es-ES: Spanish - Spain - pt-BR: Portuguese - Brazil - en-GB:
     * English - Great Britain - en-AU: English - Australia - en-IN: English - India - hi-IN: Hindi
     * - India - fr-FR: French - France - de-DE: German - Germany - it-IT: Italian - Italy
     */
    @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
    private final LanguageCode languageCode;

    /**
     * Locale value as per given in [https://datatracker.ietf.org/doc/html/rfc5646]. - en-US:
     * English - United States - es-ES: Spanish - Spain - pt-BR: Portuguese - Brazil - en-GB:
     * English - Great Britain - en-AU: English - Australia - en-IN: English - India - hi-IN: Hindi
     * - India - fr-FR: French - France - de-DE: German - Germany - it-IT: Italian - Italy
     *
     * @return the value
     */
    public LanguageCode getLanguageCode() {
        return languageCode;
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
        sb.append("TranscriptionModelDetails(");
        sb.append("super=").append(super.toString());
        sb.append("domain=").append(String.valueOf(this.domain));
        sb.append(", languageCode=").append(String.valueOf(this.languageCode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TranscriptionModelDetails)) {
            return false;
        }

        TranscriptionModelDetails other = (TranscriptionModelDetails) o;
        return java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(this.languageCode, other.languageCode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result = (result * PRIME) + (this.languageCode == null ? 43 : this.languageCode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
