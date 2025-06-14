
/*
 *************************************************************************
 * The contents of this file are subject to the Openbravo  Public  License
 * Version  1.1  (the  "License"),  being   the  Mozilla   Public  License
 * Version 1.1  with a permitted attribution clause; you may not  use this
 * file except in compliance with the License. You  may  obtain  a copy of
 * the License at http://www.openbravo.com/legal/license.html
 * Software distributed under the License  is  distributed  on  an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific  language  governing  rights  and  limitations
 * under the License.
 * The Original Code is Openbravo ERP.
 * The Initial Developer of the Original Code is Openbravo SLU
 * All portions are Copyright (C) 2008-2020 Openbravo SLU
 * All Rights Reserved.
 * Contributor(s):  ______________________________________.
 ************************************************************************
*/
package org.openbravo.model.common.plm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.ServiceProduct;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.ad.utility.Image;
import org.openbravo.model.common.businesspartner.BusinessPartner;
import org.openbravo.model.common.enterprise.Locator;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.common.order.OrderLine;
import org.openbravo.model.common.order.OrderLineAccountingDimension;
import org.openbravo.model.common.uom.UOM;
import org.openbravo.model.financialmgmt.tax.TaxCategory;
import org.openbravo.model.manufacturing.processplan.ProcessPlan;
import org.openbravo.model.materialmgmt.cost.Costing;
import org.openbravo.model.materialmgmt.cost.LandedCostType;
import org.openbravo.model.materialmgmt.onhandquantity.ProductStockView;
import org.openbravo.model.materialmgmt.transaction.MaterialTransaction;
import org.openbravo.model.mrp.Planner;
import org.openbravo.model.mrp.PlanningMethod;
import org.openbravo.model.pricing.discount.Discount;
import org.openbravo.model.pricing.pricelist.ProductPrice;
import org.openbravo.model.shipping.FreightCategory;
import org.openbravo.model.timeandexpense.ExpenseType;
import org.openbravo.model.timeandexpense.Resource;
/**
 * Entity class for entity Product (stored in table M_Product).
 * <br>
 * Help: {@literal Defines each product and identifies it for use in price lists and orders. The Location is
     *       the default location when receiving the stored products.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Product extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "M_Product";
    public static final String ENTITY_NAME = "Product";

    /**
     * Property id stored in column M_Product_ID in table M_Product<br>
     * Help: {@literal Identifies an item which is either purchased or sold in this organization.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table M_Product 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table M_Product 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table M_Product 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table M_Product 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table M_Product 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table M_Product 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table M_Product 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property searchKey stored in column Value in table M_Product<br>
     * Help: {@literal A search key allows for a fast method of finding a particular record. If you leave the
     *       search key empty, the system automatically creates a numeric number originating from a document
     *       sequence defined in the  "Document Sequence" window. The sequence naming convention follows a rule
     *       "DocumentNo_TableName", where TableName is the actual name of the database table (e.g.
     *       C_Order).
     *       
     *       Usually, company's internal identifiers for various records (products, customers, etc)
     *       are stored here.}
     * 
     */
    public static final String PROPERTY_SEARCHKEY = "searchKey";

    /**
     * Property name stored in column Name in table M_Product 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table M_Product<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property comments stored in column DocumentNote in table M_Product<br>
     * Help: {@literal The Document Note is used for recording any additional information regarding this
     *       product.}
     * 
     */
    public static final String PROPERTY_COMMENTS = "comments";

    /**
     * Property helpComment stored in column Help in table M_Product<br>
     * Help: {@literal The Help field contains a hint, comment or help about the use of this item.}
     * 
     */
    public static final String PROPERTY_HELPCOMMENT = "helpComment";

    /**
     * Property uPCEAN stored in column UPC in table M_Product<br>
     * Help: {@literal Use this field to enter the bar code for the product in any of the bar code symbologies
     *       (Codabar, Code 25, Code 39, Code 93, Code 128, UPC (A), UPC (E), EAN-13, EAN-8, ITF, ITF-14, ISBN,
     *       ISSN, JAN-13, JAN-8, POSTNET and FIM, MSI/Plessey, and Pharmacode)}
     * 
     */
    public static final String PROPERTY_UPCEAN = "uPCEAN";

    /**
     * Property sKU stored in column SKU in table M_Product<br>
     * Help: {@literal The SKU indicates a user defined stock keeping unit.  It may be used for an additional bar
     *       code symbols or your own schema.}
     * 
     */
    public static final String PROPERTY_SKU = "sKU";

    /**
     * Property uOM stored in column C_UOM_ID in table M_Product<br>
     * Help: {@literal The UOM defines a unique non monetary unit of measure}
     * 
     */
    public static final String PROPERTY_UOM = "uOM";

    /**
     * Property salesRepresentative stored in column SalesRep_ID in table M_Product<br>
     * Help: {@literal Indicates the sales representative responsible for the transaction that  the document
     *       specifies . A valid sales representative is a business partner marked as an employee and a sales
     *       representative.}
     * 
     */
    public static final String PROPERTY_SALESREPRESENTATIVE = "salesRepresentative";

    /**
     * Property summaryLevel stored in column IsSummary in table M_Product<br>
     * Help: {@literal A summary entity represents a branch in a tree rather than an end-node. Summary entities
     *       are used for reporting and do not have own values.}
     * 
     */
    public static final String PROPERTY_SUMMARYLEVEL = "summaryLevel";

    /**
     * Property stocked stored in column IsStocked in table M_Product<br>
     * Help: {@literal The Stocked check box indicates if this product is stocked by this Organization.}
     * 
     */
    public static final String PROPERTY_STOCKED = "stocked";

    /**
     * Property purchase stored in column IsPurchased in table M_Product<br>
     * Help: {@literal The Purchased check box indicates if this product is purchased by this organization.}
     * 
     */
    public static final String PROPERTY_PURCHASE = "purchase";

    /**
     * Property sale stored in column IsSold in table M_Product<br>
     * Help: {@literal The Sold check box indicates if this product is sold by this organization.}
     * 
     */
    public static final String PROPERTY_SALE = "sale";

    /**
     * Property billOfMaterials stored in column IsBOM in table M_Product<br>
     * Help: {@literal The Bill of Materials check box indicates if this product consists of a bill of
     *       materials.}
     * 
     */
    public static final String PROPERTY_BILLOFMATERIALS = "billOfMaterials";

    /**
     * Property printDetailsOnInvoice stored in column IsInvoicePrintDetails in table M_Product<br>
     * Help: {@literal If “Print Details on Invoice” is checked then the details of the individual elements of
     *       the BOM will be printed on the Invoice.}
     * 
     */
    public static final String PROPERTY_PRINTDETAILSONINVOICE = "printDetailsOnInvoice";

    /**
     * Property printDetailsOnPickList stored in column IsPickListPrintDetails in table M_Product<br>
     * Help: {@literal The Print Details on Pick List indicates that the BOM element products will print on the
     *       Pick List as opposed to this product.}
     * 
     */
    public static final String PROPERTY_PRINTDETAILSONPICKLIST = "printDetailsOnPickList";

    /**
     * Property bOMVerified stored in column IsVerified in table M_Product<br>
     * Help: {@literal Indicates if the bill of materials tree of this product has been verified. Verification
     *       involves a test for cycles within a tree so that there are no infinite loops.}
     * 
     */
    public static final String PROPERTY_BOMVERIFIED = "bOMVerified";

    /**
     * Property productCategory stored in column M_Product_Category_ID in table M_Product<br>
     * Help: {@literal Identifies the category which this product belongs to.  Product categories are used for
     *       pricing.}
     * 
     */
    public static final String PROPERTY_PRODUCTCATEGORY = "productCategory";

    /**
     * Property classification stored in column Classification in table M_Product<br>
     * Help: {@literal The Classification can be used to optionally group products.}
     * 
     */
    public static final String PROPERTY_CLASSIFICATION = "classification";

    /**
     * Property volume stored in column Volume in table M_Product<br>
     * Help: {@literal The Volume indicates the volume of the product in the Volume UOM of the Client}
     * 
     */
    public static final String PROPERTY_VOLUME = "volume";

    /**
     * Property weight stored in column Weight in table M_Product<br>
     * Help: {@literal The Weight indicates the weight  of the product in the Weight UOM of the Client}
     * 
     */
    public static final String PROPERTY_WEIGHT = "weight";

    /**
     * Property shelfWidth stored in column ShelfWidth in table M_Product<br>
     * Help: {@literal The Shelf Width indicates the width dimension required on a shelf for a product}
     * 
     */
    public static final String PROPERTY_SHELFWIDTH = "shelfWidth";

    /**
     * Property shelfHeight stored in column ShelfHeight in table M_Product<br>
     * Help: {@literal The Shelf Height indicates the height dimension required on a shelf for a product}
     * 
     */
    public static final String PROPERTY_SHELFHEIGHT = "shelfHeight";

    /**
     * Property shelfDepth stored in column ShelfDepth in table M_Product<br>
     * Help: {@literal The Shelf Depth indicates the depth dimension required on a shelf for a product}
     * 
     */
    public static final String PROPERTY_SHELFDEPTH = "shelfDepth";

    /**
     * Property unitsPerPallet stored in column UnitsPerPallet in table M_Product<br>
     * Help: {@literal The Units per Pallet indicates the number of units of this product which fit on a pallet.}
     * 
     */
    public static final String PROPERTY_UNITSPERPALLET = "unitsPerPallet";

    /**
     * Property taxCategory stored in column C_TaxCategory_ID in table M_Product<br>
     * Help: {@literal The Tax Category provides a method of grouping similar taxes.  For example, Sales Tax or
     *       Value Added Tax.}
     * 
     */
    public static final String PROPERTY_TAXCATEGORY = "taxCategory";

    /**
     * Property resource stored in column S_Resource_ID in table M_Product<br>
     * Help: {@literal The ID identifies a unique resource}
     * 
     */
    public static final String PROPERTY_RESOURCE = "resource";

    /**
     * Property discontinued stored in column Discontinued in table M_Product<br>
     * Help: {@literal The Discontinued check box indicates a product that has been discontinued.}
     * 
     */
    public static final String PROPERTY_DISCONTINUED = "discontinued";

    /**
     * Property discontinuedBy stored in column DiscontinuedBy in table M_Product<br>
     * Help: {@literal The Discontinued By indicates the individual who discontinued this product}
     * 
     */
    public static final String PROPERTY_DISCONTINUEDBY = "discontinuedBy";

    /**
     * Property processNow stored in column Processing in table M_Product<br>
     * Help: {@literal When this field is set as 'Y' a process is being performed on this record.}
     * 
     */
    public static final String PROPERTY_PROCESSNOW = "processNow";

    /**
     * Property expenseType stored in column S_ExpenseType_ID in table M_Product<br>
     * Help: {@literal Expense report type}
     * 
     */
    public static final String PROPERTY_EXPENSETYPE = "expenseType";

    /**
     * Property productType stored in column ProductType in table M_Product<br>
     * Help: {@literal There are four types of products available. Item type can be used to configure any product
     *       such as raw materials or finished products ready to be sold. An item can be flagged as Socked or
     *       not, can be part of a production process and/or can be a bill of materials. Item type is the only
     *       one for which a cost type calculation can be configured.  Service type can be used to configure
     *       consultancy, transport or insurance services. Service type can be purchased or sold but can not be
     *       stocked. A service can be a bill of materials. Finally Resource and Expense are product types which
     *       can be used to distinguish between different types of products which can be purchased or sold but
     *       make not sense to stock. Expense type can be used to configure travel expenses fto be used while
     *       reporting Employee Expenses.
     *       The fact of using a given product type does not mean a different
     *       accounting. All product types account same way while being purchased, stocked or sold. All of them
     *       use the ledger accounts defined in the Accounting tab of the Product window.}
     * 
     */
    public static final String PROPERTY_PRODUCTTYPE = "productType";

    /**
     * Property imageURL stored in column ImageURL in table M_Product<br>
     * Help: {@literal URL of image; The image is not stored in the database, but retrieved at runtime. The image
     *       can be a gif, jpeg or png.}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_IMAGEURL = "imageURL";

    /**
     * Property descriptionURL stored in column DescriptionURL in table M_Product<br>
     * Help: {@literal URL for the description}
     * 
     */
    public static final String PROPERTY_DESCRIPTIONURL = "descriptionURL";

    /**
     * Property guaranteedDays stored in column GuaranteeDays in table M_Product<br>
     * Help: {@literal If the value is 0, there is no limit to the availability or guarantee, otherwise the
     *       guarantee date is calculated by adding the days to the delivery date.}
     * 
     */
    public static final String PROPERTY_GUARANTEEDDAYS = "guaranteedDays";

    /**
     * Property versionNo stored in column VersionNo in table M_Product<br>
     * Help: {@literal Version Number}
     * 
     */
    public static final String PROPERTY_VERSIONNO = "versionNo";

    /**
     * Property attributeSet stored in column M_AttributeSet_ID in table M_Product<br>
     * Help: {@literal Define Product Attribute Sets to add additional attributes and values to the product. You
     *       need to define a Attribute Set if you want to enable Serial and Lot Number tracking.}
     * 
     */
    public static final String PROPERTY_ATTRIBUTESET = "attributeSet";

    /**
     * Property attributeSetValue stored in column M_AttributeSetInstance_ID in table M_Product<br>
     * Help: {@literal The values of the actual Product Attributes}
     * 
     */
    public static final String PROPERTY_ATTRIBUTESETVALUE = "attributeSetValue";

    /**
     * Property downloadURL stored in column DownloadURL in table M_Product<br>
     * Help: {@literal Semicolon separated list of URLs to be downloaded or distributed}
     * 
     */
    public static final String PROPERTY_DOWNLOADURL = "downloadURL";

    /**
     * Property freightCategory stored in column M_FreightCategory_ID in table M_Product<br>
     * Help: {@literal Freight Categories are used to calculate the Freight for the Shipper selected}
     * 
     */
    public static final String PROPERTY_FREIGHTCATEGORY = "freightCategory";

    /**
     * Property storageBin stored in column M_Locator_ID in table M_Product<br>
     * Help: {@literal The Locator ID indicates where in a Warehouse a product is located.}
     * 
     */
    public static final String PROPERTY_STORAGEBIN = "storageBin";

    /**
     * Property image stored in column AD_Image_ID in table M_Product<br>
     * Help: {@literal Defines a system image}
     * 
     */
    public static final String PROPERTY_IMAGE = "image";

    /**
     * Property businessPartner stored in column C_BPartner_ID in table M_Product<br>
     * Help: {@literal A Business Partner is anyone with whom you transact.  This can include a customer, vendor,
     *       employee or any combination of these.}
     * 
     */
    public static final String PROPERTY_BUSINESSPARTNER = "businessPartner";

    /**
     * Property printPrice stored in column Ispriceprinted in table M_Product<br>
     * Help: {@literal It allows you to print or not the price of a product in a document so you can summary many
     *       products in just one.}
     * 
     */
    public static final String PROPERTY_PRINTPRICE = "printPrice";

    /**
     * Property name2 stored in column Name2 in table M_Product<br>
     * Help: {@literal Additional Name}
     * 
     */
    public static final String PROPERTY_NAME2 = "name2";

    /**
     * Property minimumStock stored in column Stock_Min in table M_Product<br>
     * Help: {@literal Minimum stock of a product}
     * 
     */
    public static final String PROPERTY_MINIMUMSTOCK = "minimumStock";

    /**
     * Property enforceAttribute stored in column Enforce_Attribute in table M_Product<br>
     * Help: {@literal For differing the stock of a product by the attribute}
     * 
     */
    public static final String PROPERTY_ENFORCEATTRIBUTE = "enforceAttribute";

    /**
     * Property calculated stored in column Calculated in table M_Product<br>
     * Help: {@literal Indicates that the record has been calculated.}
     * 
     */
    public static final String PROPERTY_CALCULATED = "calculated";

    /**
     * Property processPlan stored in column MA_Processplan_ID in table M_Product<br>
     * Help: {@literal Indicates a process plan.}
     * 
     */
    public static final String PROPERTY_PROCESSPLAN = "processPlan";

    /**
     * Property production stored in column Production in table M_Product<br>
     * Help: {@literal A product that is used for production plans}
     * 
     */
    public static final String PROPERTY_PRODUCTION = "production";

    /**
     * Property capacity stored in column Capacity in table M_Product<br>
     * Help: {@literal Capacity per day}
     * 
     */
    public static final String PROPERTY_CAPACITY = "capacity";

    /**
     * Property minimumLeadTime stored in column Delaymin in table M_Product<br>
     * Help: {@literal Minimum number of days to complete the transaction}
     * 
     */
    public static final String PROPERTY_MINIMUMLEADTIME = "minimumLeadTime";

    /**
     * Property planner stored in column MRP_Planner_ID in table M_Product<br>
     * Help: {@literal Identifies a planner of the MRP.}
     * 
     */
    public static final String PROPERTY_PLANNER = "planner";

    /**
     * Property planningMethod stored in column MRP_Planningmethod_ID in table M_Product<br>
     * Help: {@literal Identifies a method for filtering the input for planning processes.}
     * 
     */
    public static final String PROPERTY_PLANNINGMETHOD = "planningMethod";

    /**
     * Property maxQuantity stored in column Qtymax in table M_Product<br>
     * Help: {@literal Maximum Quantity}
     * 
     */
    public static final String PROPERTY_MAXQUANTITY = "maxQuantity";

    /**
     * Property minQuantity stored in column Qtymin in table M_Product<br>
     * Help: {@literal Minumun Quantity.}
     * 
     */
    public static final String PROPERTY_MINQUANTITY = "minQuantity";

    /**
     * Property standardQuantity stored in column Qtystd in table M_Product<br>
     * Help: {@literal Quantity Standard}
     * 
     */
    public static final String PROPERTY_STANDARDQUANTITY = "standardQuantity";

    /**
     * Property quantityType stored in column Qtytype in table M_Product<br>
     * Help: {@literal Quantity Type}
     * 
     */
    public static final String PROPERTY_QUANTITYTYPE = "quantityType";

    /**
     * Property safetyStock stored in column Stockmin in table M_Product<br>
     * Help: {@literal Safety Stock}
     * 
     */
    public static final String PROPERTY_SAFETYSTOCK = "safetyStock";

    /**
     * Property useAttributeSetValueAs stored in column Attrsetvaluetype in table M_Product<br>
     * Help: {@literal Permits to define different types of Attribute Set Values, depending on their usage.}
     * 
     */
    public static final String PROPERTY_USEATTRIBUTESETVALUEAS = "useAttributeSetValueAs";

    /**
     * Property isquantityvariable stored in column Isquantityvariable in table M_Product<br>
     * Help: {@literal If checked, goods shipment lines and sales invoice lines with quantity greater than
     *       quantity ordered are permitted for this product.}
     * 
     */
    public static final String PROPERTY_ISQUANTITYVARIABLE = "isquantityvariable";

    /**
     * Property deferredRevenue stored in column Isdeferredrevenue in table M_Product<br>
     * Help: {@literal When flagged revenue of the product will be deferred using the plan and the number of
     *       periods}
     * 
     */
    public static final String PROPERTY_DEFERREDREVENUE = "deferredRevenue";

    /**
     * Property revenuePlanType stored in column Revplantype in table M_Product<br>
     * Help: {@literal Set the type of plan to be used when deferring revenue}
     * 
     */
    public static final String PROPERTY_REVENUEPLANTYPE = "revenuePlanType";

    /**
     * Property periodNumber stored in column Periodnumber in table M_Product<br>
     * Help: {@literal Set here the number of periods to be used when deferring the revenue}
     * 
     */
    public static final String PROPERTY_PERIODNUMBER = "periodNumber";

    /**
     * Property isdeferredexpense stored in column Isdeferredexpense in table M_Product<br>
     * Help: {@literal When flagged expense of the product will be deferred using the plan and the number of
     *       periods}
     * 
     */
    public static final String PROPERTY_ISDEFERREDEXPENSE = "isdeferredexpense";

    /**
     * Property expplantype stored in column Expplantype in table M_Product<br>
     * Help: {@literal Set the type of plan to be used when deferring expense}
     * 
     */
    public static final String PROPERTY_EXPPLANTYPE = "expplantype";

    /**
     * Property periodnumberExp stored in column Periodnumber_Exp in table M_Product<br>
     * Help: {@literal Set here the number of periods to be used when deferring the expense}
     * 
     */
    public static final String PROPERTY_PERIODNUMBEREXP = "periodnumberExp";

    /**
     * Property defaultPeriod stored in column DefaultPeriod in table M_Product<br>
     * Help: {@literal Used for the different calculation methods of default period in a deferred revenue/expense
     *       plan.}
     * 
     */
    public static final String PROPERTY_DEFAULTPERIOD = "defaultPeriod";

    /**
     * Property defaultPeriodExpense stored in column DefaultPeriod_Exp in table M_Product<br>
     * Help: {@literal Used for the different calculation methods of default period in a deferred revenue/expense
     *       plan.}
     * 
     */
    public static final String PROPERTY_DEFAULTPERIODEXPENSE = "defaultPeriodExpense";

    /**
     * Property bookUsingPurchaseOrderPrice stored in column Bookusingpoprice in table M_Product<br>
     * Help: {@literal When checked, the Purchase Order posting will use the Purchase Order Price instead of the
     *       Product Cost.}
     * 
     */
    public static final String PROPERTY_BOOKUSINGPURCHASEORDERPRICE = "bookUsingPurchaseOrderPrice";

    /**
     * Property uOMForWeight stored in column C_Uom_Weight_ID in table M_Product<br>
     * Help: {@literal The Standard UOM for Weight indicates the UOM to use for products referenced by weight in
     *       a document.}
     * 
     */
    public static final String PROPERTY_UOMFORWEIGHT = "uOMForWeight";

    /**
     * Property brand stored in column M_Brand_ID in table M_Product<br>
     * Help: {@literal The brand identifies the Manufacturer or a type of product manufactured by a company under
     *       a particular name.}
     * @deprecated Target entity {@link Brand} is deprecated.

     */
    @Deprecated
    public static final String PROPERTY_BRAND = "brand";

    /**
     * Property isGeneric stored in column IsGeneric in table M_Product<br>
     * Help: {@literal Identifies a generic product. A generic product cannot be purchased or sold.}
     * 
     */
    public static final String PROPERTY_ISGENERIC = "isGeneric";

    /**
     * Property genericProduct stored in column Generic_Product_ID in table M_Product<br>
     * Help: {@literal Generic product related to this product. The product will inherit all the properties
     *       defined in the generic product. Such as taxes or price.}
     * 
     */
    public static final String PROPERTY_GENERICPRODUCT = "genericProduct";

    /**
     * Property createVariants stored in column CreateVariants in table M_Product
     * 
     */
    public static final String PROPERTY_CREATEVARIANTS = "createVariants";

    /**
     * Property characteristicDescription stored in column Characteristic_Desc in table M_Product<br>
     * Help: {@literal Text with the concatenation of the characteristics and its values assigned to the
     *       product.}
     * 
     */
    public static final String PROPERTY_CHARACTERISTICDESCRIPTION = "characteristicDescription";

    /**
     * Property updateInvariants stored in column Updateinvariants in table M_Product
     * 
     */
    public static final String PROPERTY_UPDATEINVARIANTS = "updateInvariants";

    /**
     * Property manageVariants stored in column ManageVariants in table M_Product
     * 
     */
    public static final String PROPERTY_MANAGEVARIANTS = "manageVariants";

    /**
     * Property includedProductCategories stored in column Prod_Cat_Selection in table M_Product<br>
     * Help: {@literal Defines the way Product Categories will be selected (including or excluding the taken
     *       ones)}
     * 
     */
    public static final String PROPERTY_INCLUDEDPRODUCTCATEGORIES = "includedProductCategories";

    /**
     * Property includedProducts stored in column Product_Selection in table M_Product<br>
     * Help: {@literal Defines the way Products will be selected (including or excluding the taken ones)}
     * 
     */
    public static final String PROPERTY_INCLUDEDPRODUCTS = "includedProducts";

    /**
     * Property printDescription stored in column Print_Description in table M_Product<br>
     * Help: {@literal If selected, the ticket footer printing should add the description of the Service}
     * 
     */
    public static final String PROPERTY_PRINTDESCRIPTION = "printDescription";

    /**
     * Property returnable stored in column Returnable in table M_Product<br>
     * Help: {@literal Indicates if the Product is Returnable or not}
     * 
     */
    public static final String PROPERTY_RETURNABLE = "returnable";

    /**
     * Property overdueReturnDays stored in column Overdue_Return_Days in table M_Product<br>
     * Help: {@literal Indicates if a Service is Returnable how many days has the customer to return it after
     *       buying}
     * 
     */
    public static final String PROPERTY_OVERDUERETURNDAYS = "overdueReturnDays";

    /**
     * Property ispricerulebased stored in column Ispricerulebased in table M_Product<br>
     * Help: {@literal Indicates if the Service has a fixed price or it obtains the price based on a Service
     *       Price Rule.}
     * 
     */
    public static final String PROPERTY_ISPRICERULEBASED = "ispricerulebased";

    /**
     * Property uniquePerDocument stored in column Unique_Per_Document in table M_Product<br>
     * Help: {@literal This flag indicates if the Service can only be added once in a ticket. This Service could
     *       be related to zero, one or more than one lines of the ticket.}
     * 
     */
    public static final String PROPERTY_UNIQUEPERDOCUMENT = "uniquePerDocument";

    /**
     * Property relateprodcattoservice stored in column Relateprodcattoservice in table M_Product<br>
     * Help: {@literal P&E to include/exclude product categories in Products tab to indicate that the Service
     *       could be applied on those product categories.
     *       
     *       This P&E is only visible for Service Type Products}
     * 
     */
    public static final String PROPERTY_RELATEPRODCATTOSERVICE = "relateprodcattoservice";

    /**
     * Property relateprodtoservice stored in column Relateprodtoservice in table M_Product<br>
     * Help: {@literal P&E to include/exclude products in Products tab to indicate that the Service could be
     *       applied on those products.
     *       
     *       This P&E is only visible for Service Type Products}
     * 
     */
    public static final String PROPERTY_RELATEPRODTOSERVICE = "relateprodtoservice";

    /**
     * Property linkedToProduct stored in column Islinkedtoproduct in table M_Product<br>
     * Help: {@literal The service can be linked to a Product. If so, when adding the product to a Sales Order,
     *       the related service product could be added to the Sales Order also, following special rules to set
     *       the quantity to be added and the price of the service, both of them based on the product.}
     * 
     */
    public static final String PROPERTY_LINKEDTOPRODUCT = "linkedToProduct";

    /**
     * Property quantityRule stored in column Quantity_Rule in table M_Product<br>
     * Help: {@literal There are two values:
     *        * As per product: One relation line per each different product line
     *       will be created.
     *        * Unique quantity: Only one relation line will be created with the total amount of
     *       all related lines.}
     * 
     */
    public static final String PROPERTY_QUANTITYRULE = "quantityRule";

    /**
     * Property allowDeferredSell stored in column Allow_Deferred_Sell in table M_Product<br>
     * Help: {@literal Boolean field available for product of type service that defines whether the service can
     *       be linked to a product in a non-active ticket or not}
     * 
     */
    public static final String PROPERTY_ALLOWDEFERREDSELL = "allowDeferredSell";

    /**
     * Property deferredSellMaxDays stored in column Deferred_Sell_Max_Days in table M_Product<br>
     * Help: {@literal Defines in the case of services that does allow deferred sell the maximum days after the
     *       original product was sold, this service can be linked with it.}
     * 
     */
    public static final String PROPERTY_DEFERREDSELLMAXDAYS = "deferredSellMaxDays";

    /**
     * Property productStatus stored in column M_Product_Status_ID in table M_Product<br>
     * Help: {@literal Product Lifecycle Management Status}
     * 
     */
    public static final String PROPERTY_PRODUCTSTATUS = "productStatus";

    /**
     * Property modifyTax stored in column Ismodifytax in table M_Product<br>
     * Help: {@literal The service can modify the tax of the linked products. If so, when adding the product to a
     *       Sales Order, the related service product can assign a different tax category to the linked products
     *       following the service product configuration.}
     * 
     */
    public static final String PROPERTY_MODIFYTAX = "modifyTax";

    /**
     * Property relateprodcattaxtoservice stored in column Relateprodcattaxtoservice in table M_Product<br>
     * Help: {@literal Process to define the Modify Tax configuration for the selected services}
     * 
     */
    public static final String PROPERTY_RELATEPRODCATTAXTOSERVICE = "relateprodcattaxtoservice";

    /**
     * Property copyservicemodifytaxconfig stored in column Copyservicemodifytaxconfig in table M_Product<br>
     * Help: {@literal Process to copy configuration from current service to selected services. This process
     *       erases existing configuration for the target service/s.}
     * 
     */
    public static final String PROPERTY_COPYSERVICEMODIFYTAXCONFIG = "copyservicemodifytaxconfig";

    /**
     * Property approvedVendorList stored in table M_Product
     * 
     */
    public static final String PROPERTY_APPROVEDVENDORLIST = "approvedVendorList";

    /**
     * Property landedCostTypeList stored in table M_Product
     * 
     */
    public static final String PROPERTY_LANDEDCOSTTYPELIST = "landedCostTypeList";

    /**
     * Property materialMgmtCostingList stored in table M_Product
     * 
     */
    public static final String PROPERTY_MATERIALMGMTCOSTINGLIST = "materialMgmtCostingList";

    /**
     * Property materialMgmtMaterialTransactionList stored in table M_Product
     * 
     */
    public static final String PROPERTY_MATERIALMGMTMATERIALTRANSACTIONLIST = "materialMgmtMaterialTransactionList";

    /**
     * Property orderLineList stored in table M_Product
     * 
     */
    public static final String PROPERTY_ORDERLINELIST = "orderLineList";

    /**
     * Property orderLineAccountingDimensionList stored in table M_Product
     * 
     */
    public static final String PROPERTY_ORDERLINEACCOUNTINGDIMENSIONLIST = "orderLineAccountingDimensionList";

    /**
     * Property pricingDiscountList stored in table M_Product
     * 
     */
    public static final String PROPERTY_PRICINGDISCOUNTLIST = "pricingDiscountList";

    /**
     * Property pricingProductPriceList stored in table M_Product
     * 
     */
    public static final String PROPERTY_PRICINGPRODUCTPRICELIST = "pricingProductPriceList";

    /**
     * Property productGenericProductList stored in table M_Product
     * 
     */
    public static final String PROPERTY_PRODUCTGENERICPRODUCTLIST = "productGenericProductList";

    /**
     * Property productAUMList stored in table M_Product
     * 
     */
    public static final String PROPERTY_PRODUCTAUMLIST = "productAUMList";

    /**
     * Property productAccountsList stored in table M_Product
     * 
     */
    public static final String PROPERTY_PRODUCTACCOUNTSLIST = "productAccountsList";

    /**
     * Property productBOMList stored in table M_Product
     * 
     */
    public static final String PROPERTY_PRODUCTBOMLIST = "productBOMList";

    /**
     * Property productBOMBOMProductList stored in table M_Product
     * 
     */
    public static final String PROPERTY_PRODUCTBOMBOMPRODUCTLIST = "productBOMBOMProductList";

    /**
     * Property productCharacteristicList stored in table M_Product
     * 
     */
    public static final String PROPERTY_PRODUCTCHARACTERISTICLIST = "productCharacteristicList";

    /**
     * Property productCharacteristicValueList stored in table M_Product
     * 
     */
    public static final String PROPERTY_PRODUCTCHARACTERISTICVALUELIST = "productCharacteristicValueList";

    /**
     * Property productOrgList stored in table M_Product
     * 
     */
    public static final String PROPERTY_PRODUCTORGLIST = "productOrgList";

    /**
     * Property productStockViewList stored in table M_Product
     * 
     */
    public static final String PROPERTY_PRODUCTSTOCKVIEWLIST = "productStockViewList";

    /**
     * Property productSubstituteList stored in table M_Product
     * 
     */
    public static final String PROPERTY_PRODUCTSUBSTITUTELIST = "productSubstituteList";

    /**
     * Property productTrlList stored in table M_Product
     * 
     */
    public static final String PROPERTY_PRODUCTTRLLIST = "productTrlList";

    /**
     * Property productUOMList stored in table M_Product
     * 
     */
    public static final String PROPERTY_PRODUCTUOMLIST = "productUOMList";

    /**
     * Property serviceProductList stored in table M_Product
     * 
     */
    public static final String PROPERTY_SERVICEPRODUCTLIST = "serviceProductList";


    public Product() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_SUMMARYLEVEL, false);
        setDefaultValue(PROPERTY_STOCKED, true);
        setDefaultValue(PROPERTY_PURCHASE, true);
        setDefaultValue(PROPERTY_SALE, true);
        setDefaultValue(PROPERTY_BILLOFMATERIALS, false);
        setDefaultValue(PROPERTY_PRINTDETAILSONINVOICE, false);
        setDefaultValue(PROPERTY_PRINTDETAILSONPICKLIST, false);
        setDefaultValue(PROPERTY_BOMVERIFIED, false);
        setDefaultValue(PROPERTY_DISCONTINUED, false);
        setDefaultValue(PROPERTY_PROCESSNOW, false);
        setDefaultValue(PROPERTY_PRODUCTTYPE, "I");
        setDefaultValue(PROPERTY_PRINTPRICE, true);
        setDefaultValue(PROPERTY_ENFORCEATTRIBUTE, false);
        setDefaultValue(PROPERTY_CALCULATED, false);
        setDefaultValue(PROPERTY_PRODUCTION, false);
        setDefaultValue(PROPERTY_QUANTITYTYPE, false);
        setDefaultValue(PROPERTY_ISQUANTITYVARIABLE, false);
        setDefaultValue(PROPERTY_DEFERREDREVENUE, false);
        setDefaultValue(PROPERTY_ISDEFERREDEXPENSE, false);
        setDefaultValue(PROPERTY_BOOKUSINGPURCHASEORDERPRICE, false);
        setDefaultValue(PROPERTY_ISGENERIC, false);
        setDefaultValue(PROPERTY_CREATEVARIANTS, false);
        setDefaultValue(PROPERTY_UPDATEINVARIANTS, false);
        setDefaultValue(PROPERTY_MANAGEVARIANTS, false);
        setDefaultValue(PROPERTY_PRINTDESCRIPTION, false);
        setDefaultValue(PROPERTY_RETURNABLE, true);
        setDefaultValue(PROPERTY_ISPRICERULEBASED, false);
        setDefaultValue(PROPERTY_UNIQUEPERDOCUMENT, false);
        setDefaultValue(PROPERTY_RELATEPRODCATTOSERVICE, false);
        setDefaultValue(PROPERTY_RELATEPRODTOSERVICE, false);
        setDefaultValue(PROPERTY_LINKEDTOPRODUCT, false);
        setDefaultValue(PROPERTY_ALLOWDEFERREDSELL, false);
        setDefaultValue(PROPERTY_MODIFYTAX, false);
        setDefaultValue(PROPERTY_RELATEPRODCATTAXTOSERVICE, false);
        setDefaultValue(PROPERTY_COPYSERVICEMODIFYTAXCONFIG, false);
        setDefaultValue(PROPERTY_APPROVEDVENDORLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_LANDEDCOSTTYPELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MATERIALMGMTCOSTINGLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MATERIALMGMTMATERIALTRANSACTIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ORDERLINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_ORDERLINEACCOUNTINGDIMENSIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRICINGDISCOUNTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRICINGPRODUCTPRICELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRODUCTGENERICPRODUCTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRODUCTAUMLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRODUCTACCOUNTSLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRODUCTBOMLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRODUCTBOMBOMPRODUCTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRODUCTCHARACTERISTICLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRODUCTCHARACTERISTICVALUELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRODUCTORGLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRODUCTSTOCKVIEWLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRODUCTSUBSTITUTELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRODUCTTRLLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_PRODUCTUOMLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_SERVICEPRODUCTLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Product#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Product#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Product#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Product#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Product#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Product#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Product#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Product#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Product#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Product#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Product#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Product#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Product#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Product#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Product#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Product#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Product#PROPERTY_SEARCHKEY
     * 
     */
    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }
    /**
     * @see Product#PROPERTY_SEARCHKEY
     * 
     */
    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    /**
     * @see Product#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Product#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Product#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Product#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Product#PROPERTY_COMMENTS
     * 
     */
    public String getComments() {
        return (String) get(PROPERTY_COMMENTS);
    }
    /**
     * @see Product#PROPERTY_COMMENTS
     * 
     */
    public void setComments(String comments) {
        set(PROPERTY_COMMENTS, comments);
    }

    /**
     * @see Product#PROPERTY_HELPCOMMENT
     * 
     */
    public String getHelpComment() {
        return (String) get(PROPERTY_HELPCOMMENT);
    }
    /**
     * @see Product#PROPERTY_HELPCOMMENT
     * 
     */
    public void setHelpComment(String helpComment) {
        set(PROPERTY_HELPCOMMENT, helpComment);
    }

    /**
     * @see Product#PROPERTY_UPCEAN
     * 
     */
    public String getUPCEAN() {
        return (String) get(PROPERTY_UPCEAN);
    }
    /**
     * @see Product#PROPERTY_UPCEAN
     * 
     */
    public void setUPCEAN(String uPCEAN) {
        set(PROPERTY_UPCEAN, uPCEAN);
    }

    /**
     * @see Product#PROPERTY_SKU
     * 
     */
    public String getSKU() {
        return (String) get(PROPERTY_SKU);
    }
    /**
     * @see Product#PROPERTY_SKU
     * 
     */
    public void setSKU(String sKU) {
        set(PROPERTY_SKU, sKU);
    }

    /**
     * @see Product#PROPERTY_UOM
     * 
     */
    public UOM getUOM() {
        return (UOM) get(PROPERTY_UOM);
    }
    /**
     * @see Product#PROPERTY_UOM
     * 
     */
    public void setUOM(UOM uOM) {
        set(PROPERTY_UOM, uOM);
    }

    /**
     * @see Product#PROPERTY_SALESREPRESENTATIVE
     * 
     */
    public User getSalesRepresentative() {
        return (User) get(PROPERTY_SALESREPRESENTATIVE);
    }
    /**
     * @see Product#PROPERTY_SALESREPRESENTATIVE
     * 
     */
    public void setSalesRepresentative(User salesRepresentative) {
        set(PROPERTY_SALESREPRESENTATIVE, salesRepresentative);
    }

    /**
     * @see Product#PROPERTY_SUMMARYLEVEL
     * 
     */
    public Boolean isSummaryLevel() {
        return (Boolean) get(PROPERTY_SUMMARYLEVEL);
    }
    /**
     * @see Product#PROPERTY_SUMMARYLEVEL
     * 
     */
    public void setSummaryLevel(Boolean summaryLevel) {
        set(PROPERTY_SUMMARYLEVEL, summaryLevel);
    }

    /**
     * @see Product#PROPERTY_STOCKED
     * 
     */
    public Boolean isStocked() {
        return (Boolean) get(PROPERTY_STOCKED);
    }
    /**
     * @see Product#PROPERTY_STOCKED
     * 
     */
    public void setStocked(Boolean stocked) {
        set(PROPERTY_STOCKED, stocked);
    }

    /**
     * @see Product#PROPERTY_PURCHASE
     * 
     */
    public Boolean isPurchase() {
        return (Boolean) get(PROPERTY_PURCHASE);
    }
    /**
     * @see Product#PROPERTY_PURCHASE
     * 
     */
    public void setPurchase(Boolean purchase) {
        set(PROPERTY_PURCHASE, purchase);
    }

    /**
     * @see Product#PROPERTY_SALE
     * 
     */
    public Boolean isSale() {
        return (Boolean) get(PROPERTY_SALE);
    }
    /**
     * @see Product#PROPERTY_SALE
     * 
     */
    public void setSale(Boolean sale) {
        set(PROPERTY_SALE, sale);
    }

    /**
     * @see Product#PROPERTY_BILLOFMATERIALS
     * 
     */
    public Boolean isBillOfMaterials() {
        return (Boolean) get(PROPERTY_BILLOFMATERIALS);
    }
    /**
     * @see Product#PROPERTY_BILLOFMATERIALS
     * 
     */
    public void setBillOfMaterials(Boolean billOfMaterials) {
        set(PROPERTY_BILLOFMATERIALS, billOfMaterials);
    }

    /**
     * @see Product#PROPERTY_PRINTDETAILSONINVOICE
     * 
     */
    public Boolean isPrintDetailsOnInvoice() {
        return (Boolean) get(PROPERTY_PRINTDETAILSONINVOICE);
    }
    /**
     * @see Product#PROPERTY_PRINTDETAILSONINVOICE
     * 
     */
    public void setPrintDetailsOnInvoice(Boolean printDetailsOnInvoice) {
        set(PROPERTY_PRINTDETAILSONINVOICE, printDetailsOnInvoice);
    }

    /**
     * @see Product#PROPERTY_PRINTDETAILSONPICKLIST
     * 
     */
    public Boolean isPrintDetailsOnPickList() {
        return (Boolean) get(PROPERTY_PRINTDETAILSONPICKLIST);
    }
    /**
     * @see Product#PROPERTY_PRINTDETAILSONPICKLIST
     * 
     */
    public void setPrintDetailsOnPickList(Boolean printDetailsOnPickList) {
        set(PROPERTY_PRINTDETAILSONPICKLIST, printDetailsOnPickList);
    }

    /**
     * @see Product#PROPERTY_BOMVERIFIED
     * 
     */
    public Boolean isBOMVerified() {
        return (Boolean) get(PROPERTY_BOMVERIFIED);
    }
    /**
     * @see Product#PROPERTY_BOMVERIFIED
     * 
     */
    public void setBOMVerified(Boolean bOMVerified) {
        set(PROPERTY_BOMVERIFIED, bOMVerified);
    }

    /**
     * @see Product#PROPERTY_PRODUCTCATEGORY
     * 
     */
    public ProductCategory getProductCategory() {
        return (ProductCategory) get(PROPERTY_PRODUCTCATEGORY);
    }
    /**
     * @see Product#PROPERTY_PRODUCTCATEGORY
     * 
     */
    public void setProductCategory(ProductCategory productCategory) {
        set(PROPERTY_PRODUCTCATEGORY, productCategory);
    }

    /**
     * @see Product#PROPERTY_CLASSIFICATION
     * 
     */
    public String getClassification() {
        return (String) get(PROPERTY_CLASSIFICATION);
    }
    /**
     * @see Product#PROPERTY_CLASSIFICATION
     * 
     */
    public void setClassification(String classification) {
        set(PROPERTY_CLASSIFICATION, classification);
    }

    /**
     * @see Product#PROPERTY_VOLUME
     * 
     */
    public BigDecimal getVolume() {
        return (BigDecimal) get(PROPERTY_VOLUME);
    }
    /**
     * @see Product#PROPERTY_VOLUME
     * 
     */
    public void setVolume(BigDecimal volume) {
        set(PROPERTY_VOLUME, volume);
    }

    /**
     * @see Product#PROPERTY_WEIGHT
     * 
     */
    public BigDecimal getWeight() {
        return (BigDecimal) get(PROPERTY_WEIGHT);
    }
    /**
     * @see Product#PROPERTY_WEIGHT
     * 
     */
    public void setWeight(BigDecimal weight) {
        set(PROPERTY_WEIGHT, weight);
    }

    /**
     * @see Product#PROPERTY_SHELFWIDTH
     * 
     */
    public BigDecimal getShelfWidth() {
        return (BigDecimal) get(PROPERTY_SHELFWIDTH);
    }
    /**
     * @see Product#PROPERTY_SHELFWIDTH
     * 
     */
    public void setShelfWidth(BigDecimal shelfWidth) {
        set(PROPERTY_SHELFWIDTH, shelfWidth);
    }

    /**
     * @see Product#PROPERTY_SHELFHEIGHT
     * 
     */
    public BigDecimal getShelfHeight() {
        return (BigDecimal) get(PROPERTY_SHELFHEIGHT);
    }
    /**
     * @see Product#PROPERTY_SHELFHEIGHT
     * 
     */
    public void setShelfHeight(BigDecimal shelfHeight) {
        set(PROPERTY_SHELFHEIGHT, shelfHeight);
    }

    /**
     * @see Product#PROPERTY_SHELFDEPTH
     * 
     */
    public BigDecimal getShelfDepth() {
        return (BigDecimal) get(PROPERTY_SHELFDEPTH);
    }
    /**
     * @see Product#PROPERTY_SHELFDEPTH
     * 
     */
    public void setShelfDepth(BigDecimal shelfDepth) {
        set(PROPERTY_SHELFDEPTH, shelfDepth);
    }

    /**
     * @see Product#PROPERTY_UNITSPERPALLET
     * 
     */
    public Long getUnitsPerPallet() {
        return (Long) get(PROPERTY_UNITSPERPALLET);
    }
    /**
     * @see Product#PROPERTY_UNITSPERPALLET
     * 
     */
    public void setUnitsPerPallet(Long unitsPerPallet) {
        set(PROPERTY_UNITSPERPALLET, unitsPerPallet);
    }

    /**
     * @see Product#PROPERTY_TAXCATEGORY
     * 
     */
    public TaxCategory getTaxCategory() {
        return (TaxCategory) get(PROPERTY_TAXCATEGORY);
    }
    /**
     * @see Product#PROPERTY_TAXCATEGORY
     * 
     */
    public void setTaxCategory(TaxCategory taxCategory) {
        set(PROPERTY_TAXCATEGORY, taxCategory);
    }

    /**
     * @see Product#PROPERTY_RESOURCE
     * 
     */
    public Resource getResource() {
        return (Resource) get(PROPERTY_RESOURCE);
    }
    /**
     * @see Product#PROPERTY_RESOURCE
     * 
     */
    public void setResource(Resource resource) {
        set(PROPERTY_RESOURCE, resource);
    }

    /**
     * @see Product#PROPERTY_DISCONTINUED
     * 
     */
    public Boolean isDiscontinued() {
        return (Boolean) get(PROPERTY_DISCONTINUED);
    }
    /**
     * @see Product#PROPERTY_DISCONTINUED
     * 
     */
    public void setDiscontinued(Boolean discontinued) {
        set(PROPERTY_DISCONTINUED, discontinued);
    }

    /**
     * @see Product#PROPERTY_DISCONTINUEDBY
     * 
     */
    public Date getDiscontinuedBy() {
        return (Date) get(PROPERTY_DISCONTINUEDBY);
    }
    /**
     * @see Product#PROPERTY_DISCONTINUEDBY
     * 
     */
    public void setDiscontinuedBy(Date discontinuedBy) {
        set(PROPERTY_DISCONTINUEDBY, discontinuedBy);
    }

    /**
     * @see Product#PROPERTY_PROCESSNOW
     * 
     */
    public Boolean isProcessNow() {
        return (Boolean) get(PROPERTY_PROCESSNOW);
    }
    /**
     * @see Product#PROPERTY_PROCESSNOW
     * 
     */
    public void setProcessNow(Boolean processNow) {
        set(PROPERTY_PROCESSNOW, processNow);
    }

    /**
     * @see Product#PROPERTY_EXPENSETYPE
     * 
     */
    public ExpenseType getExpenseType() {
        return (ExpenseType) get(PROPERTY_EXPENSETYPE);
    }
    /**
     * @see Product#PROPERTY_EXPENSETYPE
     * 
     */
    public void setExpenseType(ExpenseType expenseType) {
        set(PROPERTY_EXPENSETYPE, expenseType);
    }

    /**
     * @see Product#PROPERTY_PRODUCTTYPE
     * 
     */
    public String getProductType() {
        return (String) get(PROPERTY_PRODUCTTYPE);
    }
    /**
     * @see Product#PROPERTY_PRODUCTTYPE
     * 
     */
    public void setProductType(String productType) {
        set(PROPERTY_PRODUCTTYPE, productType);
    }

    /**
     * @see Product#PROPERTY_IMAGEURL
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public String getImageURL() {
        return (String) get(PROPERTY_IMAGEURL);
    }
    /**
     * @see Product#PROPERTY_IMAGEURL
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setImageURL(String imageURL) {
        set(PROPERTY_IMAGEURL, imageURL);
    }

    /**
     * @see Product#PROPERTY_DESCRIPTIONURL
     * 
     */
    public String getDescriptionURL() {
        return (String) get(PROPERTY_DESCRIPTIONURL);
    }
    /**
     * @see Product#PROPERTY_DESCRIPTIONURL
     * 
     */
    public void setDescriptionURL(String descriptionURL) {
        set(PROPERTY_DESCRIPTIONURL, descriptionURL);
    }

    /**
     * @see Product#PROPERTY_GUARANTEEDDAYS
     * 
     */
    public Long getGuaranteedDays() {
        return (Long) get(PROPERTY_GUARANTEEDDAYS);
    }
    /**
     * @see Product#PROPERTY_GUARANTEEDDAYS
     * 
     */
    public void setGuaranteedDays(Long guaranteedDays) {
        set(PROPERTY_GUARANTEEDDAYS, guaranteedDays);
    }

    /**
     * @see Product#PROPERTY_VERSIONNO
     * 
     */
    public String getVersionNo() {
        return (String) get(PROPERTY_VERSIONNO);
    }
    /**
     * @see Product#PROPERTY_VERSIONNO
     * 
     */
    public void setVersionNo(String versionNo) {
        set(PROPERTY_VERSIONNO, versionNo);
    }

    /**
     * @see Product#PROPERTY_ATTRIBUTESET
     * 
     */
    public AttributeSet getAttributeSet() {
        return (AttributeSet) get(PROPERTY_ATTRIBUTESET);
    }
    /**
     * @see Product#PROPERTY_ATTRIBUTESET
     * 
     */
    public void setAttributeSet(AttributeSet attributeSet) {
        set(PROPERTY_ATTRIBUTESET, attributeSet);
    }

    /**
     * @see Product#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public AttributeSetInstance getAttributeSetValue() {
        return (AttributeSetInstance) get(PROPERTY_ATTRIBUTESETVALUE);
    }
    /**
     * @see Product#PROPERTY_ATTRIBUTESETVALUE
     * 
     */
    public void setAttributeSetValue(AttributeSetInstance attributeSetValue) {
        set(PROPERTY_ATTRIBUTESETVALUE, attributeSetValue);
    }

    /**
     * @see Product#PROPERTY_DOWNLOADURL
     * 
     */
    public String getDownloadURL() {
        return (String) get(PROPERTY_DOWNLOADURL);
    }
    /**
     * @see Product#PROPERTY_DOWNLOADURL
     * 
     */
    public void setDownloadURL(String downloadURL) {
        set(PROPERTY_DOWNLOADURL, downloadURL);
    }

    /**
     * @see Product#PROPERTY_FREIGHTCATEGORY
     * 
     */
    public FreightCategory getFreightCategory() {
        return (FreightCategory) get(PROPERTY_FREIGHTCATEGORY);
    }
    /**
     * @see Product#PROPERTY_FREIGHTCATEGORY
     * 
     */
    public void setFreightCategory(FreightCategory freightCategory) {
        set(PROPERTY_FREIGHTCATEGORY, freightCategory);
    }

    /**
     * @see Product#PROPERTY_STORAGEBIN
     * 
     */
    public Locator getStorageBin() {
        return (Locator) get(PROPERTY_STORAGEBIN);
    }
    /**
     * @see Product#PROPERTY_STORAGEBIN
     * 
     */
    public void setStorageBin(Locator storageBin) {
        set(PROPERTY_STORAGEBIN, storageBin);
    }

    /**
     * @see Product#PROPERTY_IMAGE
     * 
     */
    public Image getImage() {
        return (Image) get(PROPERTY_IMAGE);
    }
    /**
     * @see Product#PROPERTY_IMAGE
     * 
     */
    public void setImage(Image image) {
        set(PROPERTY_IMAGE, image);
    }

    /**
     * @see Product#PROPERTY_BUSINESSPARTNER
     * 
     */
    public BusinessPartner getBusinessPartner() {
        return (BusinessPartner) get(PROPERTY_BUSINESSPARTNER);
    }
    /**
     * @see Product#PROPERTY_BUSINESSPARTNER
     * 
     */
    public void setBusinessPartner(BusinessPartner businessPartner) {
        set(PROPERTY_BUSINESSPARTNER, businessPartner);
    }

    /**
     * @see Product#PROPERTY_PRINTPRICE
     * 
     */
    public Boolean isPrintPrice() {
        return (Boolean) get(PROPERTY_PRINTPRICE);
    }
    /**
     * @see Product#PROPERTY_PRINTPRICE
     * 
     */
    public void setPrintPrice(Boolean printPrice) {
        set(PROPERTY_PRINTPRICE, printPrice);
    }

    /**
     * @see Product#PROPERTY_NAME2
     * 
     */
    public String getName2() {
        return (String) get(PROPERTY_NAME2);
    }
    /**
     * @see Product#PROPERTY_NAME2
     * 
     */
    public void setName2(String name2) {
        set(PROPERTY_NAME2, name2);
    }

    /**
     * @see Product#PROPERTY_MINIMUMSTOCK
     * 
     */
    public BigDecimal getMinimumStock() {
        return (BigDecimal) get(PROPERTY_MINIMUMSTOCK);
    }
    /**
     * @see Product#PROPERTY_MINIMUMSTOCK
     * 
     */
    public void setMinimumStock(BigDecimal minimumStock) {
        set(PROPERTY_MINIMUMSTOCK, minimumStock);
    }

    /**
     * @see Product#PROPERTY_ENFORCEATTRIBUTE
     * 
     */
    public Boolean isEnforceAttribute() {
        return (Boolean) get(PROPERTY_ENFORCEATTRIBUTE);
    }
    /**
     * @see Product#PROPERTY_ENFORCEATTRIBUTE
     * 
     */
    public void setEnforceAttribute(Boolean enforceAttribute) {
        set(PROPERTY_ENFORCEATTRIBUTE, enforceAttribute);
    }

    /**
     * @see Product#PROPERTY_CALCULATED
     * 
     */
    public Boolean isCalculated() {
        return (Boolean) get(PROPERTY_CALCULATED);
    }
    /**
     * @see Product#PROPERTY_CALCULATED
     * 
     */
    public void setCalculated(Boolean calculated) {
        set(PROPERTY_CALCULATED, calculated);
    }

    /**
     * @see Product#PROPERTY_PROCESSPLAN
     * 
     */
    public ProcessPlan getProcessPlan() {
        return (ProcessPlan) get(PROPERTY_PROCESSPLAN);
    }
    /**
     * @see Product#PROPERTY_PROCESSPLAN
     * 
     */
    public void setProcessPlan(ProcessPlan processPlan) {
        set(PROPERTY_PROCESSPLAN, processPlan);
    }

    /**
     * @see Product#PROPERTY_PRODUCTION
     * 
     */
    public Boolean isProduction() {
        return (Boolean) get(PROPERTY_PRODUCTION);
    }
    /**
     * @see Product#PROPERTY_PRODUCTION
     * 
     */
    public void setProduction(Boolean production) {
        set(PROPERTY_PRODUCTION, production);
    }

    /**
     * @see Product#PROPERTY_CAPACITY
     * 
     */
    public BigDecimal getCapacity() {
        return (BigDecimal) get(PROPERTY_CAPACITY);
    }
    /**
     * @see Product#PROPERTY_CAPACITY
     * 
     */
    public void setCapacity(BigDecimal capacity) {
        set(PROPERTY_CAPACITY, capacity);
    }

    /**
     * @see Product#PROPERTY_MINIMUMLEADTIME
     * 
     */
    public BigDecimal getMinimumLeadTime() {
        return (BigDecimal) get(PROPERTY_MINIMUMLEADTIME);
    }
    /**
     * @see Product#PROPERTY_MINIMUMLEADTIME
     * 
     */
    public void setMinimumLeadTime(BigDecimal minimumLeadTime) {
        set(PROPERTY_MINIMUMLEADTIME, minimumLeadTime);
    }

    /**
     * @see Product#PROPERTY_PLANNER
     * 
     */
    public Planner getPlanner() {
        return (Planner) get(PROPERTY_PLANNER);
    }
    /**
     * @see Product#PROPERTY_PLANNER
     * 
     */
    public void setPlanner(Planner planner) {
        set(PROPERTY_PLANNER, planner);
    }

    /**
     * @see Product#PROPERTY_PLANNINGMETHOD
     * 
     */
    public PlanningMethod getPlanningMethod() {
        return (PlanningMethod) get(PROPERTY_PLANNINGMETHOD);
    }
    /**
     * @see Product#PROPERTY_PLANNINGMETHOD
     * 
     */
    public void setPlanningMethod(PlanningMethod planningMethod) {
        set(PROPERTY_PLANNINGMETHOD, planningMethod);
    }

    /**
     * @see Product#PROPERTY_MAXQUANTITY
     * 
     */
    public BigDecimal getMaxQuantity() {
        return (BigDecimal) get(PROPERTY_MAXQUANTITY);
    }
    /**
     * @see Product#PROPERTY_MAXQUANTITY
     * 
     */
    public void setMaxQuantity(BigDecimal maxQuantity) {
        set(PROPERTY_MAXQUANTITY, maxQuantity);
    }

    /**
     * @see Product#PROPERTY_MINQUANTITY
     * 
     */
    public BigDecimal getMinQuantity() {
        return (BigDecimal) get(PROPERTY_MINQUANTITY);
    }
    /**
     * @see Product#PROPERTY_MINQUANTITY
     * 
     */
    public void setMinQuantity(BigDecimal minQuantity) {
        set(PROPERTY_MINQUANTITY, minQuantity);
    }

    /**
     * @see Product#PROPERTY_STANDARDQUANTITY
     * 
     */
    public BigDecimal getStandardQuantity() {
        return (BigDecimal) get(PROPERTY_STANDARDQUANTITY);
    }
    /**
     * @see Product#PROPERTY_STANDARDQUANTITY
     * 
     */
    public void setStandardQuantity(BigDecimal standardQuantity) {
        set(PROPERTY_STANDARDQUANTITY, standardQuantity);
    }

    /**
     * @see Product#PROPERTY_QUANTITYTYPE
     * 
     */
    public Boolean isQuantityType() {
        return (Boolean) get(PROPERTY_QUANTITYTYPE);
    }
    /**
     * @see Product#PROPERTY_QUANTITYTYPE
     * 
     */
    public void setQuantityType(Boolean quantityType) {
        set(PROPERTY_QUANTITYTYPE, quantityType);
    }

    /**
     * @see Product#PROPERTY_SAFETYSTOCK
     * 
     */
    public BigDecimal getSafetyStock() {
        return (BigDecimal) get(PROPERTY_SAFETYSTOCK);
    }
    /**
     * @see Product#PROPERTY_SAFETYSTOCK
     * 
     */
    public void setSafetyStock(BigDecimal safetyStock) {
        set(PROPERTY_SAFETYSTOCK, safetyStock);
    }

    /**
     * @see Product#PROPERTY_USEATTRIBUTESETVALUEAS
     * 
     */
    public String getUseAttributeSetValueAs() {
        return (String) get(PROPERTY_USEATTRIBUTESETVALUEAS);
    }
    /**
     * @see Product#PROPERTY_USEATTRIBUTESETVALUEAS
     * 
     */
    public void setUseAttributeSetValueAs(String useAttributeSetValueAs) {
        set(PROPERTY_USEATTRIBUTESETVALUEAS, useAttributeSetValueAs);
    }

    /**
     * @see Product#PROPERTY_ISQUANTITYVARIABLE
     * 
     */
    public Boolean isQuantityvariable() {
        return (Boolean) get(PROPERTY_ISQUANTITYVARIABLE);
    }
    /**
     * @see Product#PROPERTY_ISQUANTITYVARIABLE
     * 
     */
    public void setQuantityvariable(Boolean isquantityvariable) {
        set(PROPERTY_ISQUANTITYVARIABLE, isquantityvariable);
    }

    /**
     * @see Product#PROPERTY_DEFERREDREVENUE
     * 
     */
    public Boolean isDeferredRevenue() {
        return (Boolean) get(PROPERTY_DEFERREDREVENUE);
    }
    /**
     * @see Product#PROPERTY_DEFERREDREVENUE
     * 
     */
    public void setDeferredRevenue(Boolean deferredRevenue) {
        set(PROPERTY_DEFERREDREVENUE, deferredRevenue);
    }

    /**
     * @see Product#PROPERTY_REVENUEPLANTYPE
     * 
     */
    public String getRevenuePlanType() {
        return (String) get(PROPERTY_REVENUEPLANTYPE);
    }
    /**
     * @see Product#PROPERTY_REVENUEPLANTYPE
     * 
     */
    public void setRevenuePlanType(String revenuePlanType) {
        set(PROPERTY_REVENUEPLANTYPE, revenuePlanType);
    }

    /**
     * @see Product#PROPERTY_PERIODNUMBER
     * 
     */
    public Long getPeriodNumber() {
        return (Long) get(PROPERTY_PERIODNUMBER);
    }
    /**
     * @see Product#PROPERTY_PERIODNUMBER
     * 
     */
    public void setPeriodNumber(Long periodNumber) {
        set(PROPERTY_PERIODNUMBER, periodNumber);
    }

    /**
     * @see Product#PROPERTY_ISDEFERREDEXPENSE
     * 
     */
    public Boolean isDeferredexpense() {
        return (Boolean) get(PROPERTY_ISDEFERREDEXPENSE);
    }
    /**
     * @see Product#PROPERTY_ISDEFERREDEXPENSE
     * 
     */
    public void setDeferredexpense(Boolean isdeferredexpense) {
        set(PROPERTY_ISDEFERREDEXPENSE, isdeferredexpense);
    }

    /**
     * @see Product#PROPERTY_EXPPLANTYPE
     * 
     */
    public String getExpplantype() {
        return (String) get(PROPERTY_EXPPLANTYPE);
    }
    /**
     * @see Product#PROPERTY_EXPPLANTYPE
     * 
     */
    public void setExpplantype(String expplantype) {
        set(PROPERTY_EXPPLANTYPE, expplantype);
    }

    /**
     * @see Product#PROPERTY_PERIODNUMBEREXP
     * 
     */
    public Long getPeriodnumberExp() {
        return (Long) get(PROPERTY_PERIODNUMBEREXP);
    }
    /**
     * @see Product#PROPERTY_PERIODNUMBEREXP
     * 
     */
    public void setPeriodnumberExp(Long periodnumberExp) {
        set(PROPERTY_PERIODNUMBEREXP, periodnumberExp);
    }

    /**
     * @see Product#PROPERTY_DEFAULTPERIOD
     * 
     */
    public String getDefaultPeriod() {
        return (String) get(PROPERTY_DEFAULTPERIOD);
    }
    /**
     * @see Product#PROPERTY_DEFAULTPERIOD
     * 
     */
    public void setDefaultPeriod(String defaultPeriod) {
        set(PROPERTY_DEFAULTPERIOD, defaultPeriod);
    }

    /**
     * @see Product#PROPERTY_DEFAULTPERIODEXPENSE
     * 
     */
    public String getDefaultPeriodExpense() {
        return (String) get(PROPERTY_DEFAULTPERIODEXPENSE);
    }
    /**
     * @see Product#PROPERTY_DEFAULTPERIODEXPENSE
     * 
     */
    public void setDefaultPeriodExpense(String defaultPeriodExpense) {
        set(PROPERTY_DEFAULTPERIODEXPENSE, defaultPeriodExpense);
    }

    /**
     * @see Product#PROPERTY_BOOKUSINGPURCHASEORDERPRICE
     * 
     */
    public Boolean isBookUsingPurchaseOrderPrice() {
        return (Boolean) get(PROPERTY_BOOKUSINGPURCHASEORDERPRICE);
    }
    /**
     * @see Product#PROPERTY_BOOKUSINGPURCHASEORDERPRICE
     * 
     */
    public void setBookUsingPurchaseOrderPrice(Boolean bookUsingPurchaseOrderPrice) {
        set(PROPERTY_BOOKUSINGPURCHASEORDERPRICE, bookUsingPurchaseOrderPrice);
    }

    /**
     * @see Product#PROPERTY_UOMFORWEIGHT
     * 
     */
    public UOM getUOMForWeight() {
        return (UOM) get(PROPERTY_UOMFORWEIGHT);
    }
    /**
     * @see Product#PROPERTY_UOMFORWEIGHT
     * 
     */
    public void setUOMForWeight(UOM uOMForWeight) {
        set(PROPERTY_UOMFORWEIGHT, uOMForWeight);
    }

    /**
     * @see Product#PROPERTY_BRAND
     * @deprecated Target entity {@link Brand} is deprecated.

     */
    @Deprecated
    public Brand getBrand() {
        return (Brand) get(PROPERTY_BRAND);
    }
    /**
     * @see Product#PROPERTY_BRAND
     * @deprecated Target entity {@link Brand} is deprecated.

     */
    @Deprecated
    public void setBrand(Brand brand) {
        set(PROPERTY_BRAND, brand);
    }

    /**
     * @see Product#PROPERTY_ISGENERIC
     * 
     */
    public Boolean isGeneric() {
        return (Boolean) get(PROPERTY_ISGENERIC);
    }
    /**
     * @see Product#PROPERTY_ISGENERIC
     * 
     */
    public void setGeneric(Boolean isGeneric) {
        set(PROPERTY_ISGENERIC, isGeneric);
    }

    /**
     * @see Product#PROPERTY_GENERICPRODUCT
     * 
     */
    public Product getGenericProduct() {
        return (Product) get(PROPERTY_GENERICPRODUCT);
    }
    /**
     * @see Product#PROPERTY_GENERICPRODUCT
     * 
     */
    public void setGenericProduct(Product genericProduct) {
        set(PROPERTY_GENERICPRODUCT, genericProduct);
    }

    /**
     * @see Product#PROPERTY_CREATEVARIANTS
     * 
     */
    public Boolean isCreateVariants() {
        return (Boolean) get(PROPERTY_CREATEVARIANTS);
    }
    /**
     * @see Product#PROPERTY_CREATEVARIANTS
     * 
     */
    public void setCreateVariants(Boolean createVariants) {
        set(PROPERTY_CREATEVARIANTS, createVariants);
    }

    /**
     * @see Product#PROPERTY_CHARACTERISTICDESCRIPTION
     * 
     */
    public String getCharacteristicDescription() {
        return (String) get(PROPERTY_CHARACTERISTICDESCRIPTION);
    }
    /**
     * @see Product#PROPERTY_CHARACTERISTICDESCRIPTION
     * 
     */
    public void setCharacteristicDescription(String characteristicDescription) {
        set(PROPERTY_CHARACTERISTICDESCRIPTION, characteristicDescription);
    }

    /**
     * @see Product#PROPERTY_UPDATEINVARIANTS
     * 
     */
    public Boolean isUpdateInvariants() {
        return (Boolean) get(PROPERTY_UPDATEINVARIANTS);
    }
    /**
     * @see Product#PROPERTY_UPDATEINVARIANTS
     * 
     */
    public void setUpdateInvariants(Boolean updateInvariants) {
        set(PROPERTY_UPDATEINVARIANTS, updateInvariants);
    }

    /**
     * @see Product#PROPERTY_MANAGEVARIANTS
     * 
     */
    public Boolean isManageVariants() {
        return (Boolean) get(PROPERTY_MANAGEVARIANTS);
    }
    /**
     * @see Product#PROPERTY_MANAGEVARIANTS
     * 
     */
    public void setManageVariants(Boolean manageVariants) {
        set(PROPERTY_MANAGEVARIANTS, manageVariants);
    }

    /**
     * @see Product#PROPERTY_INCLUDEDPRODUCTCATEGORIES
     * 
     */
    public String getIncludedProductCategories() {
        return (String) get(PROPERTY_INCLUDEDPRODUCTCATEGORIES);
    }
    /**
     * @see Product#PROPERTY_INCLUDEDPRODUCTCATEGORIES
     * 
     */
    public void setIncludedProductCategories(String includedProductCategories) {
        set(PROPERTY_INCLUDEDPRODUCTCATEGORIES, includedProductCategories);
    }

    /**
     * @see Product#PROPERTY_INCLUDEDPRODUCTS
     * 
     */
    public String getIncludedProducts() {
        return (String) get(PROPERTY_INCLUDEDPRODUCTS);
    }
    /**
     * @see Product#PROPERTY_INCLUDEDPRODUCTS
     * 
     */
    public void setIncludedProducts(String includedProducts) {
        set(PROPERTY_INCLUDEDPRODUCTS, includedProducts);
    }

    /**
     * @see Product#PROPERTY_PRINTDESCRIPTION
     * 
     */
    public Boolean isPrintDescription() {
        return (Boolean) get(PROPERTY_PRINTDESCRIPTION);
    }
    /**
     * @see Product#PROPERTY_PRINTDESCRIPTION
     * 
     */
    public void setPrintDescription(Boolean printDescription) {
        set(PROPERTY_PRINTDESCRIPTION, printDescription);
    }

    /**
     * @see Product#PROPERTY_RETURNABLE
     * 
     */
    public Boolean isReturnable() {
        return (Boolean) get(PROPERTY_RETURNABLE);
    }
    /**
     * @see Product#PROPERTY_RETURNABLE
     * 
     */
    public void setReturnable(Boolean returnable) {
        set(PROPERTY_RETURNABLE, returnable);
    }

    /**
     * @see Product#PROPERTY_OVERDUERETURNDAYS
     * 
     */
    public Long getOverdueReturnDays() {
        return (Long) get(PROPERTY_OVERDUERETURNDAYS);
    }
    /**
     * @see Product#PROPERTY_OVERDUERETURNDAYS
     * 
     */
    public void setOverdueReturnDays(Long overdueReturnDays) {
        set(PROPERTY_OVERDUERETURNDAYS, overdueReturnDays);
    }

    /**
     * @see Product#PROPERTY_ISPRICERULEBASED
     * 
     */
    public Boolean isPricerulebased() {
        return (Boolean) get(PROPERTY_ISPRICERULEBASED);
    }
    /**
     * @see Product#PROPERTY_ISPRICERULEBASED
     * 
     */
    public void setPricerulebased(Boolean ispricerulebased) {
        set(PROPERTY_ISPRICERULEBASED, ispricerulebased);
    }

    /**
     * @see Product#PROPERTY_UNIQUEPERDOCUMENT
     * 
     */
    public Boolean isUniquePerDocument() {
        return (Boolean) get(PROPERTY_UNIQUEPERDOCUMENT);
    }
    /**
     * @see Product#PROPERTY_UNIQUEPERDOCUMENT
     * 
     */
    public void setUniquePerDocument(Boolean uniquePerDocument) {
        set(PROPERTY_UNIQUEPERDOCUMENT, uniquePerDocument);
    }

    /**
     * @see Product#PROPERTY_RELATEPRODCATTOSERVICE
     * 
     */
    public Boolean isRelateprodcattoservice() {
        return (Boolean) get(PROPERTY_RELATEPRODCATTOSERVICE);
    }
    /**
     * @see Product#PROPERTY_RELATEPRODCATTOSERVICE
     * 
     */
    public void setRelateprodcattoservice(Boolean relateprodcattoservice) {
        set(PROPERTY_RELATEPRODCATTOSERVICE, relateprodcattoservice);
    }

    /**
     * @see Product#PROPERTY_RELATEPRODTOSERVICE
     * 
     */
    public Boolean isRelateprodtoservice() {
        return (Boolean) get(PROPERTY_RELATEPRODTOSERVICE);
    }
    /**
     * @see Product#PROPERTY_RELATEPRODTOSERVICE
     * 
     */
    public void setRelateprodtoservice(Boolean relateprodtoservice) {
        set(PROPERTY_RELATEPRODTOSERVICE, relateprodtoservice);
    }

    /**
     * @see Product#PROPERTY_LINKEDTOPRODUCT
     * 
     */
    public Boolean isLinkedToProduct() {
        return (Boolean) get(PROPERTY_LINKEDTOPRODUCT);
    }
    /**
     * @see Product#PROPERTY_LINKEDTOPRODUCT
     * 
     */
    public void setLinkedToProduct(Boolean linkedToProduct) {
        set(PROPERTY_LINKEDTOPRODUCT, linkedToProduct);
    }

    /**
     * @see Product#PROPERTY_QUANTITYRULE
     * 
     */
    public String getQuantityRule() {
        return (String) get(PROPERTY_QUANTITYRULE);
    }
    /**
     * @see Product#PROPERTY_QUANTITYRULE
     * 
     */
    public void setQuantityRule(String quantityRule) {
        set(PROPERTY_QUANTITYRULE, quantityRule);
    }

    /**
     * @see Product#PROPERTY_ALLOWDEFERREDSELL
     * 
     */
    public Boolean isAllowDeferredSell() {
        return (Boolean) get(PROPERTY_ALLOWDEFERREDSELL);
    }
    /**
     * @see Product#PROPERTY_ALLOWDEFERREDSELL
     * 
     */
    public void setAllowDeferredSell(Boolean allowDeferredSell) {
        set(PROPERTY_ALLOWDEFERREDSELL, allowDeferredSell);
    }

    /**
     * @see Product#PROPERTY_DEFERREDSELLMAXDAYS
     * 
     */
    public Long getDeferredSellMaxDays() {
        return (Long) get(PROPERTY_DEFERREDSELLMAXDAYS);
    }
    /**
     * @see Product#PROPERTY_DEFERREDSELLMAXDAYS
     * 
     */
    public void setDeferredSellMaxDays(Long deferredSellMaxDays) {
        set(PROPERTY_DEFERREDSELLMAXDAYS, deferredSellMaxDays);
    }

    /**
     * @see Product#PROPERTY_PRODUCTSTATUS
     * 
     */
    public ProductStatus getProductStatus() {
        return (ProductStatus) get(PROPERTY_PRODUCTSTATUS);
    }
    /**
     * @see Product#PROPERTY_PRODUCTSTATUS
     * 
     */
    public void setProductStatus(ProductStatus productStatus) {
        set(PROPERTY_PRODUCTSTATUS, productStatus);
    }

    /**
     * @see Product#PROPERTY_MODIFYTAX
     * 
     */
    public Boolean isModifyTax() {
        return (Boolean) get(PROPERTY_MODIFYTAX);
    }
    /**
     * @see Product#PROPERTY_MODIFYTAX
     * 
     */
    public void setModifyTax(Boolean modifyTax) {
        set(PROPERTY_MODIFYTAX, modifyTax);
    }

    /**
     * @see Product#PROPERTY_RELATEPRODCATTAXTOSERVICE
     * 
     */
    public Boolean isRelateprodcattaxtoservice() {
        return (Boolean) get(PROPERTY_RELATEPRODCATTAXTOSERVICE);
    }
    /**
     * @see Product#PROPERTY_RELATEPRODCATTAXTOSERVICE
     * 
     */
    public void setRelateprodcattaxtoservice(Boolean relateprodcattaxtoservice) {
        set(PROPERTY_RELATEPRODCATTAXTOSERVICE, relateprodcattaxtoservice);
    }

    /**
     * @see Product#PROPERTY_COPYSERVICEMODIFYTAXCONFIG
     * 
     */
    public Boolean isCopyservicemodifytaxconfig() {
        return (Boolean) get(PROPERTY_COPYSERVICEMODIFYTAXCONFIG);
    }
    /**
     * @see Product#PROPERTY_COPYSERVICEMODIFYTAXCONFIG
     * 
     */
    public void setCopyservicemodifytaxconfig(Boolean copyservicemodifytaxconfig) {
        set(PROPERTY_COPYSERVICEMODIFYTAXCONFIG, copyservicemodifytaxconfig);
    }

    /**
     * Help: {@literal The Purchasing defines the pricing and rules ( pack quantity, UPC, minimum order quantity)
     *       for each product.
     *       The Product Details allows you to display and maintain all products for a selected
     *       Vendor.}<br>
     * @see ApprovedVendor
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ApprovedVendor> getApprovedVendorList() {
      return (List<ApprovedVendor>) get(PROPERTY_APPROVEDVENDORLIST);
    }

    /**
     * Help: {@literal The Purchasing defines the pricing and rules ( pack quantity, UPC, minimum order quantity)
     *       for each product.
     *       The Product Details allows you to display and maintain all products for a selected
     *       Vendor.}<br>
     * @see ApprovedVendor
     * 
     */
    public void setApprovedVendorList(List<ApprovedVendor> approvedVendorList) {
        set(PROPERTY_APPROVEDVENDORLIST, approvedVendorList);
    }

    /**
     * @see LandedCostType
     * 
     */
    @SuppressWarnings("unchecked")
    public List<LandedCostType> getLandedCostTypeList() {
      return (List<LandedCostType>) get(PROPERTY_LANDEDCOSTTYPELIST);
    }

    /**
     * @see LandedCostType
     * 
     */
    public void setLandedCostTypeList(List<LandedCostType> landedCostTypeList) {
        set(PROPERTY_LANDEDCOSTTYPELIST, landedCostTypeList);
    }

    /**
     * Help: {@literal Stores the average costs for purchases and productions}<br>
     * @see Costing
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Costing> getMaterialMgmtCostingList() {
      return (List<Costing>) get(PROPERTY_MATERIALMGMTCOSTINGLIST);
    }

    /**
     * Help: {@literal Stores the average costs for purchases and productions}<br>
     * @see Costing
     * 
     */
    public void setMaterialMgmtCostingList(List<Costing> materialMgmtCostingList) {
        set(PROPERTY_MATERIALMGMTCOSTINGLIST, materialMgmtCostingList);
    }

    /**
     * Help: {@literal Contains all the material transactions for products that are defined as an item and
     *       stocked}<br>
     * @see MaterialTransaction
     * 
     */
    @SuppressWarnings("unchecked")
    public List<MaterialTransaction> getMaterialMgmtMaterialTransactionList() {
      return (List<MaterialTransaction>) get(PROPERTY_MATERIALMGMTMATERIALTRANSACTIONLIST);
    }

    /**
     * Help: {@literal Contains all the material transactions for products that are defined as an item and
     *       stocked}<br>
     * @see MaterialTransaction
     * 
     */
    public void setMaterialMgmtMaterialTransactionList(List<MaterialTransaction> materialMgmtMaterialTransactionList) {
        set(PROPERTY_MATERIALMGMTMATERIALTRANSACTIONLIST, materialMgmtMaterialTransactionList);
    }

    /**
     * Help: {@literal The table defines the individual line items that comprise an Order}<br>
     * @see OrderLine
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OrderLine> getOrderLineList() {
      return (List<OrderLine>) get(PROPERTY_ORDERLINELIST);
    }

    /**
     * Help: {@literal The table defines the individual line items that comprise an Order}<br>
     * @see OrderLine
     * 
     */
    public void setOrderLineList(List<OrderLine> orderLineList) {
        set(PROPERTY_ORDERLINELIST, orderLineList);
    }

    /**
     * Help: {@literal Accounting dimension}<br>
     * @see OrderLineAccountingDimension
     * 
     */
    @SuppressWarnings("unchecked")
    public List<OrderLineAccountingDimension> getOrderLineAccountingDimensionList() {
      return (List<OrderLineAccountingDimension>) get(PROPERTY_ORDERLINEACCOUNTINGDIMENSIONLIST);
    }

    /**
     * Help: {@literal Accounting dimension}<br>
     * @see OrderLineAccountingDimension
     * 
     */
    public void setOrderLineAccountingDimensionList(List<OrderLineAccountingDimension> orderLineAccountingDimensionList) {
        set(PROPERTY_ORDERLINEACCOUNTINGDIMENSIONLIST, orderLineAccountingDimensionList);
    }

    /**
     * Help: {@literal Defines applicable discounts to the defined prices.}<br>
     * @see Discount
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Discount> getPricingDiscountList() {
      return (List<Discount>) get(PROPERTY_PRICINGDISCOUNTLIST);
    }

    /**
     * Help: {@literal Defines applicable discounts to the defined prices.}<br>
     * @see Discount
     * 
     */
    public void setPricingDiscountList(List<Discount> pricingDiscountList) {
        set(PROPERTY_PRICINGDISCOUNTLIST, pricingDiscountList);
    }

    /**
     * Help: {@literal The Pricing displays the List, Standard and Limit prices for each price list a product is
     *       contained in.
     *       The Price List displays the prices for a product based on the selected price list.
     *       The
     *       Pricing Tab displays the List, Standard and Limit prices for each price list a product is contained
     *       in.}<br>
     * @see ProductPrice
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProductPrice> getPricingProductPriceList() {
      return (List<ProductPrice>) get(PROPERTY_PRICINGPRODUCTPRICELIST);
    }

    /**
     * Help: {@literal The Pricing displays the List, Standard and Limit prices for each price list a product is
     *       contained in.
     *       The Price List displays the prices for a product based on the selected price list.
     *       The
     *       Pricing Tab displays the List, Standard and Limit prices for each price list a product is contained
     *       in.}<br>
     * @see ProductPrice
     * 
     */
    public void setPricingProductPriceList(List<ProductPrice> pricingProductPriceList) {
        set(PROPERTY_PRICINGPRODUCTPRICELIST, pricingProductPriceList);
    }

    /**
     * Help: {@literal Defines each product and identifies it for use in price lists and orders. The Location is
     *       the default location when receiving the stored products.}<br>
     * @see Product
     * 
     */
    @SuppressWarnings("unchecked")
    public List<Product> getProductGenericProductList() {
      return (List<Product>) get(PROPERTY_PRODUCTGENERICPRODUCTLIST);
    }

    /**
     * Help: {@literal Defines each product and identifies it for use in price lists and orders. The Location is
     *       the default location when receiving the stored products.}<br>
     * @see Product
     * 
     */
    public void setProductGenericProductList(List<Product> productGenericProductList) {
        set(PROPERTY_PRODUCTGENERICPRODUCTLIST, productGenericProductList);
    }

    /**
     * @see ProductAUM
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProductAUM> getProductAUMList() {
      return (List<ProductAUM>) get(PROPERTY_PRODUCTAUMLIST);
    }

    /**
     * @see ProductAUM
     * 
     */
    public void setProductAUMList(List<ProductAUM> productAUMList) {
        set(PROPERTY_PRODUCTAUMLIST, productAUMList);
    }

    /**
     * Help: {@literal Defines the defaults to use when generating accounting transactions for documents which
     *       contain this product.}<br>
     * @see ProductAccounts
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProductAccounts> getProductAccountsList() {
      return (List<ProductAccounts>) get(PROPERTY_PRODUCTACCOUNTSLIST);
    }

    /**
     * Help: {@literal Defines the defaults to use when generating accounting transactions for documents which
     *       contain this product.}<br>
     * @see ProductAccounts
     * 
     */
    public void setProductAccountsList(List<ProductAccounts> productAccountsList) {
        set(PROPERTY_PRODUCTACCOUNTSLIST, productAccountsList);
    }

    /**
     * Help: {@literal The Bill of Materials defines those products that are generated from other products.  A
     *       Bill of Material (BOM) is one or more Products or BOMs.
     *       
     *       
     *       Available Quantity:
     *       
     *       - Stored BOMs have to
     *       be created via "Production"
     *       
     *       - The available quantity of a no}<br>
     * @see ProductBOM
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProductBOM> getProductBOMList() {
      return (List<ProductBOM>) get(PROPERTY_PRODUCTBOMLIST);
    }

    /**
     * Help: {@literal The Bill of Materials defines those products that are generated from other products.  A
     *       Bill of Material (BOM) is one or more Products or BOMs.
     *       
     *       
     *       Available Quantity:
     *       
     *       - Stored BOMs have to
     *       be created via "Production"
     *       
     *       - The available quantity of a no}<br>
     * @see ProductBOM
     * 
     */
    public void setProductBOMList(List<ProductBOM> productBOMList) {
        set(PROPERTY_PRODUCTBOMLIST, productBOMList);
    }

    /**
     * Help: {@literal The Bill of Materials defines those products that are generated from other products.  A
     *       Bill of Material (BOM) is one or more Products or BOMs.
     *       
     *       
     *       Available Quantity:
     *       
     *       - Stored BOMs have to
     *       be created via "Production"
     *       
     *       - The available quantity of a no}<br>
     * @see ProductBOM
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProductBOM> getProductBOMBOMProductList() {
      return (List<ProductBOM>) get(PROPERTY_PRODUCTBOMBOMPRODUCTLIST);
    }

    /**
     * Help: {@literal The Bill of Materials defines those products that are generated from other products.  A
     *       Bill of Material (BOM) is one or more Products or BOMs.
     *       
     *       
     *       Available Quantity:
     *       
     *       - Stored BOMs have to
     *       be created via "Production"
     *       
     *       - The available quantity of a no}<br>
     * @see ProductBOM
     * 
     */
    public void setProductBOMBOMProductList(List<ProductBOM> productBOMBOMProductList) {
        set(PROPERTY_PRODUCTBOMBOMPRODUCTLIST, productBOMBOMProductList);
    }

    /**
     * @see ProductCharacteristic
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProductCharacteristic> getProductCharacteristicList() {
      return (List<ProductCharacteristic>) get(PROPERTY_PRODUCTCHARACTERISTICLIST);
    }

    /**
     * @see ProductCharacteristic
     * 
     */
    public void setProductCharacteristicList(List<ProductCharacteristic> productCharacteristicList) {
        set(PROPERTY_PRODUCTCHARACTERISTICLIST, productCharacteristicList);
    }

    /**
     * @see ProductCharacteristicValue
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProductCharacteristicValue> getProductCharacteristicValueList() {
      return (List<ProductCharacteristicValue>) get(PROPERTY_PRODUCTCHARACTERISTICVALUELIST);
    }

    /**
     * @see ProductCharacteristicValue
     * 
     */
    public void setProductCharacteristicValueList(List<ProductCharacteristicValue> productCharacteristicValueList) {
        set(PROPERTY_PRODUCTCHARACTERISTICVALUELIST, productCharacteristicValueList);
    }

    /**
     * Help: {@literal Defines details for a product in different organizations.}<br>
     * @see ProductOrg
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProductOrg> getProductOrgList() {
      return (List<ProductOrg>) get(PROPERTY_PRODUCTORGLIST);
    }

    /**
     * Help: {@literal Defines details for a product in different organizations.}<br>
     * @see ProductOrg
     * 
     */
    public void setProductOrgList(List<ProductOrg> productOrgList) {
        set(PROPERTY_PRODUCTORGLIST, productOrgList);
    }

    /**
     * Help: {@literal Contains the available stock including an extra line for each product without stock
     *       information.}<br>
     * @see ProductStockView
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProductStockView> getProductStockViewList() {
      return (List<ProductStockView>) get(PROPERTY_PRODUCTSTOCKVIEWLIST);
    }

    /**
     * Help: {@literal Contains the available stock including an extra line for each product without stock
     *       information.}<br>
     * @see ProductStockView
     * 
     */
    public void setProductStockViewList(List<ProductStockView> productStockViewList) {
        set(PROPERTY_PRODUCTSTOCKVIEWLIST, productStockViewList);
    }

    /**
     * Help: {@literal The Substitute Tab defines products which may be used as a replacement for the selected
     *       product.}<br>
     * @see ProductSubstitute
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProductSubstitute> getProductSubstituteList() {
      return (List<ProductSubstitute>) get(PROPERTY_PRODUCTSUBSTITUTELIST);
    }

    /**
     * Help: {@literal The Substitute Tab defines products which may be used as a replacement for the selected
     *       product.}<br>
     * @see ProductSubstitute
     * 
     */
    public void setProductSubstituteList(List<ProductSubstitute> productSubstituteList) {
        set(PROPERTY_PRODUCTSUBSTITUTELIST, productSubstituteList);
    }

    /**
     * Help: {@literal The translation defines the product name for different languages}<br>
     * @see ProductTrl
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProductTrl> getProductTrlList() {
      return (List<ProductTrl>) get(PROPERTY_PRODUCTTRLLIST);
    }

    /**
     * Help: {@literal The translation defines the product name for different languages}<br>
     * @see ProductTrl
     * 
     */
    public void setProductTrlList(List<ProductTrl> productTrlList) {
        set(PROPERTY_PRODUCTTRLLIST, productTrlList);
    }

    /**
     * Help: {@literal Users can define the unit of the order. This does not necessarily need to be the unit
     *       which is used for the invoice. For instance diskettes are stocked and accounted in units while are
     *       bought in boxes of 10.}<br>
     * @see ProductUOM
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ProductUOM> getProductUOMList() {
      return (List<ProductUOM>) get(PROPERTY_PRODUCTUOMLIST);
    }

    /**
     * Help: {@literal Users can define the unit of the order. This does not necessarily need to be the unit
     *       which is used for the invoice. For instance diskettes are stocked and accounted in units while are
     *       bought in boxes of 10.}<br>
     * @see ProductUOM
     * 
     */
    public void setProductUOMList(List<ProductUOM> productUOMList) {
        set(PROPERTY_PRODUCTUOMLIST, productUOMList);
    }

    /**
     * Help: {@literal The user can define if a product can be related to a product of 'Service' type by creating
     *       a relation between an Order Line of the Service product and another Sales Order Line of the product
     *       included/excluded.}<br>
     * @see ServiceProduct
     * 
     */
    @SuppressWarnings("unchecked")
    public List<ServiceProduct> getServiceProductList() {
      return (List<ServiceProduct>) get(PROPERTY_SERVICEPRODUCTLIST);
    }

    /**
     * Help: {@literal The user can define if a product can be related to a product of 'Service' type by creating
     *       a relation between an Order Line of the Service product and another Sales Order Line of the product
     *       included/excluded.}<br>
     * @see ServiceProduct
     * 
     */
    public void setServiceProductList(List<ServiceProduct> serviceProductList) {
        set(PROPERTY_SERVICEPRODUCTLIST, serviceProductList);
    }

}
