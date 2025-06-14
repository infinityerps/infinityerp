
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
package org.openbravo.model.ad.utility;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity ADSequence (stored in table AD_Sequence).
 * <br>
 * Help: {@literal The Sequence Tab defines the numeric sequencing to use for documents.  These can also
     *       include an alpha suffix and / or prefix.}
 * <br>
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Sequence extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "AD_Sequence";
    public static final String ENTITY_NAME = "ADSequence";

    /**
     * Property id stored in column AD_Sequence_ID in table AD_Sequence<br>
     * Help: {@literal The Sequence defines the numbering sequence to be used for documents.}
     * 
     */
    public static final String PROPERTY_ID = "id";

    /**
     * Property client stored in column AD_Client_ID in table AD_Sequence 
     * @see ClientEnabled 
     * 
     */
    public static final String PROPERTY_CLIENT = "client";

    /**
     * Property organization stored in column AD_Org_ID in table AD_Sequence 
     * @see OrganizationEnabled 
     * 
     */
    public static final String PROPERTY_ORGANIZATION = "organization";

    /**
     * Property active stored in column IsActive in table AD_Sequence 
     * @see ActiveEnabled 
     * 
     */
    public static final String PROPERTY_ACTIVE = "active";

    /**
     * Property creationDate stored in column Created in table AD_Sequence 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATIONDATE = "creationDate";

    /**
     * Property createdBy stored in column CreatedBy in table AD_Sequence 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_CREATEDBY = "createdBy";

    /**
     * Property updated stored in column Updated in table AD_Sequence 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATED = "updated";

    /**
     * Property updatedBy stored in column UpdatedBy in table AD_Sequence 
     * @see Traceable 
     * 
     */
    public static final String PROPERTY_UPDATEDBY = "updatedBy";

    /**
     * Property name stored in column Name in table AD_Sequence 
     * 
     */
    public static final String PROPERTY_NAME = "name";

    /**
     * Property description stored in column Description in table AD_Sequence<br>
     * Help: {@literal A description is limited to 255 characters.}
     * 
     */
    public static final String PROPERTY_DESCRIPTION = "description";

    /**
     * Property valueFormat stored in column VFormat in table AD_Sequence<br>
     * Help: {@literal Value Format is the format the value will be displayed with.}
     * 
     */
    public static final String PROPERTY_VALUEFORMAT = "valueFormat";

    /**
     * Property autoNumbering stored in column IsAutoSequence in table AD_Sequence<br>
     * Help: {@literal The Auto Numbering checkbox indicates if the system will assign the next number
     *       automatically.}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_AUTONUMBERING = "autoNumbering";

    /**
     * Property incrementBy stored in column IncrementNo in table AD_Sequence<br>
     * Help: {@literal The Increment indicates the number to increment the last document number by to arrive at
     *       the next sequence number}
     * 
     */
    public static final String PROPERTY_INCREMENTBY = "incrementBy";

    /**
     * Property startingNo stored in column StartNo in table AD_Sequence<br>
     * Help: {@literal The Start Number indicates the starting position in the line or field number in the line}
     * 
     */
    public static final String PROPERTY_STARTINGNO = "startingNo";

    /**
     * Property nextAssignedNumber stored in column CurrentNext in table AD_Sequence<br>
     * Help: {@literal The Current Next indicates the next number to use for this document}
     * 
     */
    public static final String PROPERTY_NEXTASSIGNEDNUMBER = "nextAssignedNumber";

    /**
     * Property currentNextSystem stored in column CurrentNextSys in table AD_Sequence<br>
     * Help: {@literal This field is for system use only and should not be modified.}
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public static final String PROPERTY_CURRENTNEXTSYSTEM = "currentNextSystem";

    /**
     * Property usedForRecordID stored in column IsTableID in table AD_Sequence<br>
     * Help: {@literal The Used for Record ID checkbox indicates if the document id will be used as the key to
     *       the record}
     * 
     */
    public static final String PROPERTY_USEDFORRECORDID = "usedForRecordID";

    /**
     * Property prefix stored in column Prefix in table AD_Sequence<br>
     * Help: {@literal The Prefix indicates the characters to print in front of the document number.}
     * 
     */
    public static final String PROPERTY_PREFIX = "prefix";

    /**
     * Property suffix stored in column Suffix in table AD_Sequence<br>
     * Help: {@literal The Suffix indicates the characters to append to the document number.}
     * 
     */
    public static final String PROPERTY_SUFFIX = "suffix";

    /**
     * Property restartSequenceEveryYear stored in column StartNewYear in table AD_Sequence<br>
     * Help: {@literal The Restart Sequence Every Year checkbox indicates that the documents sequencing should
     *       return to the starting number on the first day of the year.}
     * 
     */
    public static final String PROPERTY_RESTARTSEQUENCEEVERYYEAR = "restartSequenceEveryYear";

    /**
     * Property controlDigit stored in column Control_Digit in table AD_Sequence<br>
     * Help: {@literal Defines option None (Default) or Module10 to compute Control Digit for Sequence.}
     * 
     */
    public static final String PROPERTY_CONTROLDIGIT = "controlDigit";

    /**
     * Property calculationMethod stored in column Calculation_Method in table AD_Sequence<br>
     * Help: {@literal Describes the available calculation methods for sequence management:
     *       
     *       "Auto Numbering":
     *       This option reflects the traditional behavior of a sequence being automatically handled by the
     *       system. It automatically uses the Next Assigned Number. This feature replaces and mirrors the legacy
     *       functionality of Auto Numbering flag.
     *       
     *       "Based on Sequence": Select this option to utilize a Base
     *       Sequence. The resulting computation from the Base Sequence will be applied as the number for this
     *       sequence}
     * 
     */
    public static final String PROPERTY_CALCULATIONMETHOD = "calculationMethod";

    /**
     * Property sequenceNumberLength stored in column Sequence_number_length in table AD_Sequence<br>
     * Help: {@literal Defines option for Sequence Number Length as Variable of Fix Length.
     *       1. Computed Sequence
     *       has a variable length.
     *       2. Computed Sequence has a fix length. If the sequence length is short,
     *       computed sequence is append by as many zeros as prefix to match the defined Sequence Length.}
     * 
     */
    public static final String PROPERTY_SEQUENCENUMBERLENGTH = "sequenceNumberLength";

    /**
     * Property baseSequence stored in column Base_Sequence_ID in table AD_Sequence<br>
     * Help: {@literal Defines a base sequence when Calculation Method is defined as "Based on Sequence". The
     *       result of base sequence computation is used as the number for the parent sequence which uses the
     *       base sequence.}
     * 
     */
    public static final String PROPERTY_BASESEQUENCE = "baseSequence";

    /**
     * Property sequenceLength stored in column Sequence_Length in table AD_Sequence<br>
     * Help: {@literal Define the length of the sequence in case Sequence Length Type is Fixed.}
     * 
     */
    public static final String PROPERTY_SEQUENCELENGTH = "sequenceLength";


    public Sequence() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_AUTONUMBERING, false);
        setDefaultValue(PROPERTY_INCREMENTBY, (long) 1);
        setDefaultValue(PROPERTY_STARTINGNO, (long) 1000000);
        setDefaultValue(PROPERTY_NEXTASSIGNEDNUMBER, (long) 1000000);
        setDefaultValue(PROPERTY_CURRENTNEXTSYSTEM, (long) 100);
        setDefaultValue(PROPERTY_USEDFORRECORDID, false);
        setDefaultValue(PROPERTY_RESTARTSEQUENCEEVERYYEAR, false);
        setDefaultValue(PROPERTY_CONTROLDIGIT, "N");
        setDefaultValue(PROPERTY_SEQUENCENUMBERLENGTH, "V");
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    /**
     * @see Sequence#PROPERTY_ID
     * 
     */
    public String getId() {
        return (String) get(PROPERTY_ID);
    }
    /**
     * @see Sequence#PROPERTY_ID
     * 
     */
    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    /**
     * @see Sequence#PROPERTY_CLIENT
     * 
     */
    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }
    /**
     * @see Sequence#PROPERTY_CLIENT
     * 
     */
    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    /**
     * @see Sequence#PROPERTY_ORGANIZATION
     * 
     */
    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }
    /**
     * @see Sequence#PROPERTY_ORGANIZATION
     * 
     */
    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    /**
     * @see Sequence#PROPERTY_ACTIVE
     * 
     */
    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }
    /**
     * @see Sequence#PROPERTY_ACTIVE
     * 
     */
    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    /**
     * @see Sequence#PROPERTY_CREATIONDATE
     * 
     */
    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }
    /**
     * @see Sequence#PROPERTY_CREATIONDATE
     * 
     */
    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    /**
     * @see Sequence#PROPERTY_CREATEDBY
     * 
     */
    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }
    /**
     * @see Sequence#PROPERTY_CREATEDBY
     * 
     */
    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    /**
     * @see Sequence#PROPERTY_UPDATED
     * 
     */
    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }
    /**
     * @see Sequence#PROPERTY_UPDATED
     * 
     */
    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    /**
     * @see Sequence#PROPERTY_UPDATEDBY
     * 
     */
    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }
    /**
     * @see Sequence#PROPERTY_UPDATEDBY
     * 
     */
    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    /**
     * @see Sequence#PROPERTY_NAME
     * 
     */
    public String getName() {
        return (String) get(PROPERTY_NAME);
    }
    /**
     * @see Sequence#PROPERTY_NAME
     * 
     */
    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    /**
     * @see Sequence#PROPERTY_DESCRIPTION
     * 
     */
    public String getDescription() {
        return (String) get(PROPERTY_DESCRIPTION);
    }
    /**
     * @see Sequence#PROPERTY_DESCRIPTION
     * 
     */
    public void setDescription(String description) {
        set(PROPERTY_DESCRIPTION, description);
    }

    /**
     * @see Sequence#PROPERTY_VALUEFORMAT
     * 
     */
    public String getValueFormat() {
        return (String) get(PROPERTY_VALUEFORMAT);
    }
    /**
     * @see Sequence#PROPERTY_VALUEFORMAT
     * 
     */
    public void setValueFormat(String valueFormat) {
        set(PROPERTY_VALUEFORMAT, valueFormat);
    }

    /**
     * @see Sequence#PROPERTY_AUTONUMBERING
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Boolean isAutoNumbering() {
        return (Boolean) get(PROPERTY_AUTONUMBERING);
    }
    /**
     * @see Sequence#PROPERTY_AUTONUMBERING
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setAutoNumbering(Boolean autoNumbering) {
        set(PROPERTY_AUTONUMBERING, autoNumbering);
    }

    /**
     * @see Sequence#PROPERTY_INCREMENTBY
     * 
     */
    public Long getIncrementBy() {
        return (Long) get(PROPERTY_INCREMENTBY);
    }
    /**
     * @see Sequence#PROPERTY_INCREMENTBY
     * 
     */
    public void setIncrementBy(Long incrementBy) {
        set(PROPERTY_INCREMENTBY, incrementBy);
    }

    /**
     * @see Sequence#PROPERTY_STARTINGNO
     * 
     */
    public Long getStartingNo() {
        return (Long) get(PROPERTY_STARTINGNO);
    }
    /**
     * @see Sequence#PROPERTY_STARTINGNO
     * 
     */
    public void setStartingNo(Long startingNo) {
        set(PROPERTY_STARTINGNO, startingNo);
    }

    /**
     * @see Sequence#PROPERTY_NEXTASSIGNEDNUMBER
     * 
     */
    public Long getNextAssignedNumber() {
        return (Long) get(PROPERTY_NEXTASSIGNEDNUMBER);
    }
    /**
     * @see Sequence#PROPERTY_NEXTASSIGNEDNUMBER
     * 
     */
    public void setNextAssignedNumber(Long nextAssignedNumber) {
        set(PROPERTY_NEXTASSIGNEDNUMBER, nextAssignedNumber);
    }

    /**
     * @see Sequence#PROPERTY_CURRENTNEXTSYSTEM
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public Long getCurrentNextSystem() {
        return (Long) get(PROPERTY_CURRENTNEXTSYSTEM);
    }
    /**
     * @see Sequence#PROPERTY_CURRENTNEXTSYSTEM
     * @deprecated Property marked as deprecated on field Development Status

     */
    @Deprecated
    public void setCurrentNextSystem(Long currentNextSystem) {
        set(PROPERTY_CURRENTNEXTSYSTEM, currentNextSystem);
    }

    /**
     * @see Sequence#PROPERTY_USEDFORRECORDID
     * 
     */
    public Boolean isUsedForRecordID() {
        return (Boolean) get(PROPERTY_USEDFORRECORDID);
    }
    /**
     * @see Sequence#PROPERTY_USEDFORRECORDID
     * 
     */
    public void setUsedForRecordID(Boolean usedForRecordID) {
        set(PROPERTY_USEDFORRECORDID, usedForRecordID);
    }

    /**
     * @see Sequence#PROPERTY_PREFIX
     * 
     */
    public String getPrefix() {
        return (String) get(PROPERTY_PREFIX);
    }
    /**
     * @see Sequence#PROPERTY_PREFIX
     * 
     */
    public void setPrefix(String prefix) {
        set(PROPERTY_PREFIX, prefix);
    }

    /**
     * @see Sequence#PROPERTY_SUFFIX
     * 
     */
    public String getSuffix() {
        return (String) get(PROPERTY_SUFFIX);
    }
    /**
     * @see Sequence#PROPERTY_SUFFIX
     * 
     */
    public void setSuffix(String suffix) {
        set(PROPERTY_SUFFIX, suffix);
    }

    /**
     * @see Sequence#PROPERTY_RESTARTSEQUENCEEVERYYEAR
     * 
     */
    public Boolean isRestartSequenceEveryYear() {
        return (Boolean) get(PROPERTY_RESTARTSEQUENCEEVERYYEAR);
    }
    /**
     * @see Sequence#PROPERTY_RESTARTSEQUENCEEVERYYEAR
     * 
     */
    public void setRestartSequenceEveryYear(Boolean restartSequenceEveryYear) {
        set(PROPERTY_RESTARTSEQUENCEEVERYYEAR, restartSequenceEveryYear);
    }

    /**
     * @see Sequence#PROPERTY_CONTROLDIGIT
     * 
     */
    public String getControlDigit() {
        return (String) get(PROPERTY_CONTROLDIGIT);
    }
    /**
     * @see Sequence#PROPERTY_CONTROLDIGIT
     * 
     */
    public void setControlDigit(String controlDigit) {
        set(PROPERTY_CONTROLDIGIT, controlDigit);
    }

    /**
     * @see Sequence#PROPERTY_CALCULATIONMETHOD
     * 
     */
    public String getCalculationMethod() {
        return (String) get(PROPERTY_CALCULATIONMETHOD);
    }
    /**
     * @see Sequence#PROPERTY_CALCULATIONMETHOD
     * 
     */
    public void setCalculationMethod(String calculationMethod) {
        set(PROPERTY_CALCULATIONMETHOD, calculationMethod);
    }

    /**
     * @see Sequence#PROPERTY_SEQUENCENUMBERLENGTH
     * 
     */
    public String getSequenceNumberLength() {
        return (String) get(PROPERTY_SEQUENCENUMBERLENGTH);
    }
    /**
     * @see Sequence#PROPERTY_SEQUENCENUMBERLENGTH
     * 
     */
    public void setSequenceNumberLength(String sequenceNumberLength) {
        set(PROPERTY_SEQUENCENUMBERLENGTH, sequenceNumberLength);
    }

    /**
     * @see Sequence#PROPERTY_BASESEQUENCE
     * 
     */
    public Sequence getBaseSequence() {
        return (Sequence) get(PROPERTY_BASESEQUENCE);
    }
    /**
     * @see Sequence#PROPERTY_BASESEQUENCE
     * 
     */
    public void setBaseSequence(Sequence baseSequence) {
        set(PROPERTY_BASESEQUENCE, baseSequence);
    }

    /**
     * @see Sequence#PROPERTY_SEQUENCELENGTH
     * 
     */
    public Long getSequenceLength() {
        return (Long) get(PROPERTY_SEQUENCELENGTH);
    }
    /**
     * @see Sequence#PROPERTY_SEQUENCELENGTH
     * 
     */
    public void setSequenceLength(Long sequenceLength) {
        set(PROPERTY_SEQUENCELENGTH, sequenceLength);
    }

}
