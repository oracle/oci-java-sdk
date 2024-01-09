/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * List of TLS/SSL information of services <br>
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
        builder = CertificateServiceInfoSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CertificateServiceInfoSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "service",
        "serviceCertificateStatus",
        "hostSpecificCertificateDetails"
    })
    public CertificateServiceInfoSummary(
            Service service,
            ServiceCertificateStatus serviceCertificateStatus,
            java.util.List<HostSpecificCertificateDetails> hostSpecificCertificateDetails) {
        super();
        this.service = service;
        this.serviceCertificateStatus = serviceCertificateStatus;
        this.hostSpecificCertificateDetails = hostSpecificCertificateDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the service */
        @com.fasterxml.jackson.annotation.JsonProperty("service")
        private Service service;

        /**
         * Name of the service
         *
         * @param service the value to set
         * @return this builder
         */
        public Builder service(Service service) {
            this.service = service;
            this.__explicitlySet__.add("service");
            return this;
        }
        /** Whether certificate is enabled or disabled */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceCertificateStatus")
        private ServiceCertificateStatus serviceCertificateStatus;

        /**
         * Whether certificate is enabled or disabled
         *
         * @param serviceCertificateStatus the value to set
         * @return this builder
         */
        public Builder serviceCertificateStatus(ServiceCertificateStatus serviceCertificateStatus) {
            this.serviceCertificateStatus = serviceCertificateStatus;
            this.__explicitlySet__.add("serviceCertificateStatus");
            return this;
        }
        /** List of Host specific certificate details */
        @com.fasterxml.jackson.annotation.JsonProperty("hostSpecificCertificateDetails")
        private java.util.List<HostSpecificCertificateDetails> hostSpecificCertificateDetails;

        /**
         * List of Host specific certificate details
         *
         * @param hostSpecificCertificateDetails the value to set
         * @return this builder
         */
        public Builder hostSpecificCertificateDetails(
                java.util.List<HostSpecificCertificateDetails> hostSpecificCertificateDetails) {
            this.hostSpecificCertificateDetails = hostSpecificCertificateDetails;
            this.__explicitlySet__.add("hostSpecificCertificateDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CertificateServiceInfoSummary build() {
            CertificateServiceInfoSummary model =
                    new CertificateServiceInfoSummary(
                            this.service,
                            this.serviceCertificateStatus,
                            this.hostSpecificCertificateDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CertificateServiceInfoSummary model) {
            if (model.wasPropertyExplicitlySet("service")) {
                this.service(model.getService());
            }
            if (model.wasPropertyExplicitlySet("serviceCertificateStatus")) {
                this.serviceCertificateStatus(model.getServiceCertificateStatus());
            }
            if (model.wasPropertyExplicitlySet("hostSpecificCertificateDetails")) {
                this.hostSpecificCertificateDetails(model.getHostSpecificCertificateDetails());
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

    /** Name of the service */
    public enum Service implements com.oracle.bmc.http.internal.BmcEnum {
        Zookeeper("ZOOKEEPER"),
        Ams("AMS"),
        Hdfs("HDFS"),
        Yarn("YARN"),
        Mapreduce("MAPREDUCE"),
        Oozie("OOZIE"),
        Hbase("HBASE"),
        Spark("SPARK"),
        Hive("HIVE"),
        Kafka("KAFKA"),
        Flink("FLINK"),
        Registry("REGISTRY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Service.class);

        private final String value;
        private static java.util.Map<String, Service> map;

        static {
            map = new java.util.HashMap<>();
            for (Service v : Service.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Service(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Service create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Service', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Name of the service */
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    private final Service service;

    /**
     * Name of the service
     *
     * @return the value
     */
    public Service getService() {
        return service;
    }

    /** Whether certificate is enabled or disabled */
    public enum ServiceCertificateStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ServiceCertificateStatus.class);

        private final String value;
        private static java.util.Map<String, ServiceCertificateStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (ServiceCertificateStatus v : ServiceCertificateStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ServiceCertificateStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ServiceCertificateStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ServiceCertificateStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Whether certificate is enabled or disabled */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceCertificateStatus")
    private final ServiceCertificateStatus serviceCertificateStatus;

    /**
     * Whether certificate is enabled or disabled
     *
     * @return the value
     */
    public ServiceCertificateStatus getServiceCertificateStatus() {
        return serviceCertificateStatus;
    }

    /** List of Host specific certificate details */
    @com.fasterxml.jackson.annotation.JsonProperty("hostSpecificCertificateDetails")
    private final java.util.List<HostSpecificCertificateDetails> hostSpecificCertificateDetails;

    /**
     * List of Host specific certificate details
     *
     * @return the value
     */
    public java.util.List<HostSpecificCertificateDetails> getHostSpecificCertificateDetails() {
        return hostSpecificCertificateDetails;
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
        sb.append("CertificateServiceInfoSummary(");
        sb.append("super=").append(super.toString());
        sb.append("service=").append(String.valueOf(this.service));
        sb.append(", serviceCertificateStatus=")
                .append(String.valueOf(this.serviceCertificateStatus));
        sb.append(", hostSpecificCertificateDetails=")
                .append(String.valueOf(this.hostSpecificCertificateDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CertificateServiceInfoSummary)) {
            return false;
        }

        CertificateServiceInfoSummary other = (CertificateServiceInfoSummary) o;
        return java.util.Objects.equals(this.service, other.service)
                && java.util.Objects.equals(
                        this.serviceCertificateStatus, other.serviceCertificateStatus)
                && java.util.Objects.equals(
                        this.hostSpecificCertificateDetails, other.hostSpecificCertificateDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.service == null ? 43 : this.service.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceCertificateStatus == null
                                ? 43
                                : this.serviceCertificateStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.hostSpecificCertificateDetails == null
                                ? 43
                                : this.hostSpecificCertificateDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
