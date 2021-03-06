package com.mybatis.generator;

import org.mybatis.generator.api.FullyQualifiedTable;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.AbstractXmlGenerator;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.*;
import org.mybatis.generator.internal.util.messages.Messages;

public class MyXMLMapperGenerator extends AbstractXmlGenerator {

    public MyXMLMapperGenerator() {
    }

    protected XmlElement getSqlMapElement() {
        FullyQualifiedTable table = this.introspectedTable.getFullyQualifiedTable();
        this.progressCallback.startTask(Messages.getString("Progress.12", table.toString()));
        XmlElement answer = new XmlElement("mapper");
        String namespace = this.introspectedTable.getMyBatis3SqlMapNamespace();
        answer.addAttribute(new Attribute("namespace", namespace));
        this.context.getCommentGenerator().addRootComment(answer);
/*        this.addResultMapWithoutBLOBsElement(answer);
        this.addResultMapWithBLOBsElement(answer);
        this.addExampleWhereClauseElement(answer);
        this.addMyBatis3UpdateByExampleWhereClauseElement(answer);
        this.addBaseColumnListElement(answer);
        this.addBlobColumnListElement(answer);
        this.addSelectByExampleWithBLOBsElement(answer);
        this.addSelectByExampleWithoutBLOBsElement(answer);
        this.addSelectByPrimaryKeyElement(answer);
        this.addDeleteByPrimaryKeyElement(answer);
        this.addDeleteByExampleElement(answer);
        this.addInsertElement(answer);
        this.addInsertSelectiveElement(answer);
        this.addCountByExampleElement(answer);
        this.addUpdateByExampleSelectiveElement(answer);
        this.addUpdateByExampleWithBLOBsElement(answer);
        this.addUpdateByExampleWithoutBLOBsElement(answer);
        this.addUpdateByPrimaryKeySelectiveElement(answer);
        this.addUpdateByPrimaryKeyWithBLOBsElement(answer);
        this.addUpdateByPrimaryKeyWithoutBLOBsElement(answer);*/
        addResultMapWithoutBLOBsElement(answer);
        this.addBaseColumnListElement(answer);
        addSelectByPrimaryKeyElement(answer);
        addInsertElement(answer);
        addUpdateByPrimaryKeySelectiveElement(answer);
        addDeleteByPrimaryKeyElement(answer);
//        addUpdateByPrimaryKeyWithoutBLOBsElement(answer);
        return answer;
    }


    protected void addResultMapWithoutBLOBsElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateBaseResultMap()) {
            AbstractXmlElementGenerator elementGenerator = new MyResultMapWithoutBLOBsElementGenerator(false);
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

    protected void addResultMapWithBLOBsElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateResultMapWithBLOBs()) {
            AbstractXmlElementGenerator elementGenerator = new ResultMapWithBLOBsElementGenerator();
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

    protected void addExampleWhereClauseElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateSQLExampleWhereClause()) {
            AbstractXmlElementGenerator elementGenerator = new ExampleWhereClauseElementGenerator(false);
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

    protected void addMyBatis3UpdateByExampleWhereClauseElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateMyBatis3UpdateByExampleWhereClause()) {
            AbstractXmlElementGenerator elementGenerator = new ExampleWhereClauseElementGenerator(true);
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

    protected void addBaseColumnListElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateBaseColumnList()) {
            AbstractXmlElementGenerator elementGenerator = new BaseColumnListElementGenerator();
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

    protected void addBlobColumnListElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateBlobColumnList()) {
            AbstractXmlElementGenerator elementGenerator = new BlobColumnListElementGenerator();
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

    protected void addSelectByExampleWithoutBLOBsElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateSelectByExampleWithoutBLOBs()) {
            AbstractXmlElementGenerator elementGenerator = new SelectByExampleWithoutBLOBsElementGenerator();
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

    protected void addSelectByExampleWithBLOBsElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateSelectByExampleWithBLOBs()) {
            AbstractXmlElementGenerator elementGenerator = new SelectByExampleWithBLOBsElementGenerator();
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

    protected void addSelectByPrimaryKeyElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateSelectByPrimaryKey()) {
            AbstractXmlElementGenerator elementGenerator = new MySelectByPrimaryKeyElementGenerator();
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

    protected void addDeleteByExampleElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateDeleteByExample()) {
            AbstractXmlElementGenerator elementGenerator = new DeleteByExampleElementGenerator();
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

    protected void addDeleteByPrimaryKeyElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateDeleteByPrimaryKey()) {
            AbstractXmlElementGenerator elementGenerator = new MyDeleteByPrimaryKeyElementGenerator(false);
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

    protected void addInsertElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateInsert()) {
            AbstractXmlElementGenerator elementGenerator = new MyInsertElementGenerator(false);
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

    protected void addInsertSelectiveElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateInsertSelective()) {
            AbstractXmlElementGenerator elementGenerator = new MyInsertSelectiveElementGenerator();
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

    protected void addCountByExampleElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateCountByExample()) {
            AbstractXmlElementGenerator elementGenerator = new CountByExampleElementGenerator();
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

    protected void addUpdateByExampleSelectiveElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateUpdateByExampleSelective()) {
            AbstractXmlElementGenerator elementGenerator = new UpdateByExampleSelectiveElementGenerator();
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

    protected void addUpdateByExampleWithBLOBsElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateUpdateByExampleWithBLOBs()) {
            AbstractXmlElementGenerator elementGenerator = new UpdateByExampleWithBLOBsElementGenerator();
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

    protected void addUpdateByExampleWithoutBLOBsElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateUpdateByExampleWithoutBLOBs()) {
            AbstractXmlElementGenerator elementGenerator = new UpdateByExampleWithoutBLOBsElementGenerator();
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

    protected void addUpdateByPrimaryKeySelectiveElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateUpdateByPrimaryKeySelective()) {
            AbstractXmlElementGenerator elementGenerator = new MyUpdateByPrimaryKeySelectiveElementGenerator();
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

    protected void addUpdateByPrimaryKeyWithBLOBsElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateUpdateByPrimaryKeyWithBLOBs()) {
            AbstractXmlElementGenerator elementGenerator = new UpdateByPrimaryKeyWithBLOBsElementGenerator();
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

    protected void addUpdateByPrimaryKeyWithoutBLOBsElement(XmlElement parentElement) {
        if (this.introspectedTable.getRules().generateUpdateByPrimaryKeyWithoutBLOBs()) {
            AbstractXmlElementGenerator elementGenerator = new MyUpdateByPrimaryKeyWithoutBLOBsElementGenerator(false);
            this.initializeAndExecuteGenerator(elementGenerator, parentElement);
        }

    }

    protected void initializeAndExecuteGenerator(AbstractXmlElementGenerator elementGenerator, XmlElement parentElement) {


        elementGenerator.setContext(this.context);
        elementGenerator.setIntrospectedTable(this.introspectedTable);
        elementGenerator.setProgressCallback(this.progressCallback);
        elementGenerator.setWarnings(this.warnings);
        parentElement.addElement(new TextElement(""));
        elementGenerator.addElements(parentElement);

    }

    public Document getDocument() {
        Document document = new Document("-//mybatis.org//DTD Mapper 3.0//EN", "http://mybatis.org/dtd/mybatis-3-mapper.dtd");
        document.setRootElement(this.getSqlMapElement());
        if (!this.context.getPlugins().sqlMapDocumentGenerated(document, this.introspectedTable)) {
            document = null;
        }
        return document;
    }
}
