import os
from flakon import create_app
from Flask.ms.view import blueprints

_HERE = os.path.dirname(__file__)
_SETTINGS = os.path.join(_HERE,'..','settings.ini')
app = create_app(blueprints=blueprints, settings=_SETTINGS)
