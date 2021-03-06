/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.lexer.kotlin;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/lexer/kotlin")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class KotlinLexerTestGenerated extends AbstractKotlinLexerTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInKotlin() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/lexer/kotlin"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("compiler/testData/lexer/kotlin/whitespaceCharacters")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class WhitespaceCharacters extends AbstractKotlinLexerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInWhitespaceCharacters() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/lexer/kotlin/whitespaceCharacters"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("compiler/testData/lexer/kotlin/whitespaceCharacters/carriageReturn")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class CarriageReturn extends AbstractKotlinLexerTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInCarriageReturn() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/lexer/kotlin/whitespaceCharacters/carriageReturn"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("carriageReturn.kt")
            public void testCarriageReturn() throws Exception {
                runTest("compiler/testData/lexer/kotlin/whitespaceCharacters/carriageReturn/carriageReturn.kt");
            }

            @TestMetadata("carriageReturnInComments.kt")
            public void testCarriageReturnInComments() throws Exception {
                runTest("compiler/testData/lexer/kotlin/whitespaceCharacters/carriageReturn/carriageReturnInComments.kt");
            }

            @TestMetadata("carriageReturnInStringLiterals.kt")
            public void testCarriageReturnInStringLiterals() throws Exception {
                runTest("compiler/testData/lexer/kotlin/whitespaceCharacters/carriageReturn/carriageReturnInStringLiterals.kt");
            }
        }

        @TestMetadata("compiler/testData/lexer/kotlin/whitespaceCharacters/lineSeparator")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class LineSeparator extends AbstractKotlinLexerTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInLineSeparator() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/lexer/kotlin/whitespaceCharacters/lineSeparator"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("lineSeparator.kt")
            public void testLineSeparator() throws Exception {
                runTest("compiler/testData/lexer/kotlin/whitespaceCharacters/lineSeparator/lineSeparator.kt");
            }

            @TestMetadata("lineSeparatorInComments.kt")
            public void testLineSeparatorInComments() throws Exception {
                runTest("compiler/testData/lexer/kotlin/whitespaceCharacters/lineSeparator/lineSeparatorInComments.kt");
            }

            @TestMetadata("lineSeparatorInStringLiterals.kt")
            public void testLineSeparatorInStringLiterals() throws Exception {
                runTest("compiler/testData/lexer/kotlin/whitespaceCharacters/lineSeparator/lineSeparatorInStringLiterals.kt");
            }
        }

        @TestMetadata("compiler/testData/lexer/kotlin/whitespaceCharacters/nextLine")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class NextLine extends AbstractKotlinLexerTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInNextLine() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/lexer/kotlin/whitespaceCharacters/nextLine"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("nextLine.kt")
            public void testNextLine() throws Exception {
                runTest("compiler/testData/lexer/kotlin/whitespaceCharacters/nextLine/nextLine.kt");
            }

            @TestMetadata("nextLineInComments.kt")
            public void testNextLineInComments() throws Exception {
                runTest("compiler/testData/lexer/kotlin/whitespaceCharacters/nextLine/nextLineInComments.kt");
            }

            @TestMetadata("nextLineInStringLiterals.kt")
            public void testNextLineInStringLiterals() throws Exception {
                runTest("compiler/testData/lexer/kotlin/whitespaceCharacters/nextLine/nextLineInStringLiterals.kt");
            }
        }

        @TestMetadata("compiler/testData/lexer/kotlin/whitespaceCharacters/pageBreak")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class PageBreak extends AbstractKotlinLexerTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInPageBreak() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/lexer/kotlin/whitespaceCharacters/pageBreak"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("pageBreak.kt")
            public void testPageBreak() throws Exception {
                runTest("compiler/testData/lexer/kotlin/whitespaceCharacters/pageBreak/pageBreak.kt");
            }

            @TestMetadata("pageBreakInComments.kt")
            public void testPageBreakInComments() throws Exception {
                runTest("compiler/testData/lexer/kotlin/whitespaceCharacters/pageBreak/pageBreakInComments.kt");
            }

            @TestMetadata("pageBreakInStringLiterals.kt")
            public void testPageBreakInStringLiterals() throws Exception {
                runTest("compiler/testData/lexer/kotlin/whitespaceCharacters/pageBreak/pageBreakInStringLiterals.kt");
            }
        }

        @TestMetadata("compiler/testData/lexer/kotlin/whitespaceCharacters/paragraphSeparator")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class ParagraphSeparator extends AbstractKotlinLexerTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInParagraphSeparator() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/lexer/kotlin/whitespaceCharacters/paragraphSeparator"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("paragraphSeparator.kt")
            public void testParagraphSeparator() throws Exception {
                runTest("compiler/testData/lexer/kotlin/whitespaceCharacters/paragraphSeparator/paragraphSeparator.kt");
            }

            @TestMetadata("paragraphSeparatorInComments.kt")
            public void testParagraphSeparatorInComments() throws Exception {
                runTest("compiler/testData/lexer/kotlin/whitespaceCharacters/paragraphSeparator/paragraphSeparatorInComments.kt");
            }

            @TestMetadata("paragraphSeparatorInStringLiterals.kt")
            public void testParagraphSeparatorInStringLiterals() throws Exception {
                runTest("compiler/testData/lexer/kotlin/whitespaceCharacters/paragraphSeparator/paragraphSeparatorInStringLiterals.kt");
            }
        }

        @TestMetadata("compiler/testData/lexer/kotlin/whitespaceCharacters/verticalTab")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class VerticalTab extends AbstractKotlinLexerTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInVerticalTab() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/lexer/kotlin/whitespaceCharacters/verticalTab"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("verticalTab.kt")
            public void testVerticalTab() throws Exception {
                runTest("compiler/testData/lexer/kotlin/whitespaceCharacters/verticalTab/verticalTab.kt");
            }

            @TestMetadata("verticalTabInComments.kt")
            public void testVerticalTabInComments() throws Exception {
                runTest("compiler/testData/lexer/kotlin/whitespaceCharacters/verticalTab/verticalTabInComments.kt");
            }

            @TestMetadata("verticalTabInStringLiterals.kt")
            public void testVerticalTabInStringLiterals() throws Exception {
                runTest("compiler/testData/lexer/kotlin/whitespaceCharacters/verticalTab/verticalTabInStringLiterals.kt");
            }
        }
    }
}
