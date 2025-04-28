/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The details for configuring the SSL certificates on Autonomous VM Cluster <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RotateAutonomousVmClusterOrdsCertsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RotateAutonomousVmClusterOrdsCertsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "certificateGenerationType",
        "certificateId",
        "certificateAuthorityId",
        "caBundleId"
    })
    public RotateAutonomousVmClusterOrdsCertsDetails(
            CertificateGenerationType certificateGenerationType,
            String certificateId,
            String certificateAuthorityId,
            String caBundleId) {
        super();
        this.certificateGenerationType = certificateGenerationType;
        this.certificateId = certificateId;
        this.certificateAuthorityId = certificateAuthorityId;
        this.caBundleId = caBundleId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Specify SYSTEM to use Oracle-managed certificates. Specify BYOC when you want to bring
         * your own certificate.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateGenerationType")
        private CertificateGenerationType certificateGenerationType;

        /**
         * Specify SYSTEM to use Oracle-managed certificates. Specify BYOC when you want to bring
         * your own certificate.
         *
         * @param certificateGenerationType the value to set
         * @return this builder
         */
        public Builder certificateGenerationType(
                CertificateGenerationType certificateGenerationType) {
            this.certificateGenerationType = certificateGenerationType;
            this.__explicitlySet__.add("certificateGenerationType");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * certificate to use.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
        private String certificateId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * certificate to use.
         *
         * @param certificateId the value to set
         * @return this builder
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            this.__explicitlySet__.add("certificateId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * certificate authority.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityId")
        private String certificateAuthorityId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * certificate authority.
         *
         * @param certificateAuthorityId the value to set
         * @return this builder
         */
        public Builder certificateAuthorityId(String certificateAuthorityId) {
            this.certificateAuthorityId = certificateAuthorityId;
            this.__explicitlySet__.add("certificateAuthorityId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * certificate bundle.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("caBundleId")
        private String caBundleId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * certificate bundle.
         *
         * @param caBundleId the value to set
         * @return this builder
         */
        public Builder caBundleId(String caBundleId) {
            this.caBundleId = caBundleId;
            this.__explicitlySet__.add("caBundleId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RotateAutonomousVmClusterOrdsCertsDetails build() {
            RotateAutonomousVmClusterOrdsCertsDetails model =
                    new RotateAutonomousVmClusterOrdsCertsDetails(
                            this.certificateGenerationType,
                            this.certificateId,
                            this.certificateAuthorityId,
                            this.caBundleId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RotateAutonomousVmClusterOrdsCertsDetails model) {
            if (model.wasPropertyExplicitlySet("certificateGenerationType")) {
                this.certificateGenerationType(model.getCertificateGenerationType());
            }
            if (model.wasPropertyExplicitlySet("certificateId")) {
                this.certificateId(model.getCertificateId());
            }
            if (model.wasPropertyExplicitlySet("certificateAuthorityId")) {
                this.certificateAuthorityId(model.getCertificateAuthorityId());
            }
            if (model.wasPropertyExplicitlySet("caBundleId")) {
                this.caBundleId(model.getCaBundleId());
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

    /**
     * Specify SYSTEM to use Oracle-managed certificates. Specify BYOC when you want to bring your
     * own certificate.
     */
    public enum CertificateGenerationType implements com.oracle.bmc.http.internal.BmcEnum {
        System("SYSTEM"),
        Byoc("BYOC"),
        ;

        private final String value;
        private static java.util.Map<String, CertificateGenerationType> map;

        static {
            map = new java.util.HashMap<>();
            for (CertificateGenerationType v : CertificateGenerationType.values()) {
                map.put(v.getValue(), v);
            }
        }

        CertificateGenerationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CertificateGenerationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid CertificateGenerationType: " + key);
        }
    };
    /**
     * Specify SYSTEM to use Oracle-managed certificates. Specify BYOC when you want to bring your
     * own certificate.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateGenerationType")
    private final CertificateGenerationType certificateGenerationType;

    /**
     * Specify SYSTEM to use Oracle-managed certificates. Specify BYOC when you want to bring your
     * own certificate.
     *
     * @return the value
     */
    public CertificateGenerationType getCertificateGenerationType() {
        return certificateGenerationType;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * certificate to use.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
    private final String certificateId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * certificate to use.
     *
     * @return the value
     */
    public String getCertificateId() {
        return certificateId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * certificate authority.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityId")
    private final String certificateAuthorityId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * certificate authority.
     *
     * @return the value
     */
    public String getCertificateAuthorityId() {
        return certificateAuthorityId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * certificate bundle.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("caBundleId")
    private final String caBundleId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * certificate bundle.
     *
     * @return the value
     */
    public String getCaBundleId() {
        return caBundleId;
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
        sb.append("RotateAutonomousVmClusterOrdsCertsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("certificateGenerationType=")
                .append(String.valueOf(this.certificateGenerationType));
        sb.append(", certificateId=").append(String.valueOf(this.certificateId));
        sb.append(", certificateAuthorityId=").append(String.valueOf(this.certificateAuthorityId));
        sb.append(", caBundleId=").append(String.valueOf(this.caBundleId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RotateAutonomousVmClusterOrdsCertsDetails)) {
            return false;
        }

        RotateAutonomousVmClusterOrdsCertsDetails other =
                (RotateAutonomousVmClusterOrdsCertsDetails) o;
        return java.util.Objects.equals(
                        this.certificateGenerationType, other.certificateGenerationType)
                && java.util.Objects.equals(this.certificateId, other.certificateId)
                && java.util.Objects.equals(
                        this.certificateAuthorityId, other.certificateAuthorityId)
                && java.util.Objects.equals(this.caBundleId, other.caBundleId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.certificateGenerationType == null
                                ? 43
                                : this.certificateGenerationType.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateId == null ? 43 : this.certificateId.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateAuthorityId == null
                                ? 43
                                : this.certificateAuthorityId.hashCode());
        result = (result * PRIME) + (this.caBundleId == null ? 43 : this.caBundleId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
