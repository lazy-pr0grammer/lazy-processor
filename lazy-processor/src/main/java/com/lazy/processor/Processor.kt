package com.lazy.processor

import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSFunctionDeclaration
import com.google.devtools.ksp.symbol.KSPropertyDeclaration

/**
 * Created by Anindya Das on 12/2/23 12:25 AM
 **/
class Processor(private val logger: KSPLogger) : SymbolProcessor {
    override fun process(resolver: Resolver): List<KSAnnotated> {
        processClasses(resolver)
        processFunctions(resolver)
        processProperties(resolver)
        return emptyList()
    }

    private fun processClasses(resolver: Resolver) {
        val annotatedClasses = resolver.getSymbolsWithAnnotation("com.lazy.processor.Private")

        for (annotatedClass in annotatedClasses) {
            if (annotatedClass !is KSClassDeclaration) {
                continue
            }

            val className = annotatedClass.simpleName.asString()
            logger.error("Class $className has @Private annotation")
        }
    }

    private fun processFunctions(resolver: Resolver) {
        val annotatedFunctions = resolver.getSymbolsWithAnnotation("com.lazy.processor.Private")

        for (annotatedFunction in annotatedFunctions) {
            if (annotatedFunction !is KSFunctionDeclaration) {
                continue
            }

            val functionName = annotatedFunction.simpleName.asString()
            logger.error("Function $functionName has @Private annotation")
        }
    }

    private fun processProperties(resolver: Resolver) {
        val annotatedProperties = resolver.getSymbolsWithAnnotation("com.lazy.processor.Private")

        for (annotatedProperty in annotatedProperties) {
            if (annotatedProperty !is KSPropertyDeclaration) {
                continue
            }

            val propertyName = annotatedProperty.simpleName.asString()
            logger.error("Property $propertyName has @Private annotation")
        }
    }

}
