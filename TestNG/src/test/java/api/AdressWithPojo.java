package api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = AdressWithPojo.class)
public class AdressWithPojo {
    @JsonProperty("Ref")
    public String Ref;
    @JsonProperty("SettlementType")
    public String SettlementType;
    @JsonProperty("Latitude")
    public String Latitude;
    @JsonProperty("Longitude")
    public String Longitude;
    @JsonProperty("Description")
    public String Description;
    @JsonProperty("DescriptionRu")
    public String DescriptionRu;
    @JsonProperty("DescriptionTranslit")
    public String DescriptionTranslit;
    @JsonProperty("SettlementTypeDescription")
    public String SettlementTypeDescription;
    @JsonProperty("SettlementTypeDescriptionRu")
    public String SettlementTypeDescriptionRu;
    @JsonProperty("SettlementTypeDescriptionTranslit")
    public String SettlementTypeDescriptionTranslit;
    @JsonProperty("Region")
    public String Region;
    @JsonProperty("RegionsDescription")
    public String RegionsDescription;
    @JsonProperty("RegionsDescriptionRu")
    public String RegionsDescriptionRu;
    @JsonProperty("RegionsDescriptionTranslit")
    public String RegionsDescriptionTranslit;
    @JsonProperty("Area")
    public String Area;
    @JsonProperty("AreaDescription")
    public String AreaDescription;
    @JsonProperty("AreaDescriptionRu")
    public String AreaDescriptionRu;
    @JsonProperty("AreaDescriptionTranslit")
    public String AreaDescriptionTranslit;
    @JsonProperty("Index1")
    public String Index1;
    @JsonProperty("Index2")
    public String Index2;
    @JsonProperty("IndexCOATSU1")
    public String IndexCOATSU1;
    @JsonProperty("Delivery1")
    public String Delivery1;
    @JsonProperty("Delivery2")
    public String Delivery2;
    @JsonProperty("Delivery3")
    public String Delivery3;
    @JsonProperty("Delivery4")
    public String Delivery4;
    @JsonProperty("Delivery5")
    public String Delivery5;
    @JsonProperty("Delivery6")
    public String Delivery6;
    @JsonProperty("Delivery7")
    public String Delivery7;
    @JsonProperty("SpecialCashCheck")
    public int SpecialCashCheck;
    @JsonProperty("Warehouse")
    public String Warehouse;

    @JsonCreator
    public AdressWithPojo(@JsonProperty("Ref") String ref, @JsonProperty("SettlementType") String settlementType,
                          @JsonProperty("Latitude") String latitude, @JsonProperty("Longitude") String longitude,
                          @JsonProperty("Description") String description, @JsonProperty("DescriptionRu") String descriptionRu,
                          @JsonProperty("DescriptionTranslit") String descriptionTranslit, @JsonProperty("SettlementTypeDescription") String settlementTypeDescription,
                          @JsonProperty("SettlementTypeDescriptionRu") String settlementTypeDescriptionRu, @JsonProperty("SettlementTypeDescriptionTranslit") String settlementTypeDescriptionTranslit,
                          @JsonProperty("Region") String region, @JsonProperty("RegionsDescription") String regionsDescription, @JsonProperty("RegionsDescriptionRu") String regionsDescriptionRu,
                          @JsonProperty("RegionsDescriptionTranslit") String regionsDescriptionTranslit, @JsonProperty("Area") String area,
                          @JsonProperty("AreaDescription") String areaDescription, @JsonProperty("AreaDescriptionRu") String areaDescriptionRu,
                          @JsonProperty("AreaDescriptionTranslit") String areaDescriptionTranslit, @JsonProperty("Index1") String index1,
                          @JsonProperty("Index2") String index2, @JsonProperty("IndexCOATSU1") String indexCOATSU1, @JsonProperty("Delivery1") String delivery1,
                          @JsonProperty("Delivery2") String delivery2, @JsonProperty("Delivery3") String delivery3, @JsonProperty("Delivery4") String delivery4,
                          @JsonProperty("Delivery5") String delivery5, @JsonProperty("Delivery6") String delivery6, @JsonProperty("Delivery7") String delivery7,
                          @JsonProperty("SpecialCashCheck") int specialCashCheck, @JsonProperty("Warehouse") String warehouse) {
        this.Ref = ref;
        this.SettlementType = settlementType;
        this.Latitude = latitude;
        this.Longitude = longitude;
        this.Description = description;
        this.DescriptionRu = descriptionRu;
        this.DescriptionTranslit = descriptionTranslit;
        this.SettlementTypeDescription = settlementTypeDescription;
        this.SettlementTypeDescriptionRu = settlementTypeDescriptionRu;
        this.SettlementTypeDescriptionTranslit = settlementTypeDescriptionTranslit;
        this.Region = region;
        this.RegionsDescription = regionsDescription;
        this.RegionsDescriptionRu = regionsDescriptionRu;
        this.RegionsDescriptionTranslit = regionsDescriptionTranslit;
        this.Area = area;
        this.AreaDescription = areaDescription;
        this.AreaDescriptionRu = areaDescriptionRu;
        this.AreaDescriptionTranslit = areaDescriptionTranslit;
        this.Index1 = index1;
        this.Index2 = index2;
        this.IndexCOATSU1 = indexCOATSU1;
        this.Delivery1 = delivery1;
        this.Delivery2 = delivery2;
        this.Delivery3 = delivery3;
        this.Delivery4 = delivery4;
        this.Delivery5 = delivery5;
        this.Delivery6 = delivery6;
        this.Delivery7 = delivery7;
        this.SpecialCashCheck = specialCashCheck;
        this.Warehouse = warehouse;
    }

    public String getRef() {
        return Ref;
    }

    public String getSettlementType() {
        return SettlementType;
    }

    public String getLatitude() {
        return Latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public String getDescription() {
        return Description;
    }

    public String getDescriptionRu() {
        return DescriptionRu;
    }

    public String getDescriptionTranslit() {
        return DescriptionTranslit;
    }

    public String getSettlementTypeDescription() {
        return SettlementTypeDescription;
    }

    public String getSettlementTypeDescriptionRu() {
        return SettlementTypeDescriptionRu;
    }

    public String getSettlementTypeDescriptionTranslit() {
        return SettlementTypeDescriptionTranslit;
    }

    public String getRegion() {
        return Region;
    }

    public String getRegionsDescription() {
        return RegionsDescription;
    }

    public String getRegionsDescriptionRu() {
        return RegionsDescriptionRu;
    }

    public String getRegionsDescriptionTranslit() {
        return RegionsDescriptionTranslit;
    }

    public String getArea() {
        return Area;
    }

    public String getAreaDescription() {
        return AreaDescription;
    }

    public String getAreaDescriptionRu() {
        return AreaDescriptionRu;
    }

    public String getAreaDescriptionTranslit() {
        return AreaDescriptionTranslit;
    }

    public String getIndex1() {
        return Index1;
    }

    public String getIndex2() {
        return Index2;
    }

    public String getIndexCOATSU1() {
        return IndexCOATSU1;
    }

    public String getDelivery1() {
        return Delivery1;
    }

    public String getDelivery2() {
        return Delivery2;
    }

    public String getDelivery3() {
        return Delivery3;
    }

    public String getDelivery4() {
        return Delivery4;
    }

    public String getDelivery5() {
        return Delivery5;
    }

    public String getDelivery6() {
        return Delivery6;
    }

    public String getDelivery7() {
        return Delivery7;
    }

    public int getSpecialCashCheck() {
        return SpecialCashCheck;
    }

    public String getWarehouse() {
        return Warehouse;
    }

    @Override
    public String toString() {
        return "AdressWithPojo{" +
                "ref='" + Ref + '\'' +
                ", settlementType='" + SettlementType + '\'' +
                ", latitude='" + Latitude + '\'' +
                ", longitude='" + Longitude + '\'' +
                ", description='" + Description + '\'' +
                ", descriptionRu='" + DescriptionRu + '\'' +
                ", descriptionTranslit='" + DescriptionTranslit + '\'' +
                ", settlementTypeDescription='" + SettlementTypeDescription + '\'' +
                ", settlementTypeDescriptionRu='" + SettlementTypeDescriptionRu + '\'' +
                ", settlementTypeDescriptionTranslit='" + SettlementTypeDescriptionTranslit + '\'' +
                ", region='" + Region + '\'' +
                ", regionsDescription='" + RegionsDescription + '\'' +
                ", regionsDescriptionRu='" + RegionsDescriptionRu + '\'' +
                ", regionsDescriptionTranslit='" + RegionsDescriptionTranslit + '\'' +
                ", area='" + Area + '\'' +
                ", areaDescription='" + AreaDescription + '\'' +
                ", areaDescriptionRu='" + AreaDescriptionRu + '\'' +
                ", areaDescriptionTranslit='" + AreaDescriptionTranslit + '\'' +
                ", index1='" + Index1 + '\'' +
                ", index2='" + Index2 + '\'' +
                ", indexCOATSU1='" + IndexCOATSU1 + '\'' +
                ", delivery1='" + Delivery1 + '\'' +
                ", delivery2='" + Delivery2 + '\'' +
                ", delivery3='" + Delivery3 + '\'' +
                ", delivery4='" + Delivery4 + '\'' +
                ", delivery5='" + Delivery5 + '\'' +
                ", delivery6='" + Delivery6 + '\'' +
                ", delivery7='" + Delivery7 + '\'' +
                ", specialCashCheck=" + SpecialCashCheck +
                ", warehouse='" + Warehouse + '\'' +
                '}';
    }
}