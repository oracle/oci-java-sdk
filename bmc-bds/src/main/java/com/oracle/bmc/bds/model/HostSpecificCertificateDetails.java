/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Host specific certificate details <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = HostSpecificCertificateDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HostSpecificCertificateDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"hostName", "certificateType", "timeExpiry"})
    public HostSpecificCertificateDetails(
            String hostName, CertificateType certificateType, java.util.Date timeExpiry) {
        super();
        this.hostName = hostName;
        this.certificateType = certificateType;
        this.timeExpiry = timeExpiry;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the host. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * Name of the host.
         *
         * @param hostName the value to set
         * @return this builder
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /** Type of certificate self signed or CA signed */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateType")
        private CertificateType certificateType;

        /**
         * Type of certificate self signed or CA signed
         *
         * @param certificateType the value to set
         * @return this builder
         */
        public Builder certificateType(CertificateType certificateType) {
            this.certificateType = certificateType;
            this.__explicitlySet__.add("certificateType");
            return this;
        }
        /** The time the certificate expires, shown as an RFC 3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpiry")
        private java.util.Date timeExpiry;

        /**
         * The time the certificate expires, shown as an RFC 3339 formatted datetime string.
         *
         * @param timeExpiry the value to set
         * @return this builder
         */
        public Builder timeExpiry(java.util.Date timeExpiry) {
            this.timeExpiry = timeExpiry;
            this.__explicitlySet__.add("timeExpiry");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostSpecificCertificateDetails build() {
            HostSpecificCertificateDetails model =
                    new HostSpecificCertificateDetails(
                            this.hostName, this.certificateType, this.timeExpiry);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostSpecificCertificateDetails model) {
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("certificateType")) {
                this.certificateType(model.getCertificateType());
            }
            if (model.wasPropertyExplicitlySet("timeExpiry")) {
                this.timeExpiry(model.getTimeExpiry());
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

    /** Name of the host. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * Name of the host.
     *
     * @return the value
     */
    public String getHostName() {
        return hostName;
    }

    /** Type of certificate self signed or CA signed */
    public enum CertificateType implements com.oracle.bmc.http.internal.BmcEnum {
        CustomSigned("CUSTOM_SIGNED"),
        SelfSigned("SELF_SIGNED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CertificateType.class);

        private final String value;
        private static java.util.Map<String, CertificateType> map;

        static {
            map = new java.util.HashMap<>();
            for (CertificateType v : CertificateType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CertificateType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CertificateType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CertificateType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Type of certificate self signed or CA signed */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateType")
    private final CertificateType certificateType;

    /**
     * Type of certificate self signed or CA signed
     *
     * @return the value
     */
    public CertificateType getCertificateType() {
        return certificateType;
    }

    /** The time the certificate expires, shown as an RFC 3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpiry")
    private final java.util.Date timeExpiry;

    /**
     * The time the certificate expires, shown as an RFC 3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeExpiry() {
        return timeExpiry;
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
        sb.append("HostSpecificCertificateDetails(");
        sb.append("super=").append(super.toString());
        sb.append("hostName=").append(String.valueOf(this.hostName));
        sb.append(", certificateType=").append(String.valueOf(this.certificateType));
        sb.append(", timeExpiry=").append(String.valueOf(this.timeExpiry));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostSpecificCertificateDetails)) {
            return false;
        }

        HostSpecificCertificateDetails other = (HostSpecificCertificateDetails) o;
        return java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.certificateType, other.certificateType)
                && java.util.Objects.equals(this.timeExpiry, other.timeExpiry)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateType == null ? 43 : this.certificateType.hashCode());
        result = (result * PRIME) + (this.timeExpiry == null ? 43 : this.timeExpiry.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
